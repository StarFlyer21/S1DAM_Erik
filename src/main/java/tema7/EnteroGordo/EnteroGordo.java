package tema7.EnteroGordo;

/**
 *Es la creación de un entero capaz de almacenar 170 dígitos.
 * Con las operaciones de multiplicar un entero.
 */
public class EnteroGordo {
    private final String contenido;
    /**
     * Crea un EnteroGordo con el entero pasado
     * @param i
     */
    public EnteroGordo (int i){
        StringBuilder aux=new StringBuilder(i+"");
        contenido=aux.reverse().toString();
    }

    public EnteroGordo(EnteroGordo e){

        this.contenido=e.contenido;
    }
    /**
     * Crea un nuevo entero gordo resultado de este EnteroGordo multiplicado por n.
     * @param n Valor a multiplicar
     * @return Resultado devuelto
     */
    public EnteroGordo multiplica(int n) {
        EnteroGordo aux=new EnteroGordo(0);
        for (int i=0;i<n;i++){
            aux.suma(this);
        }
        return aux;
    }

    public void multiplica(int n,boolean b){
        EnteroGordo e=new EnteroGordo(this);
        for (int i=1;i<n;i++){//empiezo en 1 porque si no, suma una vez más
            this.suma(e);
        }
    }

    /**
     *
     * @param e
     */
    private void suma(EnteroGordo e) {
    }
}