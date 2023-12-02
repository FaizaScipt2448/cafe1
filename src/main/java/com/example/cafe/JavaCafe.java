package com.example.cafe;

import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCafe {
    public static ArrayList<Menu> products;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        Items i1 = new Items();
        Products();

        int choice;
        System.out.println("************************* Java Cafe **************************");
        do
        {
            choicesMessage();
            choice = input.nextInt();

            switch(choice)
            {
                case 1 :
                {
                    e1.displayMenu(products);
                    interfaceChoice1();
                    int m = input.nextInt();
                    switch(m)
                    {
                        case 1 :
                        {
                            i1.proudectInfo();
                            break;
                        }

                        case 2 :
                        {
                            break;
                        }

                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!");
                            break;
                        }

                    }
                    break;
                }

                case 2 :
                {
                    interfaceChoice2();
                    int m = input.nextInt();
                    switch (m)
                    {
                        case 1 :
                        {
                            e1.addOrder();
                            break;
                        }
                        case 2 :
                        {
                            e1.displayOrder();
                            break;
                        }

                        case 3:
                        {
                            e1.cancelOrder();
                            break;
                        }

                        case 4 :
                        {
                            break;
                        }

                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!");
                            break;
                        }
                    }

                    break;
                }

                case 3 :
                {
                    e1.printBill();
                    // Save the order history after printing the bill
                    // OrderHistoryFileHandler.writeOrderHistory(orderHistory);
                    break;
                }

                case 4 :
                {
                    interfaceChoice3();
                    int m = input.nextInt();
                    switch(m)
                    {
                        case 1 :
                        {
                            c1.rateService();
                            break;
                        }

                        case 2:
                        {
                            c1.payOrder();
                            break;
                        }
                        case 3 :
                        {
                            break;
                        }

                        default :
                        {
                            System.out.println("Wrong Number Try aِgain !!");
                            break;
                        }

                    }
                    break;
                }

                default :
                {
                    if(choice !=5)
                        System.out.println("Wrong Number Try aِgain !!");
                    break;
                }
            }


        } while(choice != 5);

    }

    public static void choicesMessage()
    {
        System.out.println("");
        System.out.println("[1]View Menu        [2]Order Services       [3]Print Bill       [4]Customer Service     [5]Exit");
        System.out.print("Choice : ");
    }

    public static void Products()
    {
        products = new ArrayList<Menu>();
        Menu coffee1 = new Coffee(1, "Mocha", 15);
        Menu coffee2 = new Coffee(2, "Latte", 18);
        Menu coffee3 = new Coffee(3, "Black", 5);

        Menu bakery1 = new Bakery(4, "Bagel", 19);
        Menu bakery2 = new Bakery(5, "Bread", 6);
        Menu bakery3 = new Bakery(6, "Donut", 13);

        products.add(coffee1);
        products.add(coffee2);
        products.add(coffee3);

        products.add(bakery1);
        products.add(bakery2);
        products.add(bakery3);
    }

    public static void interfaceChoice2()
    {
        System.out.println("[1]Add Order    [2]Display Order     [3]Cancel Order    [4]Back");
        System.out.print("Choice: ");
    }

    public static void interfaceChoice3()
    {
        System.out.println("[1]Rate Customer Service    [2]Payment Customer Service    [3]Back");
        System.out.print("Choice: ");
    }

    public static void interfaceChoice1()
    {
        System.out.println("Want to See information about product? ");
        System.out.println("[1]Yes      [2]No");
        System.out.print("Choice: ");
    }
   // public static Scene;

}

