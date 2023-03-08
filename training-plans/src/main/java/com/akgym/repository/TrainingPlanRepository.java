package com.akgym.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.inject.Singleton;

@Singleton
public class TrainingPlanRepository {

    private static final Set<String> DB = new HashSet<>();

    public List<String> findAll() {
        return DB.stream().toList();
    }

    public boolean insert(final String plan) {
        return DB.add(plan);
    }
}
