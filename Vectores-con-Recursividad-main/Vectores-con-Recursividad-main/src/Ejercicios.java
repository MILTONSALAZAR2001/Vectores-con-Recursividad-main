public class Ejercicios {

    public static int factorial(int n) {
        int factorial;

        if(n == 1){
            factorial = n;

        }else{
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }
    /*
    Maximo comun divisor (cmd), algoritmo de eculides
    a = 412 y b = 184
    */

    public static int mcd(int a, int b) {
        int mcd;

        if(a == b){

            mcd = b;

        } else{
            if(a > b){
                a = a -b;
            }else{
                b = b - a;
            }

            mcd = mcd(a,b);
        }

        return mcd;
    }

    /*
    Suma de los elementos de un vector
    vector =  {2 + {4, 6}
    suma = 2 + {4, 6}
    suma = 4 + {6}
    suma = 6 {caso base}
    []
     */
    public static int sumaVector(int[] vector, int indice){
        int suma;
        if (indice == vector.length - 1){
            //caso base
            suma = vector[indice];
        }else {
            suma = vector[indice] + sumaVector(vector, indice + 1);
        }

        return suma;
    }


    /*Invertir cadena con recursividad
     */

    public static String invertirPalabra (String palabra, int longitud){
        if(longitud==0){
            return palabra.charAt (longitud)+"";
        }else{
            return palabra.charAt (longitud) + (invertirPalabra(palabra, longitud-1));
        }
    }

    /*
    metodo recursivo para comparar dos vectores de enteros elemento
    por el elemento
    vector1 = {5, 6, 2}
    vector2 = {2, 9, 2}
    diferen = 3 + 3 + 0 = 6
     */
    private static int compararVectores(int [] vector1, int[] vector2, int indice) {
        int sumaDiferencias;

        if (indice == vector1.length - 1){//caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else{ //llamada recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }

        return sumaDiferencias;
    }

    /*
    Metodo auxiliar que realiza la llamada al metodo recursivo
     */
    public static boolean compararVectores(int [] vector1, int[] vector2) {
        return compararVectores(vector1, vector2, 0) == 0;
    }

}
