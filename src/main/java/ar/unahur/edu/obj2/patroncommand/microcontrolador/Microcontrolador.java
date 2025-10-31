package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.excepciones.FueraDeRangoDeMemoriaException;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Microcontrolador implements Programable{

    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programaCounter;
    private List<Integer> memoria;

    @Override
    public void incProgramCounter() {
        programaCounter += 1;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        acumuladorA = value;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        acumuladorB = value;
    }



    public Microcontrolador() {
        this.reset();
    }

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o-> o.execute(this));
    }

    @Override
    public Integer getProgramCounter() {
        return programaCounter;
    }

    @Override
    public Integer getAcumuladorA() {
        return acumuladorA;
    }

    @Override
    public Integer getAcumuladorB() {
        return acumuladorB;
    }

    @Override
    public void setAddr(Integer addr){
        estaDentroDelRangoDeMemoria(addr);
        memoria.set(addr, acumuladorA);
    }

    @Override
    public Integer getAddr(Integer addr){
        estaDentroDelRangoDeMemoria(addr);
        return memoria.get(addr);
    }

    private void estaDentroDelRangoDeMemoria(Integer direccionEnMemoria){
        if (direccionEnMemoria <0 || direccionEnMemoria >= memoria.size()){
            throw new FueraDeRangoDeMemoriaException();
        }
    }

    @Override
    public void reset() {
        acumuladorA = 0;
        acumuladorB = 0;
        programaCounter = 0;
        memoria = Arrays.asList(new Integer[1024]);
    }

    @Override
    public Programable copiar() {
        Microcontrolador nuevo = new Microcontrolador();
        nuevo.acumuladorA = this.acumuladorA;
        nuevo.acumuladorB = this.acumuladorB;
        nuevo.programaCounter = this.programaCounter;
        return nuevo;
    }

    @Override
    public void copiarDesde(Programable microDeRespaldo) {
        this.acumuladorA = microDeRespaldo.getAcumuladorA();
        this.acumuladorB = microDeRespaldo.getAcumuladorB();
        this.programaCounter = microDeRespaldo.getProgramCounter();
    }
}
