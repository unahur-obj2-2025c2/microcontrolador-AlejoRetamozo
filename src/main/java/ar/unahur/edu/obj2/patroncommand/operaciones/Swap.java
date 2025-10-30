package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Swap extends Comando {

    @Override
    public void doExecute(Programable micro) {
        Integer auxiliar = micro.getAcumuladorA();
        micro.setAcumuladorA(micro.getAcumuladorB());
        micro.setAcumuladorB(auxiliar);
    }

}
