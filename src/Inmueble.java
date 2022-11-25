public class Inmueble {
    private String tipoConstruccion;
    private String ubicacion;
    private int precio;

    public Inmueble(String tipoConstruccion, String ubicacion, int precio) {
        this.tipoConstruccion = tipoConstruccion;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "tipoConstruccion='" + tipoConstruccion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
