package org.example.securityspring.controller;

import org.example.securityspring.model.Prodact;
import org.example.securityspring.repo.ProdactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    ProdactRepo  prodactRepo;
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/hi")
    public String hi() {
        return "Hello World hi";
    }

    @PostMapping("/savePro")
    public Prodact savePro(@RequestBody Prodact prodact) {
        return  prodactRepo.save(prodact);
    }

    @PostMapping("/prodact{id}")
    public Prodact getProdact(@RequestParam Long id) {
        return  prodactRepo.findById(id).get();
    }
}
