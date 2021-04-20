package pantalla.app;

import pantalla.dominio.Banda;
import pantalla.dominio.Persona;

public class AppCasteo {
    public static void main(String[] args) {
        // Casteo implícito (Widening casting)
        byte numero = 50;
        long numeroGrande = numero;

        System.out.println("Widening casting " + numeroGrande);

        // Casteo explícito (Narrowing casting)
        long otroNumeroGrande = 69000;
        int numeroChico = (int) otroNumeroGrande;

        System.out.println("Narrowing casting " + numeroChico);

        // Upcasting
        Persona persona = new Persona("Juan", (short) 50);
        Object objeto = persona;

        System.out.println(objeto);

        // Downcasting
        if (objeto instanceof Persona) {
            Persona juancho = (Persona) objeto;
            System.out.println(juancho.getNombre());
        } else {
            System.out.println("Lo que queremos castear no es una banda!");
        }

        // PLUS (+)
        // Convertir numeros a texto
        int numeroAConvertir = 656;
        String textoMalo = "" + numeroAConvertir;
        String texto = String.valueOf(numeroAConvertir);
        String textoNumerico = Integer.toString(numeroAConvertir);

        System.out.println(textoNumerico);

        // Convertir texto a numeros
        String numeroEnTexto = "3454";

        try {
            int numeroOk = Integer.parseInt(numeroEnTexto);
            System.out.println(numeroOk);
        } catch (NumberFormatException e) {
            System.out.println("El texto a castear no es un número");
        }
    }
}
