package reto1;
/**
 *
 * @author James Gallego Hdez
 */
public class Municipio {
    private String nombre;
    private String departamento;
    private Municipio aledaños;

    public Municipio(String nombre, String departamento, Municipio aledaños) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.aledaños = aledaños;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}