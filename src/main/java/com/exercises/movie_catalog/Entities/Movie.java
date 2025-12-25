package com.exercises.movie_catalog.Entities;

public class Movie {
    private long id;
    private String title;
    private String director;
    private int releasedYear;

    public Movie(long id, String title, String director, int releasedYear) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releasedYear = releasedYear;
    }

    public Movie(){};

    public long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }
}
