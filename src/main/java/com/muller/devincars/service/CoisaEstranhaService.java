package com.muller.devincars.service;

import com.muller.devincars.model.CoisaEstranha;
import com.muller.devincars.repository.CoisaEstranhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoisaEstranhaService {
    @Autowired
    CoisaEstranhaRepository coisaEstranhaRepository;

    public Optional<CoisaEstranha> findById(Long id) {
        return coisaEstranhaRepository.findById(id);
    }

    public List<CoisaEstranha> findAllCoisasEstranhas() {
        return coisaEstranhaRepository.findAll();
    }
}
