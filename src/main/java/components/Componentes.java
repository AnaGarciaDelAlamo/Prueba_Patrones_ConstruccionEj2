package components;

public class Componentes {
    protected String nomFabricante;
    protected String modelo;
    protected double precio;

    public String getNomFabricante() {
        return nomFabricante;
    }

    public void setNomFabricante(String nomFabricante) {
        this.nomFabricante = nomFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
