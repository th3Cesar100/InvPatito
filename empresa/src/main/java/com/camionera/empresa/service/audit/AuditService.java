package com.camionera.empresa.service.audit;


import com.camionera.empresa.entity.Audito;

import java.util.List;

public interface AuditService {

    List<Audito> list();

    void save(Audito audito);


}
