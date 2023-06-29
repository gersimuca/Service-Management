package com.gersimuca.servicemanagement.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Service {
    @Id
    private Long id;

    private String name;

    private String description;
}
