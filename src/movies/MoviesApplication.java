package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {




    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        Scanner scanner = new Scanner(System.in);
        int userOption = scanner.nextInt();
        Movie[] moviesArray =  MoviesArray.findAll();

        switch (userOption) {
            case 0:
//                exit
                break;
            case 1:
//                show all movies
                System.out.println(Arrays.toString(moviesArray));
                break;
            case 2:
//                view movies in the animated category
                break;
            case 3:
//                view movies in the drama category
                break;
            case 4:
//                view movies in the horror category
                break;
            case 5:
//                view movies in the scifi category
                break;


        }
    }


}
