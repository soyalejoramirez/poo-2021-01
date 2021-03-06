package empresa.dominio;

import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    private List<Producto> productos;
    private List<Cliente> clientes;
    private Gerente gerente;

    public void vender(Cliente c, Producto p) {
        // Todo lo necesario para la venta
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
