package state;

abstract public class Estado {
    public Maquina maquina;

    public Estado(Maquina maquina){
        this.maquina = maquina;
    }

    abstract public String echarMoneda();
    abstract public String seleccionarBebida();
    abstract public String cogerBebida();
}
