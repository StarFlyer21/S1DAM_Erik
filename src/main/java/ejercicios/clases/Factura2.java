package ejercicios.clases;

import ejercicios.Factura;
import java.time.LocalDate;
import java.util.Objects;

// Extendemos Factura para añadir la implementación de Comparable
// tal y como hicimos con Leon en este tema
public class Factura2 extends Factura implements Comparable<Factura2>{
    // No puedo haber dos facturas con el mismo id
    public Factura2(String numFactura, LocalDate fecha, Double total){
        super(numFactura);
        this.setFecha(fecha);
        this.setTotal(total);
    }
    @Override
    public int compareTo(Factura2 o) {
        return Objects.hashCode(this)-Objects.hashCode(o);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Factura2 f = (Factura2) o;
        // Es lo mismo que usar hashcode pero con tolerancia a los nulos
        return Objects.hashCode(this)==Objects.hashCode(o);
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
