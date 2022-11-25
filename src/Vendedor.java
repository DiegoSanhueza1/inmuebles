public class Vendedor {
    private String nombre;
    private String rut;
    private String direccion;
    private String tituloProfesinal;
    private int estadoCivil;
    /*
    * 1:soltero
    * 2:casado
    * 3:viudo
    * */

    public Vendedor(String nombre, String rut, String direccion, String tituloProfesinal, int estadoCivil) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.tituloProfesinal = tituloProfesinal;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tituloProfesinal='" + tituloProfesinal + '\'' +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
