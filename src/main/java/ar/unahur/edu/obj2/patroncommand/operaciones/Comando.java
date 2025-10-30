package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public abstract class Comando implements Operable{
    
    Programable microDeBackUp;

    @Override
    public void execute(Programable micro) {
        microDeBackUp = micro.copiar();
        this.doExecute(micro);
        micro.incProgramCounter();
    }

    public abstract void doExecute(Programable micro);

    @Override
    public void undo(Programable micro) {
        micro.copiarDesde(microDeBackUp);
    }

}
