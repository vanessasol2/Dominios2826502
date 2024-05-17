public class VariableAcumuladora {

    public static void main(String[] args) {
        int contador = 0;
        // variable acumuldora:
        // nombre significativo
        int total = 0;

        for ( contador = 0; contador <= 10; contador++) {
            // instruccion de acumulacion
            // no se utiliza la variable de contador
            total += contador;

            System.out.println(contador);

        }
        // imprimir variable acumuladora
        // siempre por fuera del ciclo
        System.out.println("El resultado de la suma con FOR es " + total);

        /// EJERCICIO CON WHILE
        int contador2 = 0;// se debe declarar e iniciar la variable 
        int total2 =0;

        while (contador2 <= 10) { // Mientras contador2 sea menor o igual a 10
            total2 += contador2; //Sumamos el valor de contador2 a total2
            System.out.println(contador2); // Imprimimos el valor de contador2
            contador2++; //Incrementamos contador2 en 1 para avanzar en el bucle
        }
        System.out.println("El resultado de la suma con WHILE es " + total2);
    }
}
