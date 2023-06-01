
import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jean ","jean@gmail.com");
        myDoctor.addAvailableAppointment(new Date(),"1pm");
        myDoctor.addAvailableAppointment(new Date(),"4pm");

        System.out.println(myDoctor);
//        System.out.println(myDoctor.getAvailableAppointments());
//
//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments() ) {
//            System.out.println(aA.getDate() + " " + aA.getTime() );
//        }
//
//        System.out.println("");

        Patient patient = new Patient("ale","ale@gmail.com");
        System.out.println(patient);
    }
}
