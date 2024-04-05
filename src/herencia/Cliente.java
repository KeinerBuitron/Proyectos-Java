
package herencia;

public class Cliente extends Persona{
    
    private String categoria;

    public Cliente(String categoria, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.categoria = categoria;
    }
    
    public String mostrarDatos(){
        return getNombre()+" Apellido\n"+getApellido()+"Documento\n"+getDocumento()+" Categoria"+categoria;
    }
    
}
