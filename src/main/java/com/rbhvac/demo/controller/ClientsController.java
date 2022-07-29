package com.rbhvac.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
        @PathVariable(value="id") Long id)
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

    @RequestMapping(
        method = RequestMethod.POST,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Clients create(
        @RequestBody Clients client 
    ) {
       
        return clients.create(client);
    }

    @RequestMapping(
        method = RequestMethod.PUT,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Clients update(
        @RequestBody Clients client 
    ) {
       
        return clients.update(client);
    }

    @RequestMapping(value="/{id}",
        method = RequestMethod.DELETE
    )
    public void delete(
            @PathVariable(value = "id") Long id)
     {
       
        clients.delete(id);
    }

}
