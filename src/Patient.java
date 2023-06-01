public class Patient extends User{ //herencia
    //atributos
    private String  birthday, blood;
    private double weight, height;
<<<<<<< HEAD
    Patient (String name, String email) {
        this.name = name;
        this.email = email;
    }
    //54.5
    public void setWeight (double weight) {
        this.weight = weight;
    }
    // 54.5 kg.
    public String getWeight () {
=======

    Patient(String name, String email) {
        super(name, email); //herencia
    }

    //54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 kg.
    public String getWeight() {
>>>>>>> c611dc37aa48ad704f697118cc90abf6c3e2bb82
        return this.weight + " Kg. ";
    }

    public String getHeight() {
        return height + " Mts. ";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void setPhoneNumber(String phoneNumber) {
<<<<<<< HEAD
<<<<<<< HEAD
        if (phoneNumber.length() > 9 ) {
            System.out.println("el num debe ser 9 digitos como max");
        } else if (phoneNumber.length() == 8) {
        this.phoneNumber = phoneNumber;
=======
        if (phoneNumber.length() > 9) {
            System.out.println("el num debe ser 9 digitos como max");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
>>>>>>> c611dc37aa48ad704f697118cc90abf6c3e2bb82
        }
=======

>>>>>>> 9d41e892488f3a1a99426dd161d333715954debd
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

<<<<<<< HEAD

=======
>>>>>>> c611dc37aa48ad704f697118cc90abf6c3e2bb82
}
