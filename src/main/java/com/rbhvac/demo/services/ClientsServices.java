package com.rbhvac.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.rbhvac.demo.model.Clients;



@Service
public class ClientsServices {
     
    private static final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(ClientsServices.class.getName());

    public Clients findById(String id) {

        logger.info("Finding one Client");

        Clients client = new Clients();
        client.setId(counter.incrementAndGet());
        client.setNome("Ramon da Silva");
        client.setEndereço("Rua doutor severiano, 568, Santa Helena");
        client.setCpf(1415161615);
        client.setTelefone(849874151);
        client.setEmail("rmoamdoa@fmmomso.com");
        client.setObservacao("Observação");
        return client;
    }

    public List<Clients> findaAll() {
        logger.info("Finding All Clients");

        List<Clients> clients = new ArrayList<> ();

        for(int i = 0; i<8 ; i++) {
            Clients client = mockClients(i);
            clients.add(client);
        }

        return clients;
    }

    private Clients mockClients (int i) {

        Clients client = new Clients();

        client.setId(counter.incrementAndGet());
        client.setNome("Person name " + i);
        client.setEndereço("endereço " + i);
        client.setCpf(1415161615);
        client.setTelefone(849874151);
        client.setEmail("cliente@fmmomso.com");
        client.setObservacao("Observação" + i);
        return client;
    }

    public Clients create(Clients client) {
        logger.info("Creating one client");

        return client;
    }

    public Clients update(Clients client) {
        logger.info("update one client");

        return client;
    }

    public void delete(String id) {
        logger.info("Delete one client");

    }




}
