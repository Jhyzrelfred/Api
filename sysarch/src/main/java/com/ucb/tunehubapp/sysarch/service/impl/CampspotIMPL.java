package com.ucb.tunehubapp.sysarch.service.impl;

import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import com.ucb.tunehubapp.sysarch.dto.CampspotDTO;
import com.ucb.tunehubapp.sysarch.repo.CampspotRepo;
import com.ucb.tunehubapp.sysarch.service.CampspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampspotIMPL implements CampspotService {


    @Autowired
    private CampspotRepo campspotRepo;


    @Override
    public String addCampspot(CampspotDTO campspotDTO) {
        if (campnameExists(campspotDTO.getaCampName())) {
            return "Camp already exists";
        }

        Campspot campspot = new Campspot(
                campspotDTO.getaCampName(),
                campspotDTO.getbLocation(),
                campspotDTO.getcAmenities(),
                campspotDTO.getdActivities(),
                campspotDTO.geteAccomodation(),
                campspotDTO.getfAccessibilities(),
                campspotDTO.gethTransportation(),
                campspotDTO.getgNetwork()
                );
        campspotRepo.save(campspot);
        return campspot.getaCampName();
    }

    @Override
    public List<Campspot> getAllCampspots() {
        return List.of();
    }

    @Override
    public Campspot saveCampspot(Campspot campspot) {
        return null;
    }

    @Override
    public boolean campspotExists(String campspotName) {
        return false;
    }

    @Override
    public boolean campnameExists(String aCampName) {
        return campspotRepo.findByaCampName(aCampName).isPresent();
    }
}
