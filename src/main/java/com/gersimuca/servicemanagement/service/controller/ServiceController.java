package com.gersimuca.servicemanagement.service.controller;

import com.gersimuca.servicemanagement.service.model.Service;
import com.gersimuca.servicemanagement.service.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RequiredArgsConstructor
@RestController
public class ServiceController {
    private final ServiceService service;
    private final Logger LOGGER = LoggerFactory.getLogger(Service.class);

}
