package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Add extends Comando {

    @Override
    public void doExecute(Programable micro){
    Integer resultado = micro.getAcumuladorA() + micro.getAcumuladorB();
    micro.setAcumuladorA(resultado);
    micro.setAcumuladorB(0);
    }

}
