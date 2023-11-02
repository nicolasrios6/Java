import java.util.List;

public class Empleado {
    private String nombreEmpleado;
    private long cuil;
    int anioIngreso;
    double montoAntiguedad, sueldoBasico;
    List<BonoSueldo> bonos;

    public Empleado (String nombreEmpleado, long cuil, int anioIngreso, double montoAntiguedad, double sueldoBasico, List<BonoSueldo> bonos) {
        this.nombreEmpleado = nombreEmpleado;
        this.cuil = cuil;
        this.anioIngreso = anioIngreso;
        this.montoAntiguedad = montoAntiguedad;
        this.sueldoBasico = sueldoBasico;
        this.bonos = bonos;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public long getCuil() {
        return cuil;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad(double montoAntiguedad) {
        this.montoAntiguedad = montoAntiguedad;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }
}
