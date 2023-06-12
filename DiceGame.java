import java.util.Scanner;
import java.util.Random;

class DiceGame{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int d1, d2, total;

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Roling dice...");

        d1 = rand.nextInt(7);
        d2 = rand.nextInt(7);
        total = d1 + d2;
        System.out.println("Die 1:" + d1);
        System.out.println("Die 2:" + d2);
        System.out.println("Total value: " + total);

        if(total >= 7)System.out.println( name + "won");
        else System.out.println( name + "lost");
    }
}