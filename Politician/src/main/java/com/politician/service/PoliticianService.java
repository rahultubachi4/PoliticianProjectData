package com.politician.service;

import com.politician.entity.Politician;
import com.politician.repository.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoliticianService {

    @Autowired
    private PoliticianRepository repo;

    public Politician savePolitician(Politician politician) {
        return repo.save(politician);
    }


    public List<Politician> findAll() {
        return repo.findAll();
    }


    public Politician findById(int id) {
        Optional<Politician> politician = repo.findById(id);

        if (politician.isEmpty()) {
            throw new RuntimeException("Politician not found");
        }
        return politician.get();
    }


    public Politician updatePolitician(Politician politician) {
        Optional<Politician> politicianUp = repo.findById(politician.getId());

        if (politicianUp.isEmpty()) {
            throw new RuntimeException("Politician not found");
        }

        Politician exist = politicianUp.get();
        exist.setPoliticianname(politician.getPoliticianname());
        exist.setPoliticianparty(politician.getPoliticianparty());

        return repo.save(exist);
    }

    public void deletepolitician(int id)
    {
        Optional<Politician> politician=repo.findById(id);

        if(politician.isEmpty())
        {
            throw new RuntimeException("Politician not found");
        }
        repo.delete(politician.get());
    }

}
