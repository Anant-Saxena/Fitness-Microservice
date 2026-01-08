package com.fitness.activity_service.dto;

import com.fitness.activity_service.model.ActivityType;
import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    @Nonnull
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String,Object> addtionalMetrics;
}
