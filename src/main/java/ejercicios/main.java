package ejercicios;

public class main {
    public static void main(String[] args) throws InterruptedException {
        //1) Crea un hilo que escriba, sin parar, un entero ascendente correspondiente al número de segundos
        //transcurridos desde su inicio. Escribirá cada segundo. No puedes crear ningún fichero adicional

        //implementamos una interfaz funcional
        Thread hilo1 = new Thread(()->{
            int i=0;
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("Me llamo " + Thread.currentThread().getName());
                    i++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("Tiempos en segundos:\n"+i);
            }
        });
        hilo1.start();
    }
}
