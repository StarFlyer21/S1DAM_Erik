package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class stringToDate {
    public static void main(String[] args) {
        String txtfecha = "2022-05-10";
        DateTimeFormatter format = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
        LocalDate fecha = LocalDate.parse(txtfecha, format);
        System.out.println("Fecha: " + fecha);
    }
}
