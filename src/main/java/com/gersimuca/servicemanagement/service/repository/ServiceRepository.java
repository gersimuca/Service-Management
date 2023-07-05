package com.gersimuca.servicemanagement.service.repository;

import com.gersimuca.servicemanagement.service.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
