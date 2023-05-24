public class Doctor {
    //atributos
    static int id = 0; //Autoincrement
    String name, speciality;
    Doctor () {
        System.out.println("calling constructor");
        id ++;
    }
    Doctor (String name) {
        System.out.println("el nombre del doc es: " + name);
    }
    //comportamientos
    public void showName () {
        System.out.println(name);
    }
    public void showId () {
        System.out.println("ID del doctor: " + id);
    }
}
