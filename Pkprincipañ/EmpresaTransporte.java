package Pkprincipañ;

import java.util.ArrayList;

public class EmpresaTransporte {
    private ArrayList<Camion> camiones;

    public EmpresaTransporte() {
        this.camiones = new ArrayList<>();
    }

    public void agregarCamion(Camion camion) {
        camiones.add(camion);
    }

    public void cargarCamion(String matricula, double carga) {
        for (Camion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                camion.cargar(carga);
                return;
            }
        }
        System.out.println("Camión no encontrado.");
    }

    public void descargarCamion(String matricula) {
        for (Camion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                camion.descargar();
                return;
            }
        }
        System.out.println("Camión no encontrado.");
    }

    public String mejorCamionParaCarga(double carga) {
        double menorConsumo = Double.MAX_VALUE;
        Camion mejorCamion = null;
        for (Camion camion : camiones) {
            if (camion.espacioDisponible() >= carga && camion.getConsumoGasolina() < menorConsumo) {
                mejorCamion = camion;
                menorConsumo = camion.getConsumoGasolina();
            }
        }
        if (mejorCamion != null) {
            return "El mejor camión para transportar una carga de " + carga + " kg es el camión con matrícula " + mejorCamion.getMatricula() + ".";
        } else {
            return "No hay ningún camión disponible para transportar esta carga.";
        }
    }
}