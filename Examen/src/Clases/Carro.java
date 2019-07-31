
package Clases;

public class Carro {
    protected float costoCarro;
    protected int antiguedad;
    protected double depreciacion;
    protected float valorActual;
    protected String Marca;

    public Carro(float costoCarro, int antiguedad, double depreciacion, float valorActual, String Marca) {
        this.costoCarro = costoCarro;
        this.antiguedad = antiguedad;
        this.depreciacion = depreciacion;
        this.valorActual = valorActual;
        this.Marca = Marca;
    
    }
    public Carro(){
        
    }

    public float getCostoCarro() {
        return costoCarro;
    }

    public void setCostoCarro(float costoCarro) {
        this.costoCarro = costoCarro;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(double depreciacion) {
        this.depreciacion = depreciacion;
    }

    public float getValorActual() {
        return valorActual;
    }

    public void setValorActual(float valorActual) {
        this.valorActual = valorActual;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
  
    
}

    