public class Actividad {
    private int codigo;
    private String descripcion;

    public Actividad(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarActividad(){
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("                    ACTIVIDAD                  ");
        System.out.println("===============================================");
        System.out.println("- Códgo: " + getCodigo());
        System.out.println("- Descripción: " + getDescripcion());
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
