import static UI.UIMenu.*;
public class Main {

        public static void main(String[] args){
                //showMenu();
                Doctor myDoctor = new Doctor("Andres", "Cirujano");
                System.out.println(myDoctor.getName());
                System.out.println(myDoctor.getSpeciality());

                Patient patient01 = new Patient("Adriel Hernandez", "adrielh@gmail.com");
                Patient patient02 = new Patient("alberto Fernandez", "alfer@gmail.com");

                System.out.println(patient01.getName());
                System.out.println(patient02.getName());
                patient02 = patient01;

                System.out.println(patient01.getName());
                System.out.println(patient02.getName());

                

                /*patient01.setWeight(56.6);
                System.out.println(patient01.getWeight());

                patient01.setPhoneNumber("1234567890");
                System.out.println(patient01.getPhoneNumber());
                */
                String name = "Adriel";
                int a = 4;
                int b = 0;
                b = a;


        }
}