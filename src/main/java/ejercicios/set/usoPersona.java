package ejercicios.set;

import ejercicios.set.clase.Persona;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class usoPersona {
    public static void main(String[] args) {
        Set<Persona> cjsp = new HashSet<>();
        SortedSet<Persona> cjssp = new TreeSet<>();
        Persona p = new Persona(1,"Marta",165);
        cjsp.add(p);
        cjssp.add(p);
        p=new Persona(2,"Elena",155);
        cjsp.add(p);
        cjssp.add(p);
        p=new Persona(3,"Maria",170);
        cjsp.add(p);
        cjssp.add(p);
        System.out.println("Personas en conjunto" + cjsp);
        System.out.println("Personas en el conjunto ordenado" + cjssp);
    }
}
