package com.torryharris.comparotor;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieCollectionsComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getCollection().compareTo(o1.getCollection());
    }
}
