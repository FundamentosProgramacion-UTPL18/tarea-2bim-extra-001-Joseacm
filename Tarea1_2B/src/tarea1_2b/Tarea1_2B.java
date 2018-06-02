/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_2b;

/**
 *
 * @author Hp
 */
public class Tarea1_2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] meses = {"Agosto", "Octubre", "Diciembre"};
        String[] sucursales = {"Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4"};
        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};

        double[] venta_total_sucursal = new double[4];
        double[] venta_promedio_sucursal = new double[4];
        double ventas_totales = 0;
        String cadena_final = "";
        cadena_final = String.format("\t\t%s\t\t%s\t\t%s\t%s\t\t%s\n", "Agosto", "Octubre", "Diciembre", "Total", "Promedio");

        for (int i = 0; i < sucursales.length; i++) {  // // Inicio del ciclo for                                           
            double suma1 = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i]; //Cálculo de la suma de las ventas de cada sucursal
            double promedio = suma1 / 3; // Se calcula del promedio de las ventas de cada sucursal
            venta_total_sucursal[i] = suma1; //Suma total de sucursal de las ventas 
            venta_promedio_sucursal[i] = promedio; // Promedio de las ventas de cada sucursal
        } //fin_for

        System.out.println("\tREPORTE\t");      // Se presenta en pantalla "REPORTE"    
        System.out.printf("\t\t%s\t\t%s\t\t%s\t%s\t\t%s\n", "Agosto", "Octubre", "Diciembre", "Total", "Promedio");
        for (int i = 0; i < sucursales.length; i++) {
            System.out.printf("%s\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.1f\n", sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]); // Se presenta las ventas mensuales de cada sucursal
            ventas_totales = ventas_totales + venta_total_sucursal[i]; // Se hace la suma de total de las cuatro sucusales
        }//fin_for
        System.out.printf("\nTotales de ventas de todas la sucursales es: $%.1f\n\n", ventas_totales);  // Se presenta el resporte de la venta total de todas las sucursales
    }

}
