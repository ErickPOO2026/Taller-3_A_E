/*
 * Taller N.2 - Programacion 1
 * Grupo: ___ Fecha: ___
 * Integrante 1: Nombre completo - Cedula
 * Integrante 2: Nombre completo - Cedula
 */
public class PruebaEmpleado {

    public static void main(String[] args) {

        // --- Ejercicio 2: creacion de dos objetos con new ---
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Ana Perez";
        empleado1.cedula = "8-123-4567";
        empleado1.cargo = "Analista";
        empleado1.salarioBase = 900.0;
        empleado1.añosServicio = 3;
        empleado1.esSupervisor = false;

        Empleado empleado2 = new Empleado();
        empleado2.nombre = "Carlos Rios";
        empleado2.cedula = "4-987-6543";
        empleado2.cargo = "Supervisor de Planta";
        empleado2.salarioBase = 1100.0;
        empleado2.añosServicio = 5;
        empleado2.esSupervisor = true;

        // --- Ejercicio 3: bono de antiguedad y salario total ---
        double bono1 = empleado1.salarioBase * 0.05 * empleado1.añosServicio;
        double totalEmpleado1 = empleado1.salarioBase + bono1;

        double bono2 = empleado2.salarioBase * 0.05 * empleado2.añosServicio;
        double totalEmpleado2 = empleado2.salarioBase + bono2;

        // --- Ejercicio 5: bono fijo adicional para supervisores ---
        // Se aplica antes de mostrar el resultado final si esSupervisor es true.
        if (empleado1.esSupervisor) {
            totalEmpleado1 = totalEmpleado1 + 150.0;
        }
        if (empleado2.esSupervisor) {
            totalEmpleado2 = totalEmpleado2 + 150.0;
        }

        // --- Mostrar datos y resultados de ambos empleados ---
        System.out.println("===== EMPLEADO 1 =====");
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Cedula: " + empleado1.cedula);
        System.out.println("Cargo: " + empleado1.cargo);
        System.out.println("Salario base: " + empleado1.salarioBase);
        System.out.println("Anios de servicio: " + empleado1.añosServicio);
        System.out.println("Es supervisor: " + empleado1.esSupervisor);
        System.out.println("Bono de antiguedad: " + bono1);
        System.out.println("Salario total: " + totalEmpleado1);

        System.out.println();
        System.out.println("===== EMPLEADO 2 =====");
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Cedula: " + empleado2.cedula);
        System.out.println("Cargo: " + empleado2.cargo);
        System.out.println("Salario base: " + empleado2.salarioBase);
        System.out.println("Anios de servicio: " + empleado2.añosServicio);
        System.out.println("Es supervisor: " + empleado2.esSupervisor);
        System.out.println("Bono de antiguedad: " + bono2);
        System.out.println("Salario total: " + totalEmpleado2);

        // --- Ejercicio 4: comparacion de salarios totales ---
        System.out.println();
        if (totalEmpleado1 > totalEmpleado2) {
            System.out.println("El empleado con salario total mas alto es: " + empleado1.nombre);
        } else if (totalEmpleado2 > totalEmpleado1) {
            System.out.println("El empleado con salario total mas alto es: " + empleado2.nombre);
        } else {
            System.out.println("Ambos empleados tienen el mismo salario total.");
        }
    }
}
