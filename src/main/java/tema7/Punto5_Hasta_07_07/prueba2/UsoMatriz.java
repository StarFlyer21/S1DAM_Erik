package tema7.Punto5_Hasta_07_07.prueba2;

import examenes.matrices.anulado.correcciones.alumno561212.asdads;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz m = new Matriz(1);
        m.asigno(3,12); //En el índice colocamos en la posición 3 el índice 12
        int leido = m.leo(3);
        m.amplio(10);
        m.asigno(20,-12);
        System.out.println("La longitud es " + m.length());
        System.out.println("m = " + m);
    }
}
