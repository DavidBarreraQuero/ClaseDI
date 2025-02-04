import java.util.ArrayList;

public class Paciente extends Persona{

    private final int NSS;
    private ArrayList<CitaPaciente> listaCitas; // null

    public Paciente(String dni, String nombre, String apellido, int NSS) {
        super(dni, nombre, apellido);
        this.NSS = NSS;
        this.listaCitas = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("NSS: "+NSS);
        if (!listaCitas.isEmpty()){
            for ( CitaPaciente item  : listaCitas ) {
                item.mostrarDatos();
            }
        }
    }

    public void registrarCita(int mes, int dia, Medico medico, String comentario){
        listaCitas.add(new CitaPaciente(dia,mes,comentario,medico));
    }

    public int getNSS() {
        return NSS;
    }
}
