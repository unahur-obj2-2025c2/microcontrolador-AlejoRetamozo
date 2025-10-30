package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public interface Operable {

    void execute(Programable micro);

    void doExecute(Programable micro);

    void undo(Programable micro);
}
