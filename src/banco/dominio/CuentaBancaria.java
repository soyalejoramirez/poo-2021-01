package banco.dominio;

import java.util.Date;

public class CuentaBancaria {
    private Banco banco;
    private String tipo; // Sí es ahorros o corriente
    private Persona titular;
    private String numero;
    private double saldo;
    private Date fechaApertura;
    private String contrasena;
    private String estado;

    public CuentaBancaria(Banco banco, String tipo, Persona titular, String numero, double saldo) {
        this.banco = banco;
        this.tipo = tipo;
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.fechaApertura = new Date();
        this.contrasena = "0000";
        this.estado = "A";
    }

    public String consultarSaldo() {
        return "Hola " + this.titular.getNombre()  + ", su saldo es: " + this.saldo;
    }

    public boolean retirar(double valorARetirar) {
        if (valorARetirar <= this.saldo && this.estado.equals("A")) {
            this.saldo = this.saldo - valorARetirar;
            return true;
        } else {
            System.out.println("El valor a retirar es superior al saldo actual");
            return false;
        }
    }

    public boolean consignar(double valorAConsignar) {
        if (valorAConsignar > 0 && this.estado.equals("A")) {
            this.saldo += valorAConsignar;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valorATransferir, CuentaBancaria cuentaDestino) {
        boolean procesoRetiro = this.retirar(valorATransferir);

        if (procesoRetiro == true) {
            boolean procesoConsignacion = cuentaDestino.consignar(valorATransferir);
            boolean procesoTransferencia = procesoRetiro && procesoConsignacion;

            return  procesoTransferencia;
        } else {
            return false;
        }

        //return this.retirar(valorATransferir) && cuentaDestino.consignar(valorATransferir);
    }

    public Banco getBanco() {
        return banco;
    }

    public String getTipo() {
        return tipo;
    }

    public Persona getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
