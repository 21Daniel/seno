//Este programa resuelve una función senoidal, dado un número el cual sera ingresado mediante el teclado y definido 
//por el usuario,mostrando el resultado en la consola.

package seno;

public class Seno {

    public static void main(String[] args) {
        calculaSeno();

    }

    public static int numeroImpares(int n) {
        int operacion = 1;
        for (int i = 1; i <= n; i++) {
            operacion = 2 * i - 1;
        }
        return operacion;
    }
    
    
//    Se calculan los exponentes
    
    public static int calculaExponente(int base, int exponente) {
        int resultado = 0;
        resultado = (int) Math.pow(base, exponente);
        return resultado;
    }

    public static void imprimeImpares(int a) {
        int i;
        for (i = 1; i <= a; i += 2) {
            System.out.println(i);
        }
    }
    
    
//En este fragmento se hace el calculo del factorial.
    
    private static double factorial(int con, int n) {
        if (con > n) {
            return 1;
        }
        return con *= factorial(con += 1, n);
    }
    
    
//Evaluar una función trigonométrica senoidal empleando la serie de taylor, evaluada en f(0) 
    
    public static void calculaSeno() {
        int x = 1;
        boolean signo = true;
        double expo, fact, result, valor = 0;
        for (int i = 1; i <= 13; i += 2) {
            expo = Math.pow(x, i);
            fact = factorial(1, i);
            result = expo / fact;
            if (signo) {
                valor += result;
                signo = false;
            } else {
                valor -= result;
                signo = true;
            }
        }
        System.out.println("f(" + x + ") = " + valor+  "radianes");
    }
}
