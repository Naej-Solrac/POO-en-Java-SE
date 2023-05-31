
import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jean ","Cardiologia");
        myDoctor.addAvailableAppointment(new Date(),"1pm");
        myDoctor.addAvailableAppointment(new Date(),"4pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments() ) {
            System.out.println(aA.getDate() + " " + aA.getTime() );
        }

//        Patient patient = new Patient("ale","ale@gmail.com");
//        patient.setWeight(54.5);
//        System.out.println(patient.getWeight());
//
//        patient.setPhoneNumber("6561516165156");
//        System.out.println(patient.getPhoneNumber());


    }
}
