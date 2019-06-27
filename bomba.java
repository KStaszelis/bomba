import java.util.Scanner;
public class bomba {
    public static void main(String[] args) {
        Scanner bomba = new Scanner(System.in);
        int zegar;
        System.out.println("Podaj czas wybuchu bomby: ");
        zegar = bomba.nextInt();
        while (zegar > 0){
            System.out.println("Bomba wybuchnie za: " + zegar);
            zegar --;
        }
        System.out.println("BANG!");
    }
    }

