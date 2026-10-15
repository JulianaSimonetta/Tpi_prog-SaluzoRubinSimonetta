public class Reserva {
    private int codigo;
    private Turno turno;
    private Socio socio;
    private boolean estado;

    public Reserva(int codigo, Turno turno, boolean estado, Socio socio) {
        this.codigo = codigo;
        this.turno = turno;
        this.estado = estado;
        this.socio = socio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
