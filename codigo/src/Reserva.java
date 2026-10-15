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
        restarCupo();
        descontarCreditoSocio();
    }

    public void mostrarReserva(){
        System.out.println("");
        System.out.println("===============================================");
        System.out.println("                      RESERVA                  ");
        System.out.println("===============================================");
        System.out.println("- Codigo: " + codigo);
        System.out.println("- Estado: " + estado);
        //System.out.println("- Turno: ");
        turno.mostrarTurno();
        //System.out.println("- Socio: ");
        socio.mostrarSocio();
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void restarCupo(){
        this.turno.setCuposDisponibles(turno.getCuposDisponibles() - 1);
    }

    public void descontarCreditoSocio(){
        socio.setCreditos(socio.verCreditos() - 1);
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
