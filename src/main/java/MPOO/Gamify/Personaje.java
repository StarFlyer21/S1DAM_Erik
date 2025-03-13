package MPOO.Gamify;

import java.util.Scanner;

public class Personaje {

    private String nombre;
    private int edad;
    private String clase;
    private boolean listaClases;

    public void saludar(){
        System.out.print("Hola!!");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setClase(String clase) {
        if (clase.equalsIgnoreCase("Mago")||clase.equalsIgnoreCase("Asesino")||
        clase.equalsIgnoreCase("Berserk")){
            this.clase = clase;
            System.out.println("Escogió la clase "+clase);
        } else {
            System.out.println("La clase indicada no es válida, por favor, indique alguna de la lista");
        }

    }

    public String getClase() {
        return clase;
    }

    public boolean getListaClases() {
        return listaClases;
    }

    public void setListaClases(boolean listaClases) {
        this.listaClases = listaClases;
        if (listaClases) {  // Solo muestra la lista si el booleano es true
            System.out.println("Las clases disponibles son:");
            System.out.println("- Mago");
            System.out.println("- Asesino");
            System.out.println("- Berserk");
        }
    }
    public void preguntarListaClases() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Quieres ver la lista de clases? (s/n): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        // Convierte la respuesta en booleano
        setListaClases(respuesta.equals("s"));
    }
}
