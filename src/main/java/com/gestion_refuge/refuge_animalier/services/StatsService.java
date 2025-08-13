package com.gestion_refuge.refuge_animalier.services;

import com.gestion_refuge.refuge_animalier.repositories.AdoptionRepository;
import com.gestion_refuge.refuge_animalier.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StatsService {

    @Autowired
    private AnimalRepository animalRepo;
    @Autowired
    private AdoptionRepository adoptionRepo;

    public List<Map<String, Object>> getArrivalsVsAdoptions() {
        Map<Integer, Long> arrivals = new HashMap<>();
        for (Object[] row : animalRepo.countArrivalsByMonth()) {
            arrivals.put(((Number) row[0]).intValue(), ((Number) row[1]).longValue());
        }

        Map<Integer, Long> adoptions = new HashMap<>();
        for (Object[] row : adoptionRepo.countAdoptionsByMonth()) {
            adoptions.put(((Number) row[0]).intValue(), ((Number) row[1]).longValue());
        }

        List<Map<String, Object>> result = new ArrayList<>();
        int currentMonth = LocalDate.now().getMonthValue();

        for (int month = 1; month <= currentMonth; month++) {
            Map<String, Object> entry = new HashMap<>();
            entry.put("month", Month.of(month).name().substring(0, 3));
            entry.put("arrivals", arrivals.getOrDefault(month, 0L));
            entry.put("adoptions", adoptions.getOrDefault(month, 0L));
            result.add(entry);
        }
        return result;
    }
}

