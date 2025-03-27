package ejercicios.setEjercicios;

import ejercicios.setEjercicios.hotel.hotel;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class usoHotel {
    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Madrid");
        nombres.add("Zamora");
        nombres.add("Toledo");
        nombres.add("Sonseca");
        nombres.add("Talavera");
        nombres.add("Motu nui");
        nombres.add("Polinesia");
        nombres.add("Belgrado");
        nombres.add("Kyoto");
        nombres.add("Leningrado");
        nombres.add("Arcansas");
        nombres.add("Oregon");
        nombres.add("Barsaluna");
        nombres.add("Kanto");
        nombres.add("Europa");
        SortedSet<hotel> uso=new TreeSet<>();
        for (int i=0;i<13;i++){
            hotel p=new hotel(i,nombres.get(random2()),random());
            uso.add(p);
        }
        System.out.println(uso);
    }
    private static int random(){
        int n=100;
        int m=1000;
        return (int) (Math.floor(Math.random()*(n-m+1)+m));
    }
    private static int random2(){
        int n=1;
        int m=15;
        return (int) (Math.floor(Math.random()*(n-m+1)+m));
    }
}
