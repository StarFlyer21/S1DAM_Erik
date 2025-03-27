package ejercicios;

public class hiloLucha {
    public static void main(String[] args) throws InterruptedException {
        for (int j=0; j<3;j++) {
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000L * aleatorio());
                        System.out.println("SOY " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.start();
        }
    }
    private static int aleatorio(){
        return (int) (Math.floor(Math.random()*(1 - 10 +1)+ 10));
    }
}
