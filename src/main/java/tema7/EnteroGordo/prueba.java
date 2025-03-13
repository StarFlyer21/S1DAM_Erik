package tema7.EnteroGordo;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner((System.in));

        System.out.println("Introduce tu primer nº");
        String originalStr = sc.next();
        String reversedStr = "";

        System.out.println("Introduce tu segundo nº");
        String originalStr2 = sc2.next();
        String reversedStr2 = "";

        sc.close();
        sc2.close();
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;

        }
        for (int i = 0; i < originalStr2.length(); i++) {
            reversedStr2 = originalStr2.charAt(i) + reversedStr2;

        }


        System.out.println("Reversed string: "+ reversedStr);
        System.out.println("Reversed string: "+ reversedStr2);

    }
}
