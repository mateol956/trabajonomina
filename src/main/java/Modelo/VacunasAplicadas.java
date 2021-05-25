package Modelo;


public class VacunasAplicadas {
    
    int Cantidad;
    String rangoEdad;

    public VacunasAplicadas(int Cantidad, String rangoEdad) {
        this.Cantidad = Cantidad;
        this.rangoEdad = rangoEdad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }
    
}
