package ejercicios;

import ejercicios.clases.Factura2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.*;

public class arrayList {

    public static void main(String[] args) {
        List<Factura2> facturas =
                Arrays.asList(
                        new Factura2("2022/31/21", toLD("2025/10/23"), 21.12),
                        new Factura2("2022/31/21", toLD("2025/10/24"), 22.12),
                        new Factura2("2022/31/21", toLD("2025/10/25"), 23.12),
                        new Factura2("2022/31/25",toLD("2025/10/26"),24.13),
                        new Factura2("2022/31/26",toLD("2025/10/27"),25.13)
                        );
        Collections.sort(facturas);
        System.out.println("En orden ascendente de id");
        facturas.forEach(System.out::println);
    }

    private static LocalDate toLD(String fecha) {
        // ofPattern usa el formato español de fecha aunque podemos poner un formato concreto
        // de la forma ofPattern("d/M/YYYY",fecha)
        // Los patrones los puedes encontrar directamente en la clase
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd", new Locale("es"));
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(fecha, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return null;
        }
        return localDate;
    }
}
    /*private static LocalDate toLD(String fecha){
        // ofPattern usa el formato español de fecha aunque podemos poner un formato concreto
        // de la forma ofPattern("d/M/YYYY",fecha)
        // Los patrones los puedes encontrar directamente en la clase
        final DateTimeFormatter format = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
        LocalDate localDate;
        try { localDate = LocalDate.parse(fecha, format);
        return localDate;
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }}*/

