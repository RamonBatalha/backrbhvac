package com.rbhvac.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbhvac.demo.dataVoV1.ClientsVO;
import com.rbhvac.demo.exceptions.ResourceNotFoundException;
import com.rbhvac.demo.mapper.DozerMapper;
import com.rbhvac.demo.model.Clients;
import com.rbhvac.demo.repository.ClientsRepository;



@Service
public class ClientsServices {
     
    @Autowired
    ClientsRepository repository;

    private Logger logger = Logger.getLogger(ClientsServices.class.getName());

    public List<ClientsVO> findaAll() {
        logger.info("Finding All Clients");

        return DozerMapper.parseListObject(repository.findAll(), ClientsVO.class) ;
    }


    public ClientsVO findById(Long id) {

        logger.info("Finding one Client");

      var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

      return DozerMapper.parseObject(entity, ClientsVO.class) ;
    }


    public ClientsVO create(ClientsVO client) {
        logger.info("Creating one client");
        
        var entity = DozerMapper.parseObject(client, Clients.class);

        var vo = DozerMapper.parseObject(repository.save(entity), ClientsVO.class);

        return vo;
    }

    public ClientsVO update(ClientsVO client) {
        logger.info("update one client");

        var entity = repository.findById(client.getId())
        .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setNome(client.getNome());
        entity.setEndereço(client.getEndereço());
        entity.setEmail(client.getEmail());
        entity.setCpf(client.getCpf());
        entity.setTelefone(client.getTelefone());
        entity.setObservacao(client.getObservacao());

        var vo = DozerMapper.parseObject(repository.save(entity), ClientsVO.class);

        return vo;
    }

    public void delete(Long id) {
        logger.info("Delete one client");

       var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

        repository.delete(entity);

    }




}
