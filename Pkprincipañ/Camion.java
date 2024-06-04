package Pkprincipañ;
import java.util.ArrayList;

public class Camion {
    private String matricula;
    private double capacidadCarga; // en kilogramos
    private double consumoGasolina; // en galones/kilómetro
    private double cargaActual; // en kilogramos

    public Camion(String matricula, double capacidadCarga, double consumoGasolina) {
        this.matricula = matricula;
        this.capacidadCarga = capacidadCarga;
        this.consumoGasolina = consumoGasolina;
        this.cargaActual = 0; // Inicialmente no hay carga
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double getConsumoGasolina() {
        return consumoGasolina;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public double espacioDisponible() {
        return capacidadCarga - cargaActual;
    }

    public double consumoTotal(double distancia) {
        return distancia * consumoGasolina;
    }

    public void cargar(double carga) {
        if (cargaActual + carga <= capacidadCarga) {
            cargaActual += carga;
            System.out.println("Carga de " + carga + " kg realizada en camión con matrícula " + matricula + ".");
        } else {
            System.out.println("El camión no tiene suficiente capacidad para esta carga.");
        }
    }

    public void descargar() {
        cargaActual = 0;
        System.out.println("Camión con matrícula " + matricula + " descargado.");
    }
}