package com.navraj.springbootclass.entity.log;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.dynalink.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Logger {
    private static final String USER = "SPRING_USER";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long transaction_id;
    LocalDateTime time;
    String principal;
    String operation;

    public Logger(LocalDateTime time, String operation) {
        this.time = time;
        this.operation = operation;
        this.principal = USER;
    }
}
