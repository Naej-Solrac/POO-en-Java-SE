public class Patient {
    int id;
    private String name;
    private String email, address, phoneNumber, birthday, blood;
    private Double weight,height;
    Patient (String name, String email) {
        this.name = name;
        this.email = email;
        this.height = 54.5;
        System.out.println(height + "kg");
    }
}
