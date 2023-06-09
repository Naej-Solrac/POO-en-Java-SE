package model;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User { //herencia
    //atributos
    private String  birthday, blood;
    private double weight, height;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name, email); //herencia
    }

    //54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 kg.
    public String getWeight() {
        return this.weight + " Kg. ";
    }

    public String getHeight() {
        return height + " Mts. ";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nheight: " + getHeight() + "\nblood: " + blood;
    }

    @Override
    public void showDataUser() { //uso de clase bastracta
        System.out.println("Paciente" + getName());
        System.out.println("Historia completa del paciente");
    }

}
