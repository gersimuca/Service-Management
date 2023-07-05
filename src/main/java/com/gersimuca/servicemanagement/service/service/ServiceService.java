package com.gersimuca.servicemanagement.service.service;

import com.gersimuca.servicemanagement.service.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

}
