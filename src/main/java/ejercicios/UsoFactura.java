package ejercicios;
import tema7.Punto5_Hasta_07_07.Factura;

import java.time.LocalDate;
import java.util.Date;

public class UsoFactura {
    public static void main(String[] args) {
        // Comenta una de ellas y prueba
        usoFacturasSinClose();
        //usoFacturasConClose();
    }

// Crea una factura con la fecha actual y la siguiente en secuencia con la fecha de dentro de 5 días (sin harcodear)
    private static void usoFacturasSinClose(){
        // Uso sin tener en cuenta Close, correcto si no tenemos close
        System.out.println("Nº facturas (paso1.1)="+ ejercicios.Factura.getCuantas());
        ejercicios.Factura f1=new ejercicios.Factura();
        f1.setNumFactura("2025/A/3334");
        f1.setFecha(LocalDate.now());
        System.out.println("f1 = " + f1);
        System.out.println("Nº facturas (paso1.2)="+ ejercicios.Factura.getCuantas());
        // Utilizo el otro constructor
        // MOD 11-02-25: Cambio número de factura
        ejercicios.Factura f2=new ejercicios.Factura("2025/A/3338");
        f2.setFecha(LocalDate.now().plusDays(5));
        System.out.println("f2 = " + f2);
        System.out.println("Nº facturas (paso1.3)="+ ejercicios.Factura.getCuantas());
    }

    private static void usoFacturasConClose(){
        // Uso correcto si añadimos función close
        System.out.println("Nº facturas (paso2.1)="+ ejercicios.Factura.getCuantas());
        try (ejercicios.Factura fc1=new ejercicios.Factura()) {
            fc1.setNumFactura("2025/A/1");
            fc1.setFecha(LocalDate.now());
            System.out.println("fc1 = " + fc1);
            System.out.println("Nº facturas (paso2.2)="+ ejercicios.Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso2.3)="+ ejercicios.Factura.getCuantas());
        try (ejercicios.Factura fc2=new ejercicios.Factura()) {
            fc2.setNumFactura("2025/A/34");
            fc2.setFecha(LocalDate.now());
            System.out.println("fc2 = " + fc2);
            System.out.println("Nº facturas (paso2.4)="+ ejercicios.Factura.getCuantas());
        } catch (Exception e){};
        System.out.println("Nº facturas (paso2.5)="+ Factura.getCuantas());
    }
}
