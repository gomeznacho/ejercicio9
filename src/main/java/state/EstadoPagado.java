package state;

public class EstadoPagado extends Estado{
    public EstadoPagado(Maquina maquina){
        super(maquina);
    }
    @Override
    public String echarMoneda() {
        return "Ya has introducido el importe";
    }

    @Override
    public String seleccionarBebida() {
        maquina.cambiaEstado(new EstadoEsperando(maquina));
        return "ya puedes seleccionar la bebida";
    }

    @Override
    public String cogerBebida() {
        return "tienes que seleccionar una bebida";
    }
}
