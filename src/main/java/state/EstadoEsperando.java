package state;

public class EstadoEsperando extends Estado{
    public EstadoEsperando(Maquina maquina){
        super(maquina);
    }
    @Override
    public String echarMoneda() {
        maquina.cambiaEstado(new EstadoPagado(maquina));
        return "Ya puedes seleccionar la bebida";
    }

    @Override
    public String seleccionarBebida() {
        return "Introduce el importe.";
    }

    @Override
    public String cogerBebida() {
        return "Selecciona una bebida.";
    }
}
