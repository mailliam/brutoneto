package ee.maila;

import java.util.Scanner;

/**
 * Created by Maila on 04/10/2015.
 */
public class Brutoneto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mis on Sinu brutopalk?");

        double brutopalk=sc.nextDouble();

        double maksuvaba_tulu=154.00;
        double tootuskindlustus=brutopalk*1.6/100;
        double kogumispension=brutopalk*2/100;
        double tulumaks=(brutopalk-maksuvaba_tulu-tootuskindlustus-kogumispension)*20/100;
        double netopalk=brutopalk-tootuskindlustus-kogumispension-tulumaks;


        System.out.printf("Sinu netopalk on %f eurot.",netopalk);
    }
}