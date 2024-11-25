
package model;

public class Estudiante {
    private int documento;
    private String nombre;
    private double promedio;
    private int creditos;

    public Estudiante(int documento, String nombre, double promedio, int creditos) {
        this.documento = documento;
        this.nombre = nombre;
        this.promedio = promedio;
        this.creditos = creditos;
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void actualizarPromedioYCreditos(double promedioSemestre, int creditosSemestre) {
        promedio = ((promedio * creditos) + (promedioSemestre * creditosSemestre)) / (creditos + creditosSemestre);
        creditos += creditosSemestre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", creditos=" + creditos +
                '}';
    }
}