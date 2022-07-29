package com.rbhvac.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbhvac.demo.exceptions.ResourceNotFoundException;
import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.repository.ClientsRepository;



@Service
public class ClientsServices {
     
    @Autowired
    ClientsRepository repository;

    private Logger logger = Logger.getLogger(ClientsServices.class.getName());

    public Clients findById(Long id) {

        logger.info("Finding one Client");

      return repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
    }

    public List<Clients> findaAll() {
        logger.info("Finding All Clients");

        return repository.findAll();
    }

    

    public Clients create(Clients client) {
        logger.info("Creating one client");

        return repository.save(client);
    }

    public Clients update(Clients client) {
        logger.info("update one client");

        Clients entity = repository.findById(client.getId())
        .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setNome(client.getNome());
        entity.setEndereço(client.getEndereço());
        entity.setEmail(client.getEmail());
        entity.setCpf(client.getCpf());
        entity.setTelefone(client.getTelefone());
        entity.setObservacao(client.getObservacao());

        return repository.save(client);
    }

    public void delete(Long id) {
        logger.info("Delete one client");

       Clients entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

        repository.delete(entity);

    }




}
