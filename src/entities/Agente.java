package entities;
import java.util.ArrayList;
import java.util.List;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private List<String> recompensas;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.recompensas = new ArrayList<>();
    }

   
    public void registrarRecompensa(String recompensa) {
        if (recompensa != null && !recompensa.isEmpty()) {
            recompensas.add(recompensa);
            System.out.println("Recompensa registrada: " + recompensa);
        } else {
            System.out.println("La recompensa no puede estar vacía.");
        }
    }

    public void mostrarRecompensas() {
        System.out.println("Recompensas del agente " + getNombre() + ":");
        if (recompensas.isEmpty()) {
            System.out.println("No hay recompensas registradas.");
        } else {
            for (String recompensa : recompensas) {
                System.out.println("- " + recompensa);
            }
        }
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
        System.out.println("Misión asignada: " + mision);
    }

  
    public String getMisionAsignada() {
        return misionAsignada;
    }

    
    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

   
     
    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial + 
               (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
//ejemplo
    public static void main(String[] args) {
        Agente agente = new Agente(1, "Agente Neo", "Control del código fuente");

        agente.registrarRecompensa("Salvar a Morfeo");
        agente.registrarRecompensa("Derrotar a un Agente Smith");
        agente.asignarMision("Proteger la última ciudad humana");

        agente.mostrarRecompensas();
        System.out.println(agente);
    }
}
