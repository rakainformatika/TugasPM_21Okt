package com.github.affandes.kuliah.pm;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<String> browserHistory = new LinkedList<>();

    public static void view() {
        if (browserHistory.isEmpty()) {
            System.out.println("No history available.");
        } else {
            System.out.println("Browser History:");
            for (int i = browserHistory.size() - 1; i >= 0; i--) {
                System.out.println(browserHistory.get(i));
            }
        }
    }

    public static void browse(String url) {
        browserHistory.add(url);
        System.out.println("Browsing: " + url);
    }

    public static void back() {
        if (browserHistory.size() > 1) {
            String lastUrl = browserHistory.removeLast();
            System.out.println("Going back from: " + lastUrl);
        } else if (!browserHistory.isEmpty()) {
            System.out.println("Already at the first page: " + browserHistory.getFirst());
        } else {
            System.out.println("No history to go back to.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Browse new website");
            System.out.println("2. View history");
            System.out.println("3. Go back");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    browse(url);
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    back();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }
}
