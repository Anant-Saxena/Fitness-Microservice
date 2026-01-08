package com.fitness.activity_service.service;

import com.fitness.activity_service.dto.ActivityRequest;
import com.fitness.activity_service.dto.ActivityResponse;
import com.fitness.activity_service.mapper.ActivityMapper;
import com.fitness.activity_service.model.Activity;
import com.fitness.activity_service.repository.ActivityRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ActivityService {

    private ActivityRepository activityRepository;

    public ActivityResponse trackActivity(ActivityRequest request) {
        Activity activity = ActivityMapper.toActivity(request);
       Activity savedActivity = activityRepository.save(activity);
       return ActivityMapper.toDto(savedActivity);
    }
}
