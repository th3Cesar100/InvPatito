package com.camionera.empresa.service.audit.impl;

import com.camionera.empresa.entity.Audito;
import com.camionera.empresa.repository.AuditoRepository;
import com.camionera.empresa.service.audit.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {
    @Autowired
    private AuditoRepository auditoRepository;

    @Override
    public List<Audito> list() {
        return auditoRepository.findAll();
    }

    @Override
    public void save(Audito audito) {
        auditoRepository.save(audito);
    }
}
