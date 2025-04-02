package main.java;
import java.util.Scanner;

public class App {

    }
    public static void main(String[] args) throws Exception {

        CorpoHumano c1 = new CorpoHumano (70, 0.07f);
        
        System.out.printl("Massa: " + c1.getMassa() + "kg");
        System.out.printl("Volume: " + c1.getMassa() + "m2");
        System.out.printl("Densidade: " + c1.getMassa() + "kg/m3");

        c1.setDensidade(75);
        c1.setAltura(1.75f);

        c1.setMassa(70);

        System.out.println("Massa :" + c1.getMassa() + "Kg");
        System.out.println("Volume :" + c1.getVolume() + "m3s");
        System.out.println("Densidade :" + c1.getDensidade() + "Kg/m2");
        System.out.println("IMC :" + c1.getIMC());


    }
}
