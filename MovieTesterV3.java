package com.trishawrites;
/**
 * Purpose: The purpose of this program is to understand how we can use selection sort methods to sort values within
 * an Array. 
 *
 * @author Trisha Ganesh
 * @version 6/26/2021
 *
 */

import java.util.Arrays;

public class MovieTesterV3 {

    public static void main(String[] args) {

        // Movie Array
        Movie[] movie = new Movie[10];

        movie[0] = new Movie("Luca", 2021, "Walt Disney Pictures");
        movie[1] = new Movie("In The Heights", 2021, "Warner Bros");
        movie[2] = new Movie("A Quiet Place Part II", 2021, "Platinum Dunes");
        movie[3] = new Movie("Fatherhood", 2021, "Columbia Pictures");
        movie[4] = new Movie("Infinite", 2021, "Di Bonaventura Pictures");
        movie[5] = new Movie("A Quiet Place", 2018, "Sunday Night Productions");
        movie[6] = new Movie("Wish Dragon", 2020, "Sony Pictures Animation");
        movie[7] = new Movie("A Space Odyssey", 2001, "Stanley Kubrick Productions");
        movie[8] = new Movie("Grand Illusion", 1937, "Réalisations d'Art Cinématographique");
        movie[9] = new Movie("Harry Potter (the Sorcerer's stone)", 2001, "Warner Bros. Pictures");

        //calling method
        printResults(movie);

        selectionSortTitleAscending(movie);

        for(int index = 0; index < movie.length; index++)
            System.out.println(movie[index] );

        selectionSortTitleDescending(movie);
        for(int index = movie.length - 1; index >= 0; index--)
            System.out.println(movie[index]);

        selectionSortYearAscending(movie);

        for(int index = 0; index < movie.length; index++)
            System.out.println(movie[index]);

        selectionSortYearDescending(movie);

        for(int index = 0; index < movie.length; index++)
            System.out.println(movie[index]);

        selectionSortStudioAscending(movie);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("   by studio in ascending order \n");
        for(int index = 0; index < movie.length; index++)
            System.out.println(movie[index]);

        selectionSortStudioDescending(movie);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("   by studio in descending order \n");
        // for(int index = movie.length - 1; index >= 0; index--)
        for(int index = movie.length - 1; index >= 0; index--)
            System.out.println(movie[index]);

    }

    //insertion sort methods
    public static void selectionSortTitleAscending(Movie[] element) {
        int index;
        int k;
        int posMax;
        Movie movie;

        for (index = element.length - 1; index >= 0; index--) {
            posMax = 0;
            for (k = 0; k <= index; k++) {
                if (element[k].getTitle().compareTo(element[posMax].getTitle()) > 0) {
                    posMax = k;
                }
                movie = element[index];
                element[index] = element[posMax];
                element[posMax] = movie;
            }
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("  by title in ascending order   \n");
    }

    public static void selectionSortTitleDescending(Movie[] element) {
        int index;
        int k;
        int posMax;
        Movie movie;

        for (index = element.length - 1; index >= 0; index--) {
            posMax = 0;
            for (k = 0; k <= index; k++) {
                if (element[k].getTitle().compareTo(element[posMax].getTitle()) > 0) {
                    posMax = k;
                }
                movie = element[index];
                element[index] = element[posMax];
                element[posMax] = movie;
            }
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("  by title in descending order   \n");
    }

    public static void selectionSortYearAscending(Movie[] element) {
        int index;
        int k;
        int posMax;
        Movie movie;

        for( index = element.length - 1; index >= 0; index--)
        {
            posMax = 0;
            for( k = 0; k <= index; k++ )
            {
                if(element[ k ].getYear() > element[posMax].getYear())
                    posMax = k;
            }
            movie = element[index];
            element[ index ] = element[posMax];
            element[ posMax ] = movie;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("    by year in ascending order   \n");
    }


    public static void selectionSortYearDescending(Movie[] element) {
        int index;
        int k;
        int maxPos;
        Movie movie;

        for(index = element.length - 1; index >= 0; index--)
        {
            maxPos = 0;
            for(k = 0; k <= index; k++)
            {
                if(element[ k ].getYear() < element[maxPos].getYear())
                    maxPos = k;
            }
            movie = element[index];
            element[index] = element[maxPos];
            element[maxPos] = movie;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("    by year in descending order   \n");
    }

    public static void selectionSortStudioAscending(Movie[] element) {
        int index;
        int k;
        int posMax;
        Movie movie;

        for (index = element.length - 1; index >= 0; index--) {
            posMax = 0;
            for (k = 0; k <= index; k++) {
                if (element[k].getStudio().compareTo(element[posMax].getStudio()) > 0) {
                    posMax = k;
                }
                movie = element[index];
                element[index] = element[posMax];
                element[posMax] = movie;
            }
        }
    }

    public static void selectionSortStudioDescending(Movie[] element) {
        int index;
        int k;
        int posMax;
        Movie movie;

        for (index = element.length - 1; index >= 0; index--) {
            posMax = 0;
            for (k = 0; k <= index; k++) {
                if (element[k].getStudio().compareTo(element[posMax].getStudio()) > 0) {
                    posMax = k;
                }
                movie = element[index];
                element[index] = element[posMax];
                element[posMax] = movie;
            }
        }
    }

    //method to print
    public static void printResults(Movie[] element) {
        System.out.println("    <<<< Before Sorting >>>> \n");
        for (Movie movie : element)
            System.out.printf("%-30s %4d   %-20s \n", movie.getTitle(), movie.getYear(), movie.getStudio());
    }
}