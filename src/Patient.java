public class Patient {
    //atributos
    int id;
    private String name;
    private String email, address, phoneNumber, birthday, blood;
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
        this.name = name;
        this.email = email;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
