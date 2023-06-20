package com.camionera.empresa.controller;

import com.camionera.empresa.entity.Audito;
import com.camionera.empresa.service.audit.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @GetMapping("list")
    public ResponseEntity<List<Audito>> list(){
        return ResponseEntity.ok(auditService.list());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Audito audito){
        auditService.save(audito);
        return ResponseEntity.status(HttpStatus.CREATED).body(audito);
    }
}
