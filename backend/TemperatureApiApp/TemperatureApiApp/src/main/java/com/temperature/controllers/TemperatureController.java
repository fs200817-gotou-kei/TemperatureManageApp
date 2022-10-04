package com.temperature.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temperature.models.Temperature;

@RestController
@RequestMapping("api/v1/temperatures")
public class TemperatureController {

    @GetMapping("/")
    public List<Temperature> getAllTemperature() {
        return null;
    }

    @PostMapping("/")
    public void createTemperature(Temperature temperature) {

    }

    @GetMapping("/:id")
    public Temperature getTemperatureByyId() {
        return null;
    }

    @PutMapping("/:id")
    public void updateTemperature() {

    }

    @DeleteMapping("/:id")
    public void deleteTemperature() {

    }

    @GetMapping("/date/from/:strFrom/to/:strTo")
    public List<Temperature> getTemperature() {
        return null;
    }
}
