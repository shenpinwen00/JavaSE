package com.itheima.javabeanmovie;

public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("海底世界1",8,"Mike1");
        Movie m2 = new Movie("海底世界2",9,"Mike2");
        Movie m3 = new Movie("海底世界3",8.5,"Mike3");

        Movie[] movies = new Movie[3];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getName());
            System.out.println(movies[i].getScore());
            System.out.println(movies[i].getActor());

        }

    }
}
