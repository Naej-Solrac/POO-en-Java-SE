package UI;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu () {
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Doctor");
            System.out.println("Welcome: " + UIMenu.doctorLogget.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. my scheduled appointments");
            System.out.println("0. Log out");

            Scanner  sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    showDoctorMenu();
                    break;
            }
        } while ( response != 0);
    }
    private static void showAddAvailableAppointmentsMenu () {
        int response = 0;
        do {
            System.out.println("::Add Available appointment");
            System.out.println("::Select a Month");
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + "." + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner  sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            if (response > 0 && response <4 ) {
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("your date es :" + date + "\n1. Correct \n2Change date");
            } else if (response == 0) {
                showDoctorMenu();
            }

        }while (response != 0);
    }
}
