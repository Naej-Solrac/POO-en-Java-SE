
import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jean ","Cardiologia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

<<<<<<< HEAD
        Patient patient = new Patient("alejandra", "ale@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());
=======
        Patient patient = new Patient("ale","ale@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("6561516165156");
        System.out.println(patient.getPhoneNumber());
>>>>>>> c611dc37aa48ad704f697118cc90abf6c3e2bb82
    }
}
