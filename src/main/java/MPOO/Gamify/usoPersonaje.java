package MPOO.Gamify;

import java.util.Scanner;

public class usoPersonaje {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad de tu personaje");
        personaje1.setEdad(sc.nextInt());
        System.out.println("Introduce el nombre de tu personaje");
        personaje1.setNombre(sc.next());
        personaje1.preguntarListaClases();
        System.out.println("Introduce la clase de tu personaje");
        personaje1.setClase(sc.next());
        sc.close();

    }
}
