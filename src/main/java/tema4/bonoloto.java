package tema4;

import java.util.Arrays;

public class bonoloto {
    final static int N=1;
    final static int M=6;
    public static void main(String[] args) {
        int i=0;
        boolean[] array1 = new boolean[50];
        int[] array2 = new int[6];
        while (i<array2.length){
        int a = (int) Math.floor(Math.random()*49+1);
            System.out.println(a);
            if (array1[a] == false){
                array1[a]=true;
                array2[i]=a;
                i++;
            }
        }
        System.out.println("La bonoloto es: " + Arrays.toString(array2));
    }
}
