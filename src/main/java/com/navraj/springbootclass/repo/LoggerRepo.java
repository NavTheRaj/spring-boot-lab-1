package com.navraj.springbootclass.repo;


import com.navraj.springbootclass.entity.log.Logger;
import org.springframework.data.repository.CrudRepository;

public interface LoggerRepo extends CrudRepository<Logger,Long> {
    Logger save(Logger log);
}
