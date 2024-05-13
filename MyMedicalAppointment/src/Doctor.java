public class Doctor {
    //Atributos de la clase. 
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;



    //Getters y setters
    public String getName(){ return  this.name;}
    public String getSpeciality(){return this.speciality; }
    public String getEmail(){   return this.email; }




    public void setName(String name){   this.name = name;   }
    public void setEmail(String e){     this.email = e;     }
    public void setSpeciality(String sp){    this.speciality = sp;    }





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
        System.out.println(this.name);
    }
    public void showId() {
        System.out.println("This is the Doctor's ID: " + id);
    }

    public static class AvaraibleAppointment {
        private String date;
        private String time;
        private int id_avariableAppointment;

        public void setId_avariableAppointment(int id_aApp) {   this.id_avariableAppointment = id_aApp; }
        public void setTime(String t) { this.time = t;}
        public void setDate(String d) {this.date = d;}

        public String getDate() {   return this.date;   }
        public String getTime() {   return this.time;}

        public int getId_avariableAppointment() {return this.id_avariableAppointment;}

        public AvaraibleAppointment(String date, String time) {
            this.date = date;
            this.time = time;

        }
    }




}



 