package model;

public class Nurse extends User {
    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() { //uso de clase abstracta
        System.out.println("Empleado del Hospital: Carrion");
        System.out.println("Departamentos: Nutriologia, Pediatria");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
