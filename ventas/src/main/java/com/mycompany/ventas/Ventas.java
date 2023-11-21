package com.mycompany.ventas;

import javax.swing.JOptionPane;

public class Ventas {

    public static void main(String[] args) {
  
    String[] productos = {"Producto A", "Producto B", "Producto C"};
        double[] precios = {10.0, 15.0, 20.0};
        int[] cantidadesVendidas = new int[productos.length];

        while (true) {
            realizarVenta(productos, precios, cantidadesVendidas);

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra venta?", "Sistema de Ventas", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break;
            }
        }

        mostrarResumenVentas(productos, precios, cantidadesVendidas);
    }
    
   public static void realizarVenta(String[] productos, double[] precios, int[] cantidadesVendidas) {
        String seleccionProducto = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un producto:",
                "Sistema de Ventas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                productos,
                productos[0]);

        String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad vendida:");
        int cantidadVendida = Integer.parseInt(cantidadStr);

        for (int i = 0; i < productos.length; i++) {
            if (seleccionProducto.equals(productos[i])) {
                cantidadesVendidas[i] += cantidadVendida;
                break;
            }
        }
    }
    
    public static void mostrarResumenVentas(String[] productos, double[] precios, int[] cantidadesVendidas) {
        double totalVentas = 0.0;
        String resumenVentas = "Resumen de Ventas:\n";

        for (int i = 0; i < productos.length; i++) {
            double subtotal = precios[i] * cantidadesVendidas[i];
            totalVentas += subtotal;
            resumenVentas += productos[i] + ": " + cantidadesVendidas[i] + " unidades - Subtotal: $" + subtotal + "\n";
        }

        resumenVentas += "\nTotal del día: $" + totalVentas;

        JOptionPane.showMessageDialog(null, resumenVentas, "Resumen de Ventas", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    