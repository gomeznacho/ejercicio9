package state;

public class Maquina {
    public Estado estado;

    public Maquina(){
        estado = new EstadoEsperando(this);
    }

    public void cambiaEstado(Estado estado){
        //Estado antes del cambio
        System.out.println("Estado 1 " + this.estado.getClass().getName());

        //Cambio de estado
        this.estado = estado;

        //Estado después del cambio
        System.out.println("Estado 2 " + this.estado.getClass().getName());
    }

    public Estado getEstado(){
        return estado;
    }
}
