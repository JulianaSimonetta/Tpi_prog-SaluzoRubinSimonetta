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

    public void mostrarSocio(){
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("                       SOCIO                   ");
        System.out.println("===============================================");
        System.out.println("- Nombre: " + getNombre() );
        System.out.println("- Apellido: " + getApellido());
        System.out.println("- Fecha alta: " + getFechaAlta() );
        System.out.println("- Fecha baja: " + getFechaBaja() );
        System.out.println("- TipoDocumento: " + getTipoDocumento().getDescripcion() );
        System.out.println("- Documento: " + getDocumento() );
        System.out.println("- Telefono: " + getTelefono());
        System.out.println("- Estado: " +  getEstado());
        System.out.println("- Creditos: " + verCreditos());
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean getEstado() {
        return estado;
    }

    public void cambiarEstado (boolean estado) {
        this.estado = estado;
    }

    public int verCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
