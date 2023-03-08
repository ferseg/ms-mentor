package com.akgym.controller;

import com.akgym.model.response.TrainingPlanListResponse;
import com.akgym.model.response.TrainingPlanResponse;
import com.akgym.service.TrainingPlanService;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Status;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.inject.Inject;

@Controller("/training-plans")
public class TrainingPlanController {
    @Inject
    private TrainingPlanService trainingPlanService;

    @Operation(summary = "List all training plans", description = "Gets all the existing training plans")
    @ApiResponse(description = "The list of existing training plans")
    @Get
    public TrainingPlanListResponse getAll() {
        return trainingPlanService.findAll();
    }

    @Status(HttpStatus.CREATED)
    @Operation(summary = "Creates a plan")
    @ApiResponse(responseCode = "201", description = "The created plan")
    @Post
    public TrainingPlanResponse create(@Body TrainingPlanResponse body) {
        return trainingPlanService.create(body.name());
    }

}
