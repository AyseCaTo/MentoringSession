package ConstructorReview;

import java.util.ArrayList;
import java.util.Arrays;

public class BookStore {

    public static void main(String[] args) {

        ArrayList<Book> listOfBook = new ArrayList<>(Arrays.asList(
                new Book("War and Peace", "Leo Tolstoy", 120, 1869, 50),
                new Book("Hamlet", "William Shakespeare", 200, 1600, 40.99),
                new Book("Crime and Punishment", "Fyodor Dostoevsky", 300, 1866, 68.19)));

        System.out.println(listOfBook);

        double totalPrice = 0;

        for (Book eachBook : listOfBook){
            totalPrice += eachBook.price;
        }

        System.out.println(totalPrice);
    }
}
