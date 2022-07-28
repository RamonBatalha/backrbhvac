package com.rbhvac.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.services.ClientsServices;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    
    @Autowired
    private ClientsServices clients;
    
    @RequestMapping(value = "/{id}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)

    public Clients findById (
        @PathVariable(value="id") String id)
     {
        return clients.findById(id);
    }
    
    @RequestMapping (
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Clients> findaAll() {

        return clients.findaAll();
    }

}
