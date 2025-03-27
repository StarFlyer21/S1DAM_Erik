package MPOO.lhd;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class usoSelector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Selector p = new Selector();

        //Literalmente todo este bloque es agregarle el contenido a los atributos (gracias a los setter y getter)
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
        p.comprobarPreferencia();
        sc.close();

        //Esto hace que nuestra clase tome el metodo sobreescrito de toString y nos lo imprima formateado por pantalla
        System.out.println(p.toString());
    }
}
