import java.util.Scanner;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Main {
        /*
         * design and write a java application that takes a single letter and displays
         * the corresponding digit on the telephone. the letters and digits on the tel
         * are
         * 2=ABC, 3= DEF, 4= GHI, 5=JKL
         * 6=MNO 7=PQRS ,8= TUV, 9=WXYZ
         */

        public static void main(String[] args) {

             
                

                Scanner myScanner = new Scanner(System.in);
                String digits;
                int telphoneNum;
                JOptionPane.showMessageDialog(null,
                                "WELCOME TO MY java application that takes a single letter and displays the corresponding digit on the telephone, please enter prompt in terminal"
                                                .toUpperCase());
                System.out.println(
                                "enter a single letter and i will tell you what the corresponding digit on the telephone it is");
                digits = myScanner.nextLine();

                if (!digits.equals(digits.toUpperCase())) {
                        System.out.println("letter must be \"UPPERCASED\" ");
                        JOptionPane.showMessageDialog(null, "letter must be \"UPPERCASED\" ");
                }

                else if (digits.equals("A") || digits.equals("B") || digits.equals("C")) {
                        telphoneNum = 2;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                } else if (digits.equals("D") || digits.equals("E") || digits.equals("F")) {

                        telphoneNum = 3;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("G") || digits.equals("H") || digits.equals("I")) {

                        telphoneNum = 4;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("J") || digits.equals("K") || digits.equals("L")) {

                        telphoneNum = 5;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("M") || digits.equals("N") || digits.equals("O")) {

                        telphoneNum = 6;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("P") || digits.equals("Q") || digits.equals("R") || digits.equals("S")) {

                        telphoneNum = 7;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("T") || digits.equals("U") || digits.equals("V")) {

                        telphoneNum = 8;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                } else if (digits.equals("W") || digits.equals("X") || digits.equals("Y") || digits.equals("Z")) {

                        telphoneNum = 9;
                        System.out.println(
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");
                        JOptionPane.showMessageDialog(null,
                                        "the letter " + digits + " " + "coresponds with number" + " " + telphoneNum
                                                        + " " + "on the phone");

                }

                else {

                        System.out.println("invalid input");
                }

                myScanner.close();

        }

}

// final double rate = 8.55;
// double pay;

// System.out.println("enter hours worked");
// double hours = myScanner.nextDouble();

// if (hours <= 40) {
// pay = rate * hours;

// } else {
// pay = rate * (40.0 + (hours - 40.0) * 1.5);
// }
// System.out.println(pay);

// int first;
// int last;

// String firstName = "Akram2";
// String lastName = "akram";
//
// if (firstName.toLowerCase().equals(lastName.toLowerCase()))
// System.out.println("done");
// System.out.println("not really");

// Scanner myScanner = new Scanner(System.in);
// JOptionPane.showMessageDialog(null, "welcome to my programm");
// System.out.println("enter two integers the second must not be zero(0)!");

// first = myScanner.nextInt();

// last = myScanner.nextInt();
// if (last != 0) {
// System.out.println(first + " " + "diveded by " + last + " =" + first / last);
// JOptionPane.showMessageDialog(null, first + " " + "diveded by " + last + " ="
// + first / last);
// } else {
// System.out.println("last number shuldnt be zero");
// JOptionPane.showMessageDialog(null, "last number cant be zero(0)");
// }
// myScanner.close();

/*
 * Scanner myScanner = new Scanner(System.in);
 * System.out.println("enter time1 ");
 * int time1 = myScanner.nextInt();
 * System.out.println("enter time2");
 * 
 * int time2 = myScanner.nextInt();
 * if (time1 >= time2) {
 * JOptionPane.showMessageDialog(null, "tim1");
 * } else {
 * JOptionPane.showMessageDialog(null, "tim2");
 * }
 * myScanner.close();
 */
