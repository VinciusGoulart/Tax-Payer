package org.example.aplication;

import org.example.entities.Company;
import org.example.entities.Individual;
import org.example.entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Payer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double income = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Heath expenditures: ");
                double heath = sc.nextDouble();
                payers.add(new Individual(name, income, heath));
            } else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                payers.add(new Company(name, income, employee));
            }
        }

        double sum = 0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Payer p : payers) {
            sum += p.tax();
            System.out.println(p);
        }

        System.out.println();
        System.out.printf("TOTAL TAX: $ %.2f%n", sum);
        sc.close();
    }
}