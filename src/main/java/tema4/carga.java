package tema4;

public class carga {
    public static void main(String[] args) {
        int s=2;
        System.out.println("Antes de inc a = " + s);
        inc(s);
        System.out.println("Despues de inc a = " + s);
    }

    private static void inc(int a){
        a=a+1;
    }
}
