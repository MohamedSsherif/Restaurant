
import Models.*;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import static java.lang.System.*;

public class Main {

    static User user;
    static Restaurant rest;

    static Order order;

    @Nullable
    static Reservation currentReservation;


    public static void main(String[] args) {

        boolean firstTime = true;

        // restaurant information
        rest = new Restaurant(1, "Mesh Food", "7598", "15 taha hussein street");

        Scanner in = new Scanner(System.in);


        ArrayList<Reservation> reservations = new ArrayList<>(50);

        userIfo(in);



        while (true) {
            System.out.println("(welcome to " + rest.getName() + " restaurant )\n");
            System.out.println("--------------------------- \n");
            System.out.println("1- " + Reservation.class.getName());
            System.out.println("2- " + Menu.class.getName());
            System.out.println("3- check \n");
            System.out.println("4-exit \n");
            System.out.println("--------------------------- \n");
            System.out.println("choose what do you want \n");
            int i = in.nextInt();
            switch (i) {
                case 1: {
                    if(!firstTime){
                        userIfo(in);
                    }
                    System.out.println("Enter table num \n");
                    int tableNum = in.nextInt();

                    currentReservation = new Reservation(user, tableNum);

                    boolean reserved = reservations.contains(currentReservation);

                    if (reserved) {
                        // table is reserved
                        String output = String.format("Table: %s is Reserved;", tableNum);
                        System.out.println(output);

                    } else {
                        // Reserve;
                        reservations.add(currentReservation);
                        String output = String.format("We will reserve Table: %s for you mr %s;", tableNum, user.getName());
                        System.out.println(output);

                    }

                    firstTime = false;
                    break;
                }
                case 2: {
                    Menu menu = new Menu();
                    System.out.println("Which category you want \n");
                    System.out.println("\t1- Desert\n\t2- Dinner \n");
                    int type = in.nextInt();

                    ArrayList<Food> selectedList = new ArrayList<>();

                    if (type == 1) {
                        selectedList = menu.getDeserts();
                        menu.getDeserts().forEach(System.out::println);
                    } else if (type == 2) {
                        selectedList = menu.getDinner();

                        menu.getDinner().forEach(System.out::println);

                    } else {
                        System.out.println("Invalid Input");
                    }

                    order = new Order(currentReservation, new ArrayList<OrderLine>());


                    while (true) {
                        System.out.println("Please select food (99 for end)");

                        int selection = in.nextInt();


                        if (!(selection != 99 && selection >= 1 && selection < selectedList.size() + 1)) {
                            break;
                        }
                        System.out.println("You have selected" + selectedList.get(selection - 1));
                        System.out.println("Please select quantity");

                        int quantity = in.nextInt();

                        order.getOrderLines().add(new OrderLine(selectedList.get(selection - 1), quantity));

                    }


                    break;
                }

                case 3: {
                    System.out.println("Your reseet mr " + user.getName());
                    System.out.println(order.toString());
                }
            }


        }


    }

    private static void userIfo(Scanner in) {
        System.out.println("Enter you information\n Name: ");
        String name = in.next();
        System.out.println(" Phone : ");

        String phone = in.next();

        // user information
        user = new User(name, phone);
    }

}

