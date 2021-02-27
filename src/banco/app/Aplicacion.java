package banco.app;

import banco.dominio.Banco;
import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        Banco bancolombia = new Banco("9008765432", "Bancolombia S.A");

        Persona alejandro = new Persona(123, "Alejandro");
        Persona juanSebastian = new Persona(321, "Juan Sebastian");

        CuentaBancaria miCuenta = new CuentaBancaria(bancolombia, "Ahorros", alejandro, "316-613", 316000);
        CuentaBancaria cuentaSebas = new CuentaBancaria(bancolombia, "Ahorros", juanSebastian, "974-100", 10000);

        miCuenta.retirar(306000);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(216000, cuentaSebas);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());
    }
}