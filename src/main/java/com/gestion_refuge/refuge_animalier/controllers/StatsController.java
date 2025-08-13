package com.gestion_refuge.refuge_animalier.controllers;

import com.gestion_refuge.refuge_animalier.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stats")
public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping("/arrivals-vs-adoptions")
    public List<Map<String, Object>> getArrivalsVsAdoptions() {
        return statsService.getArrivalsVsAdoptions();
    }
}

