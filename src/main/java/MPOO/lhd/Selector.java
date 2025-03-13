package MPOO.lhd;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Selector {

    //Definimos todos nuestros atributos (parecen muchos pero ya los optimizaremos en otra version)
    private String nombreInvita;
    private LocalDateTime fecha;
    private String nombreRecibe;
    private Integer empatia;
    private Integer utilidad;
    private Integer inteligencia;
    private Integer extroversion;
    private boolean preferente;


    //Creamos el constructor
    public Selector() {

    }

    //Aquí creamos los métodos (el uso que le vamos a dar a los atributos)


    //Con este metodo comprobamos si es preferente o no
    public void comprobarPreferencia(){
        Scanner sc1=new Scanner(System.in);
        System.out.print("System.out.print(\"Es preferente? (s/n) \");\n");
        String respuesta = sc1.nextLine().trim().toLowerCase();

        // Convierte la respuesta en booleano
        setPreferente(respuesta.equals("s"));
    }
    //Este metodo recogerá el resultado de las aptitudes y las sumará

    private int suma(int empatia, int utilidad, int inteligencia, int extroversion){
        return empatia+utilidad+inteligencia+extroversion;
    }
    public void setPreferente(boolean preferente) {
        this.preferente = preferente;

    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaFormateada = getFecha().format(formatter);

        double resultado = (double) suma(getEmpatia(),getUtilidad(),getInteligencia(),getExtroversion())/4;
        if (isPreferente()){
            resultado*=1.2;
            if (resultado>70){
                return "El resultado de "+ getNombreRecibe() +" es apto: " + resultado + "sobre 100, a fecha " + fechaFormateada;
            }
            else {
                return "El resultado de "+ getNombreRecibe() +" es no apto: " + resultado +" sobre 100, a fecha " + fechaFormateada;
            }
        }
        else {
            if (resultado>70){
                return "El resultado de "+ getNombreRecibe() +" es  apto: " + resultado + " sobre 100, a fecha "
                        + fechaFormateada;
            }
            else {
                return "El resultado de "+ getNombreRecibe() +" es no apto " + resultado + " sobre 100, a fecha "
                        + fechaFormateada;
            }
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
        return empatia;
    }
    public void setEmpatia(Integer empatia) {
        this.empatia = empatia;
    }
    public Integer getUtilidad() {
        return utilidad;
    }
    public void setUtilidad(Integer utilidad) {
        this.utilidad = utilidad;
    }
    public Integer getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(Integer inteligencia) {
       this.inteligencia= inteligencia;
    }
    public Integer getExtroversion() {
        return extroversion;
    }
    public void setExtroversion(Integer extroversion) {
        this.extroversion = extroversion;
    }
    public boolean isPreferente() {
        return preferente;
    }
}
