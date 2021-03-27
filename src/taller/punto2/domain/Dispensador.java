package taller.punto2.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Dispensador {
    // Atributos
    private String marca;
    private List<Producto> productos;

    // Constructores
    public Dispensador(String marca) {
        this.marca = marca;
        this.productos = new ArrayList<>();
    }

    // Métodos del dominio
    public boolean agregar(Producto producto) {
        if (this.productos.size() < 10) {
            this.productos.add(producto);
            return true;
        }

        return false;
    }

    public boolean aumentarProducto(String nombreABuscar, int cantidadAAumentar) {
        Producto productoAAumentar = buscar(nombreABuscar);

        if (productoAAumentar != null) {
            if (productoAAumentar.getCantidad() + cantidadAAumentar <= 8) {
                productoAAumentar.setCantidad(productoAAumentar.getCantidad() + cantidadAAumentar);
            } else {
                productoAAumentar.setCantidad(8);
            }

            return true;
        } else {
            System.out.println("No encontró el producto a aumentar");
            return false;
        }
    }

    public boolean aumentarProducto(short codigoABuscar, int cantidadAAumentar) {
        Producto productoAAumentar = buscar(codigoABuscar);

        if (productoAAumentar != null) {
            if (productoAAumentar.getCantidad() + cantidadAAumentar <= 8) {
                productoAAumentar.setCantidad(productoAAumentar.getCantidad() + cantidadAAumentar);
            } else {
                productoAAumentar.setCantidad(8);
            }

            return true;
        } else {
            System.out.println("No encontró el producto a aumentar");
            return false;
        }
    }

    public boolean sacarProducto(String nombre) {
        Producto productoASacar = buscar(nombre);

        if (productoASacar != null) {
            if (productoASacar.getCantidad() > 0) {
                productoASacar.setCantidad(productoASacar.getCantidad() - 1);
                System.out.println("Sacamos exitosamente " + productoASacar.getNombre());
                return true;
            } else {
                System.out.println("El producto " + productoASacar.getNombre() + " se encuentra agotado");
                return false;
            }
        } else {
            System.out.println("No encontró el producto a aumentar");
            return false;
        }
    }

    public boolean sacarProducto(short codigo) {
        Producto productoASacar = buscar(codigo);

        if (productoASacar != null) {
            if (productoASacar.getCantidad() > 0) {
                productoASacar.setCantidad(productoASacar.getCantidad() - 1);
                return true;
            } else {
                System.out.println("El producto " + productoASacar.getNombre() + " se encuentra agotado");
                return false;
            }
        } else {
            System.out.println("No encontró el producto a aumentar");
            return false;
        }
    }

    public List<String> consultarTodos() {
        List<String> tablaDeContenido = new ArrayList<>();

        // Funcional
        productos = productos.stream()
                    .sorted(Comparator.comparingInt(Producto::getCantidad).reversed())
                    .collect(Collectors.toList());

        // Convencional
        Collections.sort(productos);

        this.productos.forEach(producto -> {
            tablaDeContenido.add(producto.getNombre() + " - " + producto.getCantidad() + " unidades.");
        });

        return tablaDeContenido;
    }

    public List<String> consultarAgotados() {
        List<String> agotados = new ArrayList<>();

        this.productos.forEach(producto -> {
            if (producto.getCantidad() == 0) {
                agotados.add(producto.getNombre());
            }
        });

        return agotados;
    }

    public int consultarUnidadesProducto(String nombre) {
        Producto productoABuscar = buscar(nombre);

        if (productoABuscar != null) {
            return productoABuscar.getCantidad();
        } else {
            return 0;
        }
    }

    public int consultarUnidadesProducto(short codigo) {
        Producto productoABuscar = buscar(codigo);

        if (productoABuscar != null) {
            return productoABuscar.getCantidad();
        } else {
            return 0;
        }
    }

    private Producto buscar(String nombre) {
        Producto producto = null;

        for (Producto p: this.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                producto = p;
                break;
            }
        }

        return producto;
    }

    private Producto buscar(short codigo) {
        Producto producto = this.productos.stream()
                            .filter(p -> p.getCodigo() == codigo)
                            .findFirst()
                            .orElse(null);

        return producto;
    }

    // Metodos no dominio (getters & setters)
    public String getMarca() {
        return marca;
    }
}
