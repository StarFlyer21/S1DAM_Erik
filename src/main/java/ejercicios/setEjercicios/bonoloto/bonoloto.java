package ejercicios.setEjercicios.bonoloto;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class bonoloto {
    public static void main(String[] args) {
        int num = 50;
        int num1=0;
        //Creamos el arraylist que tendrá todos los números
        ArrayList<Integer> bono= new ArrayList<>();
        //Creamos el set que tendrá el resultado
        Set<Integer> resultado = new LinkedHashSet<>();
        //Añadimos todos los números al arraylist
        for (int i=1;i<num;i++){
            bono.add(i);
        }

        for (int i=0;i<6;i++){
            //Creamos una variable que almacenará los números aleatorios y los iremos cargando en resultado
            num1=bono.get(random(bono.size()));
            resultado.add(num1);
        }
        System.out.println(bono);
        for (int x:resultado){
            System.out.print(x + " ");
        }
    }
    private static int random(int size) {
        return (int)(Math.random() * 49); // genera entre 0 y 49
    }

}
