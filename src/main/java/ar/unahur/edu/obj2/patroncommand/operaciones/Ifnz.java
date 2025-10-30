package ar.unahur.edu.obj2.patroncommand.operaciones;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Ifnz extends Composite{

    public Ifnz(List<Operable> operaciones) {
        super(operaciones);
    }

    @Override
    public void doExecute(Programable micro) {
        if (this.noEsCero(micro)) {
            super.doExecute(micro);
        }
    }
}
