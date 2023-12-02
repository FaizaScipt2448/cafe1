package com.example.cafe;

import java.util.Scanner;

public class Customer extends Staff {
    Scanner input = new Scanner(System.in);

    public void rateService() {
        int rate;
        boolean continu = false;
        do {
            System.out.println("How do you rate our customer service?");
            System.out.println("[1]Excellent    [2]Average      [3]Poor");
            System.out.print("Choice: ");
            rate = input.nextInt();

            switch (rate) {
                case 1:
                case 2:
                case 3: {
                    System.out.println("Thanks for rating, this will help us to improve our service");
                    continu = true;
                    break;
                }

                default: {
                    if (rate != 1 && rate != 2 && rate != 3) {
                        System.out.println("invalied number, Try again");
                        break;
                    }
                }

            }
        } while (continu == false);
    }

    public void payOrder() {
        int p;
        boolean continu = false;
        do {
            System.out.println("[1]Pay for Order    [2]Back");
            System.out.print("Choice: ");
            p = input.nextInt();

            switch (p) {
                case 1: {
                    System.out.println("successful payment?");
                    System.out.println("[1]yes     [2]No");
                    System.out.print("Choice: ");
                    int f = input.nextInt();
                    switch (f) {
                        case 1: //yes
                        {
                            System.out.println("Thanks for Purchasing");
                            break;
                        }

                        case 2: {
                            System.out.println("Unsuccessful Payment, Try again");
                            break;
                        }
                    }
                    continu = true;
                    break;
                }

                case 2: {
                    continu = true;
                    break;
                }

                default: {
                    if (p != 1) {
                        System.out.println("invalied number, Try again");
                        break;
                    }
                }

            }
        } while (continu == false);

    }
}

