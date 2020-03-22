package com.dairyair.dairyairmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairyair.dairyairmvc.entities.Client;
import com.dairyair.dairyairmvc.repositories.ClientRepository;

@RestController
@RequestMapping(path = "v1/clients")
public class ClientJSONController {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientJSONController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    
    // localhost:8080/v1/clients/
    @GetMapping(path="/", produces = "application/json")
 	public Iterable<Client> clientsForm( Model model) {
        return clientRepository.findAll();
 	}
}
