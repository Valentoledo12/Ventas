

import javax.swing.JOptionPane;

public class ejer2 {

    public static void main(String[] args) {

        // Variables para almacenar los productos y las cantidades vendidas
        String producto1 = "Remera";
        int precio1 = 1000;
        int cantidadVendida1 = 0;

        String producto2 = "Pantalon";
        int precio2 = 2000;
        int cantidadVendida2 = 0;

        String producto3 = "Buzo";
        int precio3 = 5000;
        int cantidadVendida3 = 0;

        // Bucle principal del programa
        while (true) {
            // Mostrar ventana de selección de productos
            String seleccionProducto = (String) JOptionPane.showInputDialog(null, "Seleccione un producto:",
                    "Sistema de Ventas", JOptionPane.QUESTION_MESSAGE, null, new String[] { producto1, producto2,
                            producto3 }, producto1);

            // Obtener la cantidad vendida
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad vendida:");
            int cantidadVendida = Integer.parseInt(cantidadStr);

            // Actualizar la cantidad vendida en la variable correspondiente
            if (seleccionProducto.equals(producto1)) {
                cantidadVendida1 += cantidadVendida;
            } else if (seleccionProducto.equals(producto2)) {
                cantidadVendida2 += cantidadVendida;
            } else if (seleccionProducto.equals(producto3)) {
                cantidadVendida3 += cantidadVendida;
            }

            // Preguntar si desea realizar otra venta
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra venta?", "Sistema de Ventas",
                    JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break; // Salir del bucle si la respuesta no es "Sí"
            }
        }

        // Calcular el total de ventas y mostrar un resumen al final del día
        double totalVentas = (precio1 * cantidadVendida1) + (precio2 * cantidadVendida2) + (precio3 * cantidadVendida3);
        String resumenVentas = "Resumen de Ventas:\n";

        resumenVentas += producto1 + ": " + cantidadVendida1 + " unidades - Subtotal: $" + (precio1 * cantidadVendida1)
                + "\n";
        resumenVentas += producto2 + ": " + cantidadVendida2 + " unidades - Subtotal: $" + (precio2 * cantidadVendida2)
                + "\n";
        resumenVentas += producto3 + ": " + cantidadVendida3 + " unidades - Subtotal: $" + (precio3 * cantidadVendida3)
                + "\n";
        resumenVentas += "\nTotal del día: $" + totalVentas;

        // Mostrar el resumen de ventas
        JOptionPane.showMessageDialog(null, resumenVentas, "Resumen de Ventas", JOptionPane.INFORMATION_MESSAGE);
    }
}

