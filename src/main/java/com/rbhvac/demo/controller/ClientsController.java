package com.rbhvac.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.services.ClientsServices;

@RestController
@CrossOrigin("*")
@RequestMapping("/clients")
public class ClientsController {
    
    @Autowired
    private ClientsServices clients;
    
    
    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Clients> findaAll() {
        
        return clients.findaAll();
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Clients findById (
        @PathVariable(value="id") Long id)
     {
        return clients.findById(id);
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Clients create(
        @RequestBody Clients client 
    ) {
       
        return clients.create(client);
    }

    @PutMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Clients update(
        @RequestBody Clients client 
    ) {
       
        return clients.update(client);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(
            @PathVariable(value = "id") Long id)
     {
        clients.delete(id);

        return ResponseEntity.noContent().build();
    }

}
