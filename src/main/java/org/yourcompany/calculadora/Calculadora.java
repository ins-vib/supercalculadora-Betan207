package org.yourcompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Andreu
 */

public class Calculadora {

    public static void main(String[] args) {
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Benvingut, escolleix quina operacio vol executar. Te 7 opcions");
        do{
            MostrarMenu(args);
            opcion = teclado.nextInt();

            switch (opcion) {

            case 1 -> {
                
                do{
                // Exemples de crida per al mètode nombreDigits
                System.out.println("Nombre de digits de 1234: " + nombreDigits(1234));
                System.out.println("Nombre de digits de 56789: " + nombreDigits(56789));
                System.out.println("Nombre de digits de -101010: " + nombreDigits(-101010));
                System.out.println("Nombre de digits de 0: " + nombreDigits(0));
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 2 -> {
                // Codi per a llançar la moneda
                do{
                int repeticions; // Nombre de llançaments
                System.out.print("Introdueix el nombre de llansaments: ");
                repeticions = teclado.nextInt();
                int numeroCares = numeroCares(repeticions);
                System.out.println("Nombre de cares en " + repeticions + " llansaments: " + numeroCares);
                int numerocruces = repeticions - numeroCares;
                System.out.println("Nombre de cruces en " + repeticions + " llansaments: " + numerocruces);
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 3 -> {
                do{
                //Tornada de preu entrada cinema
                double preuBase = 8.0; // Preu base de l'entrada
                boolean esCapDeSetmana = true; // Exemple: és cap de setmana
                boolean teCarnetJove = false; // Exemple: no té Carnet Jove    
                double preuFinal = CalculadoraPreuEntrada(preuBase, esCapDeSetmana, teCarnetJove);
                System.out.println("Preu final de l'entrada: " + preuFinal);
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 4 -> {
                do{
                // Exemples de crida per al mètode sumaPrimersNumeros
                System.out.println("Suma dels primers 5 numeros: " + sumaPrimersNumeros(5));
                System.out.println("Suma dels primers 10 numeros: " + sumaPrimersNumeros(10));
                System.out.println("Suma dels primers 15 numeros: " + sumaPrimersNumeros(15));
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 5 -> {
                do{
                // Exemples de crida per al mètode calcularFactorial
                System.out.println("Factorial de 5: " + calcularFactorial(5));
                System.out.println("Factorial de 7: " + calcularFactorial(7));
                System.out.println("Factorial de 10: " + calcularFactorial(10));
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 6 -> {
                do{
                // Exemples de crida per al mètode sumaQuadrats
                System.out.println("Suma dels quadrats dels primers 3 numeros: " + sumaQuadrats(3));
                System.out.println("Suma dels quadrats dels primers 5 numeros: " + sumaQuadrats(5));
                System.out.println("Suma dels quadrats dels primers 7 numeros: " + sumaQuadrats(7));
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            case 7 -> {
                do{
                // Exemples de crida per al mètode calcularPotencia
                System.out.println("2 elevat a la potencia 3: " + calcularPotencia(2, 3));
                System.out.println("5 elevat a la potencia 4: " + calcularPotencia(5, 4));
                System.out.println("3 elevat a la potencia 5: " + calcularPotencia(3, 5));
                System.out.println("Vols repetir aquesta operacio? (s/n): ");
                respuesta = teclado.next().charAt(0);
                }while(respuesta == 's' || respuesta == 'S');

                }

            default -> System.out.println("Opcio no valida");
            }
        
        }while(opcion!=0);
    }
    public static void MostrarMenu(String[] args) {
        System.out.println("Menu de opcions:");
            System.out.println("1. Nombre de dígits d'un nombre");
            System.out.println("2. Llançament de moneda");
            System.out.println("3. Càlcul preu entrada cinema");
            System.out.println("4. Suma dels primers N números");
            System.out.println("5. Càlcul factorial d'un nombre");
            System.out.println("6. Suma dels quadrats dels primers N números");
            System.out.println("7. Càlcul de potència d'un nombre");
            System.out.println("0. Sortir");
        
    }

    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    public static int calcularPotencia(int base, int exponent) {
        int resultat = 1;
        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }

    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int numeroCares(int repeticions) {
        int caras = 0;
        int cruces = 0;

        for (int i = 0; i < repeticions; i++) {
            int lanzamiento = (int) (Math.random() * 2);

            if (lanzamiento == 0) {
                caras++;
            } else {
                cruces++;
            }
        }
        //System.out.println("Caras: " +caras);
        //System.out.println("Cruces: "+cruces);

        int numeroCares = caras;

        return numeroCares;

    }

    public static double CalculadoraPreuEntrada(double preuBase, boolean esCapDeSetmana, boolean teCarnetJove) {
        double preuFinal = preuBase;
        if (esCapDeSetmana == true) {
            preuFinal *= 1.10; // 10% més car
        }
        if (teCarnetJove == true) {
            preuFinal *= 0.85; // 15% de descompte
        }
        return preuFinal;
    }
}