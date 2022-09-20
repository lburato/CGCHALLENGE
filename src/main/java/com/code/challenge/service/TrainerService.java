package com.code.challenge.service;

import com.code.challenge.entity.Trainer;
import com.code.challenge.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;

@Service
public class TrainerService {

    @Autowired
    TrainerRepository trainerRepository;

    public Optional<Trainer> findById(final String id) {
        return trainerRepository.findById(id);
    }

    @Transactional
    public String save(final Map<String, String> request) {
        // TODO Implement data validation

         Trainer t = Trainer.builder()
                .id(request.get("id"))
                .email(request.get("email"))
                .phone(request.get("phone"))
                .firstName(request.get("first_name"))
                .lastName(request.get("last_name"))
                .build();

        trainerRepository.save(t);
        return "Operation Success.";
    }

}
