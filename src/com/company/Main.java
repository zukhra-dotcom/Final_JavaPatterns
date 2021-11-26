package com.company;

import com.company.Address.*;
import com.company.Description.*;

import com.company.Feedback.Client;
import com.company.Feedback.FeedbackType;
import com.company.Instruments.AddToCart;
import com.company.Instruments.Instruments;
import com.company.Instruments.InstrumentsFactory;
import com.company.Instruments.Like;
import com.company.people.Courier;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Delivery of Books Application!\n");
        System.out.println("Enter 1 to begin");
        System.out.println("Enter 2 to exit");
        int choice = in.nextInt();

        if(choice==1){
            System.out.println("Hello, today I am your gid");
            DeliveryCompany Courier = new Courier();
            Courier.title();
            Courier.helpCustomers();
            System.out.println("-------- STRATEGY PATTERN ----------\n");

            System.out.println("Please, enter what info do you want to know: ");
            System.out.println("List of books - 1\n" +
                    "Feedback - 2\n");
            int choose = in.nextInt();
            if(choose == 1) {
                System.out.println("Here list of genres: ");
                ControlSystem Database = new ControlSystem();

                Database.addGenre("Import years ------- 1");
                Database.addGenre("\nSpace ------- 2");
                Database.addGenre("\nSapiens ------- 3");
                Database.addGenre("\nLove, Fun, Many years ------- 4");
                DataGenre Data = new DataGenre("Database Of books");

                Database.Genres(Data);
                Database.addGenre("\nThe Count of Monte Cristo ------- 5");
                System.out.println("-------- OBSERVER PATTERN ----------\n");
                System.out.println("Choose the book: ");
                int description = in.nextInt();
                if (description == 1) {
                    Genres genres = new FirstPrice(new Important());
                    System.out.println(genres.booksOfGenre());
                }
                if(description == 2){
                    Genres genres = new FirstPrice(new Space());
                    System.out.println(genres.booksOfGenre());
                }
                if(description == 3){
                    Genres genres = new SecondPrice(new Sapiens());
                    System.out.println(genres.booksOfGenre());
                }
                if(description == 4){
                    Genres genres = new FirstPrice(new Love());
                    System.out.println(genres.booksOfGenre());
                }
                if(description == 5){
                    Genres genres = new SecondPrice(new TheCount());
                    System.out.println(genres.booksOfGenre());
                }
                System.out.println("-------- DECORATOR PATTERN ----------\n");
                System.out.println("Choose your action:\n" +
                        "Adding book to Cart ---- 1\n" +
                        "Just see book later ---- 2\n");
                int service = in.nextInt();
                if(service == 1){
                    Instruments instruments = new InstrumentsFactory();
                    AddToCart addToCart =instruments.getAddToCard();
                    addToCart.addingToCart();
                }
                if(service == 2){
                    Instruments instruments = new InstrumentsFactory();
                    Like like =instruments.getLike();
                    like.like();
                }
                System.out.println("-------- ABSTRACT FACTORY PATTERN ----------\n");

                System.out.println("Choose your City:\n" +
                        "Nur-Sultan ---- 1\n" +
                        "Almaty ---- 2\n" +
                        "Chimkent ---- 3\n");
                int address = in.nextInt();

                Address kazpost = new Kazpost();
                Address pony = new PonyExpress();
                Address post= new PostExpress();
                if(address==1){
                    Kazakhstan astana =new NurSultan();
                    System.out.println("Choose your PostIn:\n" +
                            "Kazpost---- 1\n" +
                            "PonyExpress ---- 2\n" +
                            "PostExpress ---- 3\n");
                    int postIn = in.nextInt();
                    if (postIn==1){
                        astana.setAddress(kazpost);
                        astana.useAddress();
                    }

                    if (postIn==2){
                        astana.setAddress(pony);
                        astana.useAddress();
                    }

                    if (postIn==3){
                        astana.setAddress(post);
                        astana.useAddress();
                    }
                }
                if (address==2){
                    Kazakhstan almaty =new Almaty();
                    System.out.println("Choose your PostIn:\n" +
                            "Kazpost---- 1\n" +
                            "PonyExpress ---- 2\n" +
                            "PostExpress ---- 3\n");
                    int postIn = in.nextInt();
                    if (postIn==1){
                        almaty.setAddress(kazpost);
                        almaty.useAddress();
                    }

                    if(postIn==2){
                        almaty.setAddress(pony);
                        almaty.useAddress();
                    }

                    if(postIn==3){
                        almaty.setAddress(post);
                        almaty.useAddress();
                    }
                }

                if(address==3){
                    Kazakhstan chimkent =new Chimkent();
                    System.out.println("Choose your PostIn:\n" +
                            "Kazpost---- 1\n" +
                            "PonyExpress ---- 2\n" +
                            "PostExpress ---- 3\n");
                    int postIn = in.nextInt();
                    if (postIn==1){
                        chimkent.setAddress(kazpost);
                        chimkent.useAddress();
                    }
                    if (postIn==2){
                        chimkent.setAddress(pony);
                        chimkent.useAddress();
                    }
                    if (postIn==3){
                        chimkent.setAddress(post);
                        chimkent.useAddress();
                    }
                }
                System.out.println("-------- BRIDGE PATTERN ----------\n");
            }
            if(choose == 2){
                System.out.println("Please, give feedback to our service: 'Bad' --- 1, 'Good' --- 2, 'Excellent' --- 3");
                int rating = in.nextInt();
                if(rating == 1){
                    System.out.println(Client.feedback(FeedbackType.BAD));
                }
                if(rating == 2 ){
                    System.out.println(Client.feedback(FeedbackType.GOOD));
                }
                if(rating == 3){
                    System.out.println(Client.feedback(FeedbackType.EXCELLENT));
                }
                System.out.println("Thank you for your feedback!");
                System.out.println("-------- FACADE PATTERN ----------\n");
            }
        }
        if(choice==2){
            System.out.println("Thank you for coming!");
            in.close();
        }
    }
}
