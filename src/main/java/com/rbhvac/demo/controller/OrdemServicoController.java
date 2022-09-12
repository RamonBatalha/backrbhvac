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

// import com.rbhvac.demo.dataVoV1.OrdemServicoVO;
import com.rbhvac.demo.model.OrdemServico;
import com.rbhvac.demo.services.OrdemServicoServices;


@RestController
@CrossOrigin("*")
@RequestMapping("api/os/v1")
public class OrdemServicoController {
    
    @Autowired
    private OrdemServicoServices services;
    
    
    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrdemServico> findaAll() {
        
        return services.findaAll();
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OrdemServico findById (
        @PathVariable(value="id") Long id)
     {
        return services.findById(id);
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrdemServico create(
        @RequestBody OrdemServico os 
    ) {
       
        return services.create(os);
    }

    @PutMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrdemServico update(
        @RequestBody OrdemServico os
    ) {
       
        return services.update(os);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(
            @PathVariable(value = "id") Long id)
     {
        services.delete(id);

        return ResponseEntity.noContent().build();
    }

}
