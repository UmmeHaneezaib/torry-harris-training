package com.torryharris.model;

public class Movie implements Comparable<Movie>{
    String tittle;
    int year;
    Float imdbRating;
    Float collection;

    public Movie(String tittle, int year, Float imdbRating, Float collection) {
        this.tittle = tittle;
        this.year = year;
        this.imdbRating = imdbRating;
        this.collection = collection;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Float getCollection() {
        return collection;
    }

    public void setCollection(float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tittle='" + tittle + '\'' +
                ", year=" + year +
                ", imdbRating=" + imdbRating +
                ", collection=" + collection +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.tittle.compareTo(o.tittle);
    }
}
