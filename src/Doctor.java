public class Doctor {
    //atributos
    int id;
    String name, speciality;
    Doctor () {
        System.out.println("calling constructor");
    }
    Doctor (String name) {
        System.out.println("el nombre del doc es: " + name);
    }
    //comportamientos
    public void showName () {
        System.out.println(name);
    }
}
