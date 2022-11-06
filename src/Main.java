import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(walkingOutside(30,20));
        System.out.println(walkingOutside(15,20));
        System.out.println(walkingOutside(46,20));
        System.out.println(walkingOutside(50,-11));
        System.out.println(walkingOutside(60,-20));

        System.out.println("                                     ");


        System.out.println(walkingOutside(generateRandomAge(),20));
        System.out.println(walkingOutside(generateRandomAge(),20));
        System.out.println(walkingOutside(generateRandomAge(),20));
        System.out.println(walkingOutside(generateRandomAge(),-11));
        System.out.println(walkingOutside(generateRandomAge(),-20));

    }

    public static String walkingOutside(int age, int temperature) {
        if (age >= 25 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "mojno idti gulyat ";
        }
        if (age < 20 && temperature > 0 && temperature <28) {
            return "mojno idti gulyat 2";
        }
        if (age > 45 && temperature >= -10 && temperature <= 25 ){
            return "mojno idti gulyat 3";
        }
        else;{
        return "stay at home";}
    }
    public static int generateRandomAge(){
        Random age = new Random();
        return age.nextInt(75);

    }
}