package empresa.dominio;

import java.util.List;

public class Empresa {
    public List<Empleado> empleados;
    public List<Producto> productos;
    public List<Cliente> clientes;
    public Gerente gerente;


    public void vender(Cliente c, Producto p) {
        // Todo lo necesario para la venta
    }
}
