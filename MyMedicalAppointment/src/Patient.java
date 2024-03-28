public class Patient {
    private String name;
    private String email;
    private String address;
    private String birthDate;
    private String blood;
    private String phoneNumber;
    private double weight;
    private double height;
    Patient(String name, String email){
        System.out.println("Se está usando a la case Patient");
        this.name = name;
        this.email = email;
        //resolver matrices con gaus yordan
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  String getName(){
        return this.name;
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
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10){
            System.out.println("Debes de asignar un número que sea de 10 digitos");
        } else {
            this.phoneNumber = phoneNumber;
        }

    }
    public String getHeight() {
        return height + " metros";
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getWeight(){
        return this.weight + " kg";
    }
}
