package com.example.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Staff {
    Scanner input = new Scanner(System.in);
    private int count = 0;

    private Menu[] orderList;


    public void displayMenu(ArrayList<Menu> products) {
        System.out.println("********* Menu *********");
        System.out.println("ID    NAME      PRICE");
        for (Menu type : products) {
            System.out.println(type.getId() + "     " + type.getName() + "     " + type.getPrice());
        }
    }

    public void addOrder() {
        int o;

        System.out.println("New Order?");
        System.out.println("[1]yes      [2]any number for no");
        System.out.print("Choice: ");
        int t = input.nextInt();
        switch (t) {
            case 1: {
                count = 0;
                break;
            }

            default:
                break;
        }

        do {
            System.out.println("[1]Add from Coffee Type      [2]Add from Bakery Type       [3]Back");
            System.out.print("Choice: ");
            o = input.nextInt();

            if (o == 1) {
                int n;
                System.out.println("[1]Mocha   [2]Latte    [3]Black");
                System.out.print("Choice: ");
                n = input.nextInt();
                switch (n) {
                    case 1: {
                        System.out.print("Enter Mocha Coffee quantity : ");
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Mocha", 15, quantity);
                        orderList[count] = c;
                        count++;
                        break;
                    }

                    case 2: {
                        System.out.print("Enter Latte Coffee quantity : ");
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Latte", 18, quantity);
                        orderList[count] = c;
                        count++;
                        break;
                    }

                    case 3: {
                        System.out.print("Enter Black Coffee quantity : ");
                        int quantity = input.nextInt();
                        Coffee c = new Coffee("Black", 5, quantity);
                        orderList[count] = c;
                        count++;
                        break;

                    }

                    default: {
                        System.out.println("Wrong Number Try aِgain !!");
                        break;
                    }
                }
            } else if (o == 2) {
                int n;
                System.out.println("[1]Bagel   [2]Bread    [3]Donut");
                System.out.print("Choice: ");
                n = input.nextInt();
                switch (n) {
                    case 1: {
                        System.out.print("Enter Bagel quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Bagel", 19, quantity);
                        orderList[count] = b;
                        count++;
                        break;
                    }

                    case 2: {
                        System.out.print("Enter Bread quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Bread", 6, quantity);
                        orderList[count] = b;
                        count++;
                        break;
                    }

                    case 3: {
                        System.out.print("Enter Donut quantity : ");
                        int quantity = input.nextInt();
                        Bakery b = new Bakery("Donut", 13, quantity);
                        orderList[count] = b;
                        count++;
                        break;

                    }

                    default: {
                        System.out.println("Wrong Number Try aِgain !!");
                        break;
                    }
                }
            } else if (o != 3) {
                System.out.println("Wrong Number Try aِgain !!");
                break;
            }

        } while (o != 3);

    }

    public void displayOrder() {
        System.out.println("*************** The Order ***************");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Name: " + orderList[i].getName() + "    Price: " + orderList[i].getPrice() + "   Quantity: " + orderList[i].getQuantity());
        }
    }

    public void cancelOrder() {
        int o;
        System.out.println("[1]cancel some Proudect in Order     [2]Back ");
        System.out.print("Choice: ");
        o = input.nextInt();
        switch (o) {
            case 1: {
                System.out.println("Enter the ID of product in bill to cancel");
                System.out.print("ID of product to remove: ");
                int remove = input.nextInt();
                for (int i = remove - 1; i < count - 1; i++) {
                    orderList[i] = orderList[i + 1];
                }

                System.out.println("[1]From Coffee    [2]From Bakery");
                System.out.print("Choice: ");
                int a = input.nextInt();
                switch (a) {
                    case 1: {
                        orderList[count - 1] = new Coffee(null, 0.0, 0);
                        count--;
                        break;
                    }

                    case 2: {
                        orderList[count - 1] = new Bakery(null, 0.0, 0);
                        count--;
                        break;
                    }

                    default: {
                        if (a != 1 && a != 2) {
                            System.out.println("Wrong Number Try aِgain !!");
                            break;
                        }
                    }
                }
                break;
            }

            case 2: {
                break;
            }

            default: {
                if (o != 2) {
                    System.out.println("Wrong Number Try aِgain !!");
                    break;
                }
            }
        }
        if (o == 1) {
            System.out.println("");
            System.out.println("Order after Cancel: ");
            displayOrder();
        }
    }

    public double calcSubPrice() {
        double price;
        final double TAX = 0.15;
        int subPrice = 0;

        for (int i = 0; i < count; i++) {
            price = (orderList[i].getPrice() * orderList[i].getQuantity());
            subPrice += price;
        }

        return subPrice;
    }

    public Menu[] getOrderList() {
        return orderList;
    }

    public void printBill() {
        double totalPrice = calcSubPrice() + (calcSubPrice() * 0.15);
        System.out.println("****************** Bill *********************");
        System.out.println("Sub Price: " + calcSubPrice() + " SAR");
        System.out.println("Tax: " + "15%");
        System.out.println("Total Price: " + totalPrice + " SAR");
        displayOrder();

    }
}

