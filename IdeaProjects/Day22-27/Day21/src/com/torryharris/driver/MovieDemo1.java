package com.torryharris.driver;

import com.torryharris.comparotor.MovieCollectionsComparator;
import com.torryharris.comparotor.MovieImdbComparator;
import com.torryharris.comparotor.YearComparator;
import com.torryharris.model.Employee;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo1 {
    public static void main(String[] args) {
        Movie znmd = new Movie("Zindagi Na Milegi Dubara", 2011, 8.2f, 2.30f);
        Movie mimi = new Movie("MIMI", 2021, 8f, 18f);
        Movie k3g = new Movie("Kabhi Kushi Kabhi Gum", 2001, 7.4f, 2.38f);
        Movie zero = new Movie("Zero", 2017, 5.0f, 1.30f);
        Movie don = new Movie("Don", 2007, 7.5f, 6.30f);
        ArrayList<Movie> mList = new ArrayList<>();
        mList.add(znmd);
        mList.add(mimi);
        mList.add(k3g);
        mList.add(zero);
        mList.add(don);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice");
        String choice = sc.next();
        System.out.println("Before Sorting");
        Iterator<Movie> mIterator = mList.iterator();
        while (mIterator.hasNext()) {
            System.out.println(mIterator.next());
        }
        if (choice.equals("Tittle")) {
            System.out.println("Sort by Movie Tittle");
            mList.sort(null);
            mIterator = mList.iterator();
            while (mIterator.hasNext()) {
                System.out.println(mIterator.next());

            }

        }
        if (choice.equals("year")) {
            System.out.println("Sort Movie By Year of Release");
            mList.sort(new YearComparator());
            mIterator = mList.iterator();
            while (mIterator.hasNext()) {
                System.out.println(mIterator.next());
            }
        }
        if (choice.equals("Imdb")) {
            System.out.println("Sort by IMDB rating");
            mList.sort(new MovieImdbComparator());
            mIterator = mList.iterator();
            while (mIterator.hasNext()) {
                System.out.println(mIterator.next());
            }
        }
        if (choice.equals("Collection")) {
            System.out.println("Sort by the Movie Collection");
            mList.sort(new MovieCollectionsComparator());
            mIterator = mList.iterator();
            while (mIterator.hasNext()) {
                System.out.println(mIterator.next());
            }
        }


    }
}
