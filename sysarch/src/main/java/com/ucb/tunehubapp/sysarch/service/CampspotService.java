package com.ucb.tunehubapp.sysarch.service;

import com.ucb.tunehubapp.sysarch.api.model.Campspot;
import com.ucb.tunehubapp.sysarch.dto.CampspotDTO;
import com.ucb.tunehubapp.sysarch.dto.PersonDTO;

import java.util.List;

public interface CampspotService {
    String addCampspot(CampspotDTO campspotDTO);
    List<Campspot> getAllCampspots();
    Campspot saveCampspot(Campspot campspot);
    boolean campspotExists(String campspotName);

    boolean campnameExists(String aCampName);
}
