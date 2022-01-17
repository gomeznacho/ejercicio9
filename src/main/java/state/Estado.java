package state;

/**
 * Esta es la clase de la que derivan el resto de Estados
 */
abstract public class Estado {
    public Maquina maquina;

    public Estado(Maquina maquina){
        this.maquina = maquina;
    }

    /*podríamos considerar cualquiera de estas funciones como funciones limpias,
    ya que hacen exactamente lo que dicen sus nombres y no tienen efectos secundarios
    que no sean los que se esperan.
    */
    abstract public String echarMoneda();
    abstract public String seleccionarBebida();
    abstract public String cogerBebida();
}
