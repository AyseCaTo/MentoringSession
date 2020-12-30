package ConstructorReview;

/*
Constructors
*•Constructor is a special method that MUST matches the name of the class and has no return type nor a specifier.
*A special method that every class MUST have(Default Constructor)
*It’s used when we create the objects of a class
*We can use constructors to initialize the object’s instance variables.
*Execution of a constructor ALWAYS depends on the object(gets executed when we create the object)
 */

/*
Types of Constructors
•No-argument Constructor: A constructor that has no parameter is known as default constructor.
If we do not define a constructor in a class, then compiler creates default constructor(with no argument) for the class.
•Parameterized Constructor: A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with our own values, then we pass parameters to the  constructor.
 */

/*
Constructors Overloading
*We can have multiple constructors in a class by implementing method overloading
 */

/*
Constructor call: this()
    * only a constructor can call another constructor(other methods can NOT call constructor)
    * constructor can be overloaded. the only way to have more than one constructor in class
    * constructor can NOT be called by constructor name. We need "this()"
    * constructor call MUST be at first step
    * one constructor can ONLY call one constructor
    * Constructor cannot call or contain itself
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Book {

   public  String title, author;
   public int numberOfPage, publishedYear;
   public double price;

    public Book(String title) {

        this.title = title;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;

    }

    public Book(String title, String author, int numberOfPage) {
        this(title, author);
        this.numberOfPage = numberOfPage;
    }

    public Book(String title, String author, int numberOfPage, int publishedYear) {
        this(title, author, numberOfPage);
        this.publishedYear = publishedYear;
    }

    public Book(String title, String author, int numberOfPage, int publishedYear, double price) {
        this(title, author, numberOfPage, publishedYear);
        this.price = price;
    }


    public String toString() {
        return "\nBook{" +
                "\ntitle='" + title + '\'' +
                "\nauthor='" + author + '\'' +
                "\nnumberOfPage=" + numberOfPage +
                "\npublishedYear=" + publishedYear +
                "\nprice=" + price +
                "\n=========================================";
    }
}
/*
Task:
        Book
        Variables:
        title, author, numberOfPage, publishedYear, price;
        add constructor to initialize all fields
        Methods:
        toString()

        create a class called BookStore
        create 3 Book Objects and store them into ArrayList of Books
        calculate the total cost of all Items in the list

 */

/*
ArrayList<Book> Books = new ArrayList<Book>(Arrays.asList(new Book("War and Peace", "Leo Tolstoy", 120, 1869, 50),
                new Book("Hamlet", "William Shakespeare", 200, 1600, 40.99),
                new Book("Crime and Punishment", "Fyodor Dostoevsky", 300, 1866, 68.19)));

 */

