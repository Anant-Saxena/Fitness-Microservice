package com.fitness.activity_service.repository;

import com.fitness.activity_service.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {
}
