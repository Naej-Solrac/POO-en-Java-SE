package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User { //herencia
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email) {
        super(name, email); //herencia
        System.out.println("el nombre del doc es: " + name);

        this.speciality = speciality;
    }
    //comportamientos

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); //coleccion
    public void addAvailableAppointment (String date, String time) {
        availableAppointments.add ( new Doctor.AvailableAppointment(date, time) );
    }

    public ArrayList <AvailableAppointment> getAvailableAppointments () {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "model.Doctor{" +
                "speciality='" + speciality + '\'' +
                ", availableAppointments=" + availableAppointments.toString() +
                '}';
    }

    @Override
    public void showDataUser() { //uso de clase abstracta
        System.out.println("Empleado del hospital: rebagliati");
        System.out.println("departamento: cardiologia");
    }

    public static class AvailableAppointment {
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }
        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
}
