package ar.unahur.edu.obj2.patroncommand.operaciones;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Composite extends Comando {
    List<Operable> operaciones = new ArrayList<>();

    public Composite(List<Operable> operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public void doExecute(Programable micro) {
        micro.run(operaciones);
    }

    protected Boolean noEsCero(Programable micro) {
        return !micro.getAcumuladorA().equals(0);
    }


}
