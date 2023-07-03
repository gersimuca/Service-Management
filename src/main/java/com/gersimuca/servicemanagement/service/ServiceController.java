package com.gersimuca.servicemanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ServiceController {
    private final ServiceService service;
}
