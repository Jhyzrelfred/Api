package com.ucb.tunehubapp.sysarch.api.controller;

import com.ucb.tunehubapp.sysarch.api.Response;
import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import com.ucb.tunehubapp.sysarch.api.model.Login;
import com.ucb.tunehubapp.sysarch.api.model.Person;
import com.ucb.tunehubapp.sysarch.dto.PersonDTO;
import com.ucb.tunehubapp.sysarch.repo.CampspotRepo;
import com.ucb.tunehubapp.sysarch.repo.PersonRepo;
import com.ucb.tunehubapp.sysarch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class SignupLogin {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepo personRepo;


    @PostMapping("/SignUp")
    public ResponseEntity<Response> SignUp(@RequestBody PersonDTO personDTO) {
        if (personService.personExists(personDTO.getEmail())) {
            Response response = new Response("User already exists", null);
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }

        String id = personService.addPerson(personDTO);
        if (id != null) {
            Response response = new Response("User successfully registered", id);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } else {
            Response response = new Response("User registration failed", null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

     @PostMapping("/Login")
    public ResponseEntity<Response> Login(@RequestBody LoginDTO loginDTO) {
        if (loginDTO.getName() == null || loginDTO.getName().isEmpty() ||
                loginDTO.getEmail() == null || loginDTO.getEmail().isEmpty() ||
                loginDTO.getPassword() == null || loginDTO.getPassword().isEmpty()) {
            Response response = new Response("Either of the parameters is null or empty", null);
            return ResponseEntity.badRequest().body(response);
        }

        Optional<Person> person = personService.getPerson(loginDTO.getName(),loginDTO.getEmail(),loginDTO.getPassword() );
        if (person.isPresent()) {
            Response response = new Response("Login successful", person.get());
            return ResponseEntity.ok(response);
        } else {
            Response response = new Response("Invalid email or password", null);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }

    @GetMapping("/getUsers")
    public List<Person> getAllUsers() {

        return personRepo.findAll();
    }


//    @PostMapping(path = "/save")
//    public String savePerson(@RequestBody PersonDTO personDTO) {
//
//    String id = personService.addPerson(personDTO);
//    return id;
//    }
//    @PostMapping("/signup")
//    public ResponseEntity<String> savePerson(@RequestParam String name,@RequestParam String email,@RequestParam String password) {
//        String registrationMessage = personService.registerUser(user.getUsername(), user.getPassword());
//
//        Map<String, String> response = new HashMap<>();
//        if (registrationMessage.equals("user already exists")) {
//            response.put("error", registrationMessage);
//            return new ResponseEntity<>(response, HttpStatus.CONFLICT);
//        } else if (registrationMessage.equals("successful registration")) {
//            response.put("message", registrationMessage);
//            return new ResponseEntity<>(response, HttpStatus.CREATED);
//        } else {
//            response.put("error", registrationMessage);
//            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//        }
//    }
}
