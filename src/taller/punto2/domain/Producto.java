package taller.punto2.domain;

public class Producto implements Comparable<Producto> {
    private short codigo;
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto(short codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Producto(short codigo, String nombre, int precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        if (o.getCantidad() > this.cantidad) {
            return 1;
        }
        if (o.getCantidad() < this.cantidad) {
            return -1;
        }

        return 0;
    }

    public short getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
