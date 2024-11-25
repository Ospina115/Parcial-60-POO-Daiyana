package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = cargarEstudiantesDesdeArchivo("estudiantes.txt");

        if (estudiantes == null || estudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron estudiantes en el archivo.");
            return;
        }

        for (Estudiante estudiante : estudiantes) {
            String inputPromedio = JOptionPane.showInputDialog(null, 
                "Ingrese el promedio obtenido este semestre para " + estudiante.getNombre() + ":");
            String inputCreditos = JOptionPane.showInputDialog(null, 
                "Ingrese los créditos obtenidos este semestre para " + estudiante.getNombre() + ":");

            try {
                double promedioSemestre = Double.parseDouble(inputPromedio);
                int creditosSemestre = Integer.parseInt(inputCreditos);

                estudiante.actualizarPromedioYCreditos(promedioSemestre, creditosSemestre);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Entrada inválida. No se actualizaron los datos de " + estudiante.getNombre());
            }
        }

        StringBuilder resultado = new StringBuilder("Lista de estudiantes actualizada:\n");
        for (Estudiante estudiante : estudiantes) {
            resultado.append(estudiante.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static List<Estudiante> cargarEstudiantesDesdeArchivo(String archivo) {
        List<Estudiante> estudiantes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                int documento = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                double promedio = Double.parseDouble(datos[2]);
                int creditos = Integer.parseInt(datos[3]);
                estudiantes.add(new Estudiante(documento, nombre, promedio, creditos));
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
        return estudiantes;
    }
}