package UI;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String [] MONTHS = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Octubre", "Noviembre", "Diciembre"
    };
    public static Doctor doctorLogget;
    public static Patient patientLogget;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser (int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("doctor perez", "perez@gmail.com"));
        doctors.add(new Doctor("doctor hernandez", "hernandez@gmail.com"));
        doctors.add(new Doctor("doctor zapata", "zapata@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("loco vargas", "vargas@gmail.com"));
        patients.add(new Patient("loco farfan", "farfan@gmail.com"));
        patients.add(new Patient("loco advincula", "advincula@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("inser your email");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //obtener usuario logeado
                        doctorLogget = d;
                        //showDoctorMenu
                    }
                }
            }
            if (userType == 2) {
                for (Patient p: patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        //obtener usuario logeado
                        patientLogget = p;
                        //showPatientMenu
                    }
                }
            }
        } while (!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}
