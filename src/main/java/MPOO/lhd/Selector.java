package MPOO.lhd;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Selector {

    //Definimos todos nuestros atributos (parecen muchos pero ya los optimizaremos en otra version)
    private String nombreInvita;
    private LocalDateTime fecha;
    private String nombreRecibe;
    private Integer Empatia;
    private Integer Utilidad;
    private Integer Inteligencia;
    private Integer Extroversion;
    private boolean Preferente;


    //Creamos el constructor
    public Selector() {

    }

    //Aquí creamos los métodos (el uso que le vamos a dar a los atributos)

    //Este metodo recogerá el resultado de las aptitudes y las sumará


    //Con este metodo comprobamos si es preferente o no
    public void comprobarBool(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("System.out.print(\"Es preferente? (s/n) \");\n");
        String respuesta = sc1.nextLine().trim().toLowerCase();

        // Convierte la respuesta en booleano
        setPreferente(respuesta.equals("s"));
    }
    public void setPreferente(boolean preferente) {
        Preferente = preferente;
        if(preferente) {
            System.out.println("hola");
        }
        else{
            System.out.println("adios");
        }
    }

    //SETTERS Y GETTERS

    //Con este setter estamos creando métodos para poder almacenar la variable que le pasemos
    public void setNombreInvita(String nombreInvita){
            this.nombreInvita=nombreInvita;
    }
    //Con estos getters estamos creando métodos para poder devolver la variable que le indiquemos en cada caso
    public String getNombreInvita(){
            return nombreInvita;
    }
    public void setFecha(LocalDateTime fecha){
            this.fecha=fecha;
    }
    public LocalDateTime getFecha(){
            return fecha;
    }
    public void setNombreRecibe(String nombreRecibe){
            this.nombreRecibe=nombreRecibe;
    }
    public String getNombreRecibe(){
            return nombreRecibe;
    }
    public Integer getEmpatia() {
        return Empatia;
    }
    public void setEmpatia(Integer empatia) {
        Empatia = empatia;
    }
    public Integer getUtilidad() {
        return Utilidad;
    }
    public void setUtilidad(Integer utilidad) {
        Utilidad = utilidad;
    }
    public Integer getInteligencia() {
        return Inteligencia;
    }
    public void setInteligencia(Integer inteligencia) {
        Inteligencia = inteligencia;
    }
    public Integer getExtroversion() {
        return Extroversion;
    }
    public void setExtroversion(Integer extroversion) {
        Extroversion = extroversion;
    }
    public boolean isPreferente() {
        return Preferente;
    }



}
