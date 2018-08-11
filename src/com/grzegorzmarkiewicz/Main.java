package com.grzegorzmarkiewicz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> personel = new HashMap<>();
        boolean in = true;

        while (in) {
            System.out.println("Pdaj imie pracowanika i dzial odzielony spacja:");
            String input = scan.nextLine();
            if (input.equals("list")) {
                in = false;
                System.out.println(personel);
            } else {
                String[] name = input.split(" ");

                personel.compute(name[1], (k, v) -> {
                    if (v == null) {
                        return new ArrayList<>(Arrays.asList(name[0]));
                    } else {
                        v.add(name[0]);
                        return v;
                    }
                });
            }
        }

    }
}
