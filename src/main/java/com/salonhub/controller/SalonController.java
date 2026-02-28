package com.salonhub.controller;

import com.salonhub.entity.Salon;
import com.salonhub.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salons")
public class SalonController {

    @Autowired
    private SalonService salonService;

    @PostMapping
    public ResponseEntity<Salon> createSalon(@RequestBody Salon salon) {
        Salon saved = salonService.createSalon(salon);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Salon>> getAllSalons() {
        return ResponseEntity.ok(salonService.getAllSalons());
    }
}