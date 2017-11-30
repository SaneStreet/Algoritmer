import java.util.ArrayList;
import java.util.Scanner;

public class Algoritmer {
    public static void main(String[] args) {
        String[] names = {"Michael", "Lasse", "Niels", "Achton", "Liselotte", "Lisa"};

        //System.out.print("Skriv et navn: ");
        //Scanner input = new Scanner(System.in);
        //String sog = input.next();

        String sog = "Liselotte";
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i] + "\t");

            if (sog == names[i]){
                System.out.print(names[i] + " fundet på Index " + i + " \n");
        }

    }
    }
}
