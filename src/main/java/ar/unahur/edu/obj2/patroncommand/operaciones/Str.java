package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Str extends Comando {

    private final Integer addr;

    public Str(Integer addr) {
        this.addr = addr;
    }

    @Override
    public void doExecute(Programable micro) {
        micro.setAddr(addr);
    }

}
