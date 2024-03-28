public class Doctor {
    //Atributos de la clase. 
    static int id = 0; //Autoincrement
    String name, email;
    String speciality;
    Doctor(){
        System.out.println("se está usando la clase Doctor");
    }
    Doctor(String name, String speciality){
        id++;
        this.speciality = speciality;
        this.name = name;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId() {
        System.out.println("This is the Doctor's ID: " + id);
    }
}
 