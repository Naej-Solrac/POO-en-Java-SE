import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jean ","Cardiologia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("alejandra", "ale@gmail.com");
        patient.setWeight(54.5);
        System.out.println(patient.getWeight());
    }
}
