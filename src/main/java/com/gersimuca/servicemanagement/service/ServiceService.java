package com.gersimuca.servicemanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

}
