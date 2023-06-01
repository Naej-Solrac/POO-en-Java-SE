import model.Doctor;
import model.Patient;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jean ","jean@gmail.com");
        myDoctor.addAvailableAppointment(new Date(),"1pm");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        System.out.println(myDoctor);

        Patient patient = new Patient("ale","ale@gmail.com");
        System.out.println(patient);

    }
}
