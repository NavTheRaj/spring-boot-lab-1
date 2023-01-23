package com.navraj.springbootclass.service.impl;


import com.navraj.springbootclass.entity.log.Logger;
import com.navraj.springbootclass.repo.LoggerRepo;
import com.navraj.springbootclass.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    private LoggerRepo loggerRepo;

    @Override
    public Logger save(Logger log) {
        return loggerRepo.save(log);
    }
}
