import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

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

        myDoctor.showDataUser();
        User user = new Patient("pablo","pablo@gmail.com");
        user.showDataUser();

        // metodo anonimo //se usa mas en aplicativos android ejmplo onckick donde queremos que el comportamiento sea vigente solo en ese momento
        User user1 = new User("Anahi", "anahi@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("doctor");
                System.out.println("hospital: cruz verde");
                System.out.println("departamento: gediatria");
            }
        };
        user1.showDataUser();
    }
}
