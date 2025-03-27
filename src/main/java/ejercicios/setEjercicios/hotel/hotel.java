package ejercicios.setEjercicios.hotel;

import java.util.Objects;

public class hotel implements Comparable<hotel>{
    private int idHotel; private String zona; private int precio;

    public hotel (int idHotel, String zona, int precio){
        this.idHotel=idHotel; this.zona=zona; this.precio=precio;
    }

    @Override
    public String toString(){
         return "Hotel-> ID: "+idHotel+" Zona: "+zona+" Precio: "+precio+"\n";
    }

    @Override
    public int compareTo(hotel o) {
        return this.idHotel-o.idHotel;
    }

    @Override
    public int hashCode(){
        return precio + zona.hashCode() + idHotel;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {   return false;  }
        if (getClass() != obj.getClass()) {  return false;   }
        final hotel other = (hotel) obj;
        if (this.idHotel != other.idHotel) {  return false;    }
        if (!Objects.equals(this.precio, other.precio)) {    return false;     }
        if (this.zona != other.zona) {     return false;   }
        return true;
    }
}
