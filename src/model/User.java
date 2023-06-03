package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;


    public User (String name, String email) {
        this.name = name;
        this.email = email;
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
        if (phoneNumber.length() > 9) {
            System.out.println("el num debe ser 9 digitos como max");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    //sobreescribiendo un metodo
    @Override //esto dice q no es propio de la clase user, sino que es un metodo extraido de la super clase
    public String toString() {
        return "model.User: " + name + ", Email: " + email + "\n,Addrees:" + address + ", Phone:" + phoneNumber;
    }

    public abstract void showDataUser(); //creamos clase abstracta y la usamos en doctor, nurse, patient

}
