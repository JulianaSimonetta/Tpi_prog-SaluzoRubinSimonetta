public class Socio extends Persona {
    private int telefono;
    private boolean estado;
    private int creditos;

    public Socio(String nombre, String apellido, String fechaAlta, String fechaBaja, int documento, TipoDocumento tipoDocumento, int telefono, boolean estado, int creditos) {
        super(nombre, apellido, fechaAlta, fechaBaja, documento, tipoDocumento);
        this.telefono = telefono;
        this.estado = estado;
        this.creditos = creditos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
