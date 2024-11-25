package com.politician.controller;

import com.politician.entity.Politician;
import com.politician.service.PoliticianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PoliticianController {

    @Autowired
    private PoliticianService service;

    @PostMapping("/save")
    public Politician savePolitician(@RequestBody Politician politician) {
        return service.savePolitician(politician);
    }


    @GetMapping("/findAll")
    public List<Politician> findAll() {
        return service.findAll();
    }


    @GetMapping("/findById")
    public Politician findById(@RequestParam int id) {
        return service.findById(id);
    }


    @PutMapping("/update")
    public Politician update(@RequestBody Politician politician) {
        return service.updatePolitician(politician);
    }

    @DeleteMapping("/delete")
    public void deletepolitician(int id)
    {
        service.deletepolitician(id);
    }

}
