package model;

import model.User;

public class Patient extends User { //herencia
    //atributos
    private String  birthday, blood;
    private double weight, height;

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

}
