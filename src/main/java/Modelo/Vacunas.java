package Modelo;

public class Vacunas {
    int atrCantidadVacunas;
    String atrLugarVacunas,atrFechaIngreso;
   
    /**
     * 
     * @param atrCantidadVacunas Cantidad de vacunas del lote
     * @param atrFechaIngreso Fecha de ingreso del lote
     * @param atrLugarVacunas Destino del lote.
     * 
     * Algunos valores entraran como "NULL" porque no se les ha ingresado informacion.
     */
    public Vacunas(int atrCantidadVacunas, String atrFechaIngreso,String atrLugarVacunas) {
        this.atrCantidadVacunas = atrCantidadVacunas;
        this.atrFechaIngreso = atrFechaIngreso;
    }

    public int getAtrCantidadVacunas() {
        return atrCantidadVacunas;
    }

    public void setAtrCantidadVacunas(int atrCantidadVacunas) {
        this.atrCantidadVacunas = atrCantidadVacunas;
    }

    public String getAtrLugarVacunas() {
        return atrLugarVacunas;
    }

    public void setAtrLugarVacunas(String atrLugarVacunas) {
        this.atrLugarVacunas = atrLugarVacunas;
    }

    public String getAtrFechaIngreso() {
        return atrFechaIngreso;
    }

    public void setAtrFechaIngreso(String atrFechaIngreso) {
        this.atrFechaIngreso = atrFechaIngreso;
    }
    
}
