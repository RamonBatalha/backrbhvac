package com.rbhvac.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rbhvac.demo.dataVoV1.ColaboradorVO;
import com.rbhvac.demo.exceptions.ResourceNotFoundException;
import com.rbhvac.demo.mapper.DozerMapper;
import com.rbhvac.demo.model.Colaborador;
import com.rbhvac.demo.repository.ColaboradorRepository;



@Service
public class ColaboradorServices {
     
    @Autowired
    ColaboradorRepository repository;

    private Logger logger = Logger.getLogger(ColaboradorServices.class.getName());

    public List<ColaboradorVO> findaAll() {
        logger.info("Finding All Colaboradores");

        return DozerMapper.parseListObject(repository.findAll(), ColaboradorVO.class) ;
    }


    public ColaboradorVO findById(Long id) {

        logger.info("Finding one Colaborador");

      var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

      return DozerMapper.parseObject(entity, ColaboradorVO.class) ;
    }


    public ColaboradorVO create(ColaboradorVO colaborador) {
        logger.info("Creating one colaborador");
        
        var entity = DozerMapper.parseObject(colaborador, Colaborador.class);

        var vo = DozerMapper.parseObject(repository.save(entity), ColaboradorVO.class);

        return vo;
    }

    public ColaboradorVO update(ColaboradorVO colaborador) {
        logger.info("update one colaborador");

        var entity = repository.findById(colaborador.getId())
        .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setNome(colaborador.getNome());
        entity.setEndereço(colaborador.getEndereço());
        entity.setCargo(colaborador.getCargo());
        entity.setRemuneraçao(colaborador.getRemuneraçao());
        entity.setEmail(colaborador.getEmail());
        entity.setCpf(colaborador.getCpf());
        entity.setTelefone(colaborador.getTelefone());
        

        var vo = DozerMapper.parseObject(repository.save(entity), ColaboradorVO.class);

        return vo;
    }

    public void delete(Long id) {
        logger.info("Delete one client");

       var entity = repository.findById(id)
      .orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));

        repository.delete(entity);

    }




}
