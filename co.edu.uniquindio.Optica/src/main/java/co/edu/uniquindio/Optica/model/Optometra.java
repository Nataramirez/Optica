package co.edu.uniquindio.Optica.model;

public class Optometra extends Empleado{
    private String horario;

    public Optometra() {}

    public Optometra(String nombre, String documento, float salario, String horario) {
        super(nombre, documento, salario);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Optometra{" +
                "horario='" + horario + '\'' +
                "} " + super.toString();
    }
}
