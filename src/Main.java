import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("");
        myDoctor.name = "Jean Gonzales";
        myDoctor.showName();
        System.out.println("Id del doctor: " + Doctor.id); //una forma

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.showId(); // la otra forma, esta es mas adecuada

        showMenu();

    }
}
