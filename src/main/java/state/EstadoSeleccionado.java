package state;

public class EstadoSeleccionado extends Estado{
    public EstadoSeleccionado(Maquina maquina){
        super(maquina);
    }
    @Override
    public String echarMoneda() {
        return "Ya has introducido el importe";
    }

    @Override
    public String seleccionarBebida() {
        return "Ya has seleccionado tu bebida";
    }

    @Override
    public String cogerBebida() {
        maquina.cambiaEstado(new EstadoEsperando(maquina));
        return "Aquí está tu bebida";
    }
}