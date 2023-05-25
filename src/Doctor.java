public class Doctor {
    //atributos
    static int id = 0; //Autoincrement
    String name, speciality;
    Doctor () {
        //System.out.println("calling constructor");

    }
    Doctor (String name, String speciality) {
        System.out.println("el nombre del doc es: " + name);
        id ++;
        this.name = name;
        this.speciality = speciality;
    }
    //comportamientos
    public void showName () {
        System.out.println(name);
    }
    public void showId () {
        System.out.println("ID del doctor: " + id);
    }
}
