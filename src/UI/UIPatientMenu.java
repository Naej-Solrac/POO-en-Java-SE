package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu  {
    public static void showPatientMenu () {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogget);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while ( response != 0);
    }
    private static void showBookAppointmentMenu () {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select date: ");
            //indice del doctor
            //indice de la fecha seleccionada
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println(doctorSelected.getName()+". Time:" + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println(doctorSelected.getName()+". Date:" + doctorSelected.getAvailableAppointments().get(indexDate).getDate());

            System.out.println("Confir your appointment: \n1. yes \n2. Change data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogget.addAppointmentDoctors(doctorSelected,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }
        } while (response != 0);
    }
    private static void showPatientMyAppointments () {

        int response = 0;

        do {
            System.out.println("::My appointments");
            if (UIMenu.patientLogget.getAppointmentDoctors().size() == 0) {
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogget.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + "Date: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getDate());
                System.out.println(j + ". " + "Time: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getTime());
                System.out.println(j + ". " + "Time: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getDoctor());
            }

            System.out.println("0. Return");

        } while (response != 0);
    }
}
