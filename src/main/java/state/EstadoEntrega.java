package state;

public class EstadoEntrega extends Estado{
    public EstadoEntrega(Maquina maquina){
        super(maquina);
    }
    @Override
    public String echarMoneda() {
        return null;
    }

    @Override
    public String seleccionarBebida() {
        return null;
    }

    @Override
    public String cogerBebida() {
        return null;
    }
}