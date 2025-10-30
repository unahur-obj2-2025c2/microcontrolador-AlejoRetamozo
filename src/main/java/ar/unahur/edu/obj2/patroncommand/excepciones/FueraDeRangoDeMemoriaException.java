package ar.unahur.edu.obj2.patroncommand.excepciones;

public class FueraDeRangoDeMemoriaException extends RuntimeException {
    public FueraDeRangoDeMemoriaException() {
        super("La dirección de memoria ingresada está fuera del rango");
    }
}
