package org.cgmlti.adso.ciclos;

public class codigo {
    public static void main(String[] args) {

        int x = 5, y = 8;

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
        System.out.println("__________");

        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");

        }
    }

}
