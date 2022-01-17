package state;

/**
 * Autor: J.Jonez
 * 17/01/2022
 */
public class Main {
    public static void main(String[] args) {
        Maquina maq1 = new Maquina();

        System.out.println(maq1.getEstado());

        System.out.println(maq1.estado.echarMoneda());
        System.out.println(maq1.estado.seleccionarBebida());
        System.out.println(maq1.estado.cogerBebida());

        System.out.println(maq1.getEstado());

    }
}
