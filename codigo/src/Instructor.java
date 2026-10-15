public class Instructor extends Persona{
    private int codigoInstructor;

    public Instructor(String nombre, String apellido, String fechaAlta, String fechaBaja, int documento, TipoDocumento tipoDocumento, int codigoInstructor) {
        super(nombre, apellido, fechaAlta, fechaBaja, documento, tipoDocumento);
        this.codigoInstructor = codigoInstructor;
    }

    public int getCodigoInstructor() {
        return codigoInstructor;
    }

    public void setCodigoInstructor(int codigoInstructor) {
        this.codigoInstructor = codigoInstructor;
    }
}
