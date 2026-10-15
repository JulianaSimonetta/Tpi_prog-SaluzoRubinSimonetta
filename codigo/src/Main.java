import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        TipoDocumento td1 = new TipoDocumento(01, "DNI");

        Actividad a1 = new Actividad(001, "Funcional");
        Actividad a2 = new Actividad(002, "Crossfit");
        Actividad a3 = new Actividad(003, "Pilates");
        Actividad a4 = new Actividad(003, "Musculación");

        Socio s1 = new Socio("Candela", "Saluzzo", "15/10/26", "", 48297608, td1, 3535626, true, 30 );
        Socio s2 = new Socio("Valentina", "Simonetta", "4/10/26", "", 48297820, td1, 353096, true, 35 );
        Socio s3 = new Socio("Juliana", "Rubin", "1/10/26", "15/10/26", 482749, td1, 3535889, false, 0 );

        Instructor i1 = new Instructor("Martín", "Gutierrez", "01/01/24", "", 40924122, td1, 001);
        Instructor i2 = new Instructor("Dante", "Martinez", "01/09/26", "", 40927822, td1, 002);

        Turno t1 = new Turno(0001, a1, 10, "15/10/26", 10);
        Turno t2 = new Turno(0002, a3, 5, "17/10/26", 3);
        Turno t3 = new Turno(0003, a4, 25, "16/10/26", 4);
        Turno t4 = new Turno(0004, a2, 20, "16/10/26", 20);

        Reserva r1 = new Reserva(001, t1, false, s1);
        Reserva r2 = new Reserva(002, t2, true, s1);
        Reserva r3 = new Reserva(003, t3, true, s1);
        Reserva r4 = new Reserva(004, t4, true, s2);

        //s1.mostrarSocio();
        //a1.mostrarActividad();
        //s1.cambiarEstado(false);

        //t2.mostrarTurno();
        //r2.mostrarReserva();
        r1.mostrarReserva();

    }
}