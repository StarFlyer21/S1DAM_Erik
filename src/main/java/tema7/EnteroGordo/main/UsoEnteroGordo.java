package tema7.EnteroGordo;

public class UsoEnteroGordo {
    public static void main(String[] args) {
        EnteroGordo e=factorial(100);
        System.out.println(e);

    }

    private static EnteroGordo factorial(int n) {
        if (n==0) return new EnteroGordo(1);
        return factorial(n-1).multiplica(n);
    }

    private static long factorial2(int n) {
        if (n==0) return 1;
        return factorial2(n-1)*n;
    }
}
