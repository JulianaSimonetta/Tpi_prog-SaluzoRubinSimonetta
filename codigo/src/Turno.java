public class Turno {

    private int codigo;
    private Actividad actividad;
    private int cupoMax;
    private String fecha;
    private int cantCuposDisponibles;

    public Turno(int codigo, Actividad actividad, int cupoMax, String fecha, int cantCuposDisponibles) {
        this.codigo = codigo;
        this.actividad = actividad;
        this.cupoMax = cupoMax;
        this.fecha = fecha;
        this.cantCuposDisponibles = cantCuposDisponibles;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantCuposDisponibles() {
        return cantCuposDisponibles;
    }

    public void setCantCuposDisponibles(int cantCuposDisponibles) {
        this.cantCuposDisponibles = cantCuposDisponibles;
    }
}
