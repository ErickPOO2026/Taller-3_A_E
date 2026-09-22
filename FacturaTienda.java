/*
 * Taller N.2 - Programacion 1
 * Grupo: 2 Fecha:21/9/26
 * Integrante 1: Erick Santamaria - 8-1067-91
 * Integrante 2: Adrian Villarreal - 8-1044-1398
 */
public class FacturaTienda {

    public static void main(String[] args) {

        // --- Ejercicio 1: variables y constante ---
        String nombreProducto = "Laptop HP 15";
        int cantidad = 2;
        double precioUnitario = 450.00;
        boolean aplicaDescuento = true;
        final double TASA_ITBMS = 0.07; // 7%

        // --- Ejercicio 2: subtotal, ITBMS y total (una sentencia por resultado) ---
        double subtotal = cantidad * precioUnitario;
        double itbms = subtotal * TASA_ITBMS;
        double total = subtotal + itbms;

        System.out.println("Producto: " + nombreProducto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("ITBMS: " + itbms);
        System.out.println("Total (sin descuento): " + total);

        // --- Ejercicio 3: descuento del 10% si aplicaDescuento es true ---
        // Calculo a mano (jerarquia de operadores):
        // subtotal = 2 * 450.00 = 900.0
        // ITBMS = 900.0 * 0.07 = 63.0
        // descuento = 900.0 * 0.10 = 90.0
        // total = subtotal + (subtotal * TASA_ITBMS) - (subtotal * 0.10)
        //       = 900.0 + 63.0 - 90.0 = 873.0
        // Resultado esperado a mano: 873.0
        double descuento;
        double totalFinal;
        if (aplicaDescuento) {
            descuento = subtotal * 0.10;
            totalFinal = subtotal + (subtotal * TASA_ITBMS) - (subtotal * 0.10);
        } else {
            descuento = 0.0;
            totalFinal = subtotal + (subtotal * TASA_ITBMS);
        }

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total final: " + totalFinal);
        // Verificacion: el resultado de Java (873.0) coincide con el calculado a mano.

        // --- Ejercicio 4: expresion booleana compuesta ---
        int a = 7, b = 4, c = 2, d = 5;
        // (a % b == 3) && (c * d > 8 || a - b <= c)
        // a % b = 7 % 4 = 3  -> (3 == 3) = true
        // c * d = 2 * 5 = 10 -> (10 > 8) = true  -> true || (a-b<=c) = true (cortocircuito)
        // true && true = true
        boolean resultadoBooleano = (a % b == 3) && (c * d > 8 || a - b <= c);
        System.out.println("Resultado expresion booleana: " + resultadoBooleano);

        // --- Ejercicio 5: reto con al menos 3 operadores distintos ---
        // Usamos *, % y - combinados en una sola expresion
        int retoFinal = (a * b) % c - d;
        // Paso a paso segun jerarquia de operadores:
        // 1) a * b = 7 * 4 = 28        (multiplicacion primero)
        // 2) 28 % c = 28 % 2 = 0       (modulo, misma precedencia que *, evaluado de izq a der)
        // 3) 0 - d = 0 - 5 = -5        (resta al final)
        System.out.println("Reto final: " + retoFinal);
    }
}
