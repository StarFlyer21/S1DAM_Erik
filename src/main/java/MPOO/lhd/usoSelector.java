package MPOO.lhd;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class usoSelector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Selector p = new Selector();

        System.out.println("Quién invitó?");
        p.setNombreInvita(sc.next());
        p.setFecha(LocalDateTime.now());
        System.out.println("Quién fue invitado?");
        p.setNombreRecibe(sc.next());
        System.out.println("Procederemos a analizar el test");
        System.out.print("Empatía: ");
        p.setEmpatia(sc.nextInt());
        System.out.print("Utilidad: ");
        p.setUtilidad(sc.nextInt());
        System.out.print("Inteligencia: ");
        p.setInteligencia(sc.nextInt());
        System.out.print("Extroversion: ");
        p.setExtroversion(sc.nextInt());
        System.out.print("Es preferente? (s/n) ");
        p.setPreferente(sc.nextBoolean());
        System.out.println("Los resultados son:");

        sc.close();
        //p.resultado();
    }
}
