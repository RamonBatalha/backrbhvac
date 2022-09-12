package com.rbhvac.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rbhvac.demo.exceptions.ResourceNotFoundException;
import com.rbhvac.demo.mapper.DozerMapper;
import com.rbhvac.demo.model.OrdemServico;
import com.rbhvac.demo.repository.OrdemServicoRepository;



@Service
public class OrdemServicoServices {
     
    @Autowired
    OrdemServicoRepository repository;

    private Logger logger = Logger.getLogger(OrdemServicoServices.class.getName());

    public List<OrdemServico> findaAll() {
        logger.info("Finding All Ordens de Serviço");

        return DozerMapper.parseListObject(repository.findAll(), OrdemServico.class) ;
    }


    public OrdemServico findById(Long id) {

        logger.info("Finding one Ordem de Serviço");

      var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

      return DozerMapper.parseObject(entity, OrdemServico.class) ;
    }


    public OrdemServico create(OrdemServico os) {
        logger.info("Creating one Ordem de Serviço");
        
        var entity = DozerMapper.parseObject(os, OrdemServico.class);

        var vo = DozerMapper.parseObject(repository.save(entity), OrdemServico.class);

        return vo;
    }

    public OrdemServico update(OrdemServico os) {
        logger.info("update one Ordem de Serviço");

        var entity = repository.findById(os.getId())
        .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        
        entity.setServico(os.getServico());
        entity.setValor(os.getValor());
        entity.setDataabertura(os.getDataabertura());
        entity.setStatus(os.getStatus());
        entity.setClients(os.getClients());
        entity.setColaborador(os.getColaborador());
       

        var vo = DozerMapper.parseObject(repository.save(entity), OrdemServico.class);

        return vo;
    }

    public void delete(Long id) {
        logger.info("Delete one Ordem de Serviço");

       var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

        repository.delete(entity);

    }




}
