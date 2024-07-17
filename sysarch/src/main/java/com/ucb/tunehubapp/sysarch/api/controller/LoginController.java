package com.ucb.tunehubapp.sysarch.api.controller;

import com.ucb.tunehubapp.sysarch.api.Response;
import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import com.ucb.tunehubapp.sysarch.api.model.Login;
import com.ucb.tunehubapp.sysarch.api.model.User;
import com.ucb.tunehubapp.sysarch.dto.SignUpRequest;
import com.ucb.tunehubapp.sysarch.service.LoginService;
import com.ucb.tunehubapp.sysarch.service.UserService;
import io.swagger.annotations.ApiResponse;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class LoginController {



//    @PostMapping("/signup")
//    public ResponseEntity<Response> signup(@RequestBody SignUpRequest signUpRequest ) {
//        Response response = loginService.signUp(signUpRequest);
//        return ResponseEntity.badRequest().body(response);
//    }
//
//    public Login setLogin(@RequestParam String email){
//        Optional<Login> login = LoginService.setLogin(id);
//        if (login.isPresent()){
//            return (User) user.get();
//        }
//        return null;
//    }






}
