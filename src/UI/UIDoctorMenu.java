package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
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
                    showAddAvailableAppointmentsMenu();
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
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("your date es :" + date + "\n1. Correct \n2Change date");
                int responseDate = Integer.parseInt(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time avalilable for date: "+ date + "[16:00]");
                    time = sc.nextLine();
                    System.out.println("your time is:"+ time + "\n1.Correct \n2.Change time");
                    responseTime = Integer.parseInt(sc.nextLine());
                } while (responseTime == 2);

                UIMenu.doctorLogget.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogget);

            } else if (response == 0) {
                showDoctorMenu();
            }

        }while (response != 0);
    }
    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
