package com.code.challenge.controller;

import com.code.challenge.entity.Trainer;
import com.code.challenge.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/trainer")
public class TrainerController {
    @Autowired
    TrainerService TrainerService;

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getFind(@PathVariable("id") final String id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(TrainerService.findById(id).orElseThrow());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postTrainerById(@RequestBody final Map<String, String> request) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(TrainerService.save(request));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
