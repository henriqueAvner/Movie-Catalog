package com.exercises.movie_catalog.DTOs;

public record MovieDTO(
        long id,
        String title,
        String director,
        int releasedYear) {}
