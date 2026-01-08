package com.fitness.activity_service.mapper;

import com.fitness.activity_service.dto.ActivityRequest;
import com.fitness.activity_service.dto.ActivityResponse;
import com.fitness.activity_service.model.Activity;

public class ActivityMapper {

    public static Activity toActivity(ActivityRequest request){
        return Activity.builder()
                .userId(request.getUserId())
                .type(request.getType())
                .caloriesBurned(request.getCaloriesBurned())
                .duration(request.getDuration())
                .addtionalMetrics(request.getAddtionalMetrics())
                .startTime(request.getStartTime())
                .build();
    }

    public static ActivityResponse toDto(Activity activity){
            ActivityResponse response = new ActivityResponse();
            response.setId(activity.getId().toString());
            response.setUserId(activity.getUserId());
            response.setType(activity.getType());
            response.setDuration(activity.getDuration());
            response.setAddtionalMetrics(activity.getAddtionalMetrics());
            response.setCaloriesBurned(activity.getCaloriesBurned());
            response.setStartTime(activity.getStartTime());
            response.setCreatedAt(activity.getCreatedAt());
            response.setUpdatedAt(activity.getUpdatedAt());
            return response;
    }
}
