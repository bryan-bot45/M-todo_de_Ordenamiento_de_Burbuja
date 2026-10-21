/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectos;

/**
 *
 * @author Bryan Wymer Benitez                Cuarto C
 */
public class OrdenamientodeBurbuja {
    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    // 2. Método Burbuja Mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean intercambiado = false;

            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambiado = true;
                }
            }

            if (!intercambiado) {
                break;
            }
        }
    }

    // Método auxiliar para imprimir los elementos del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] datos1 = {64, 34, 25, 12, 22, 11, 90};
        int[] datos2 = datos1.clone(); // Hacemos una copia exacta para el segundo método

        System.out.println("--- PRUEBA 1: BURBUJA TRADICIONAL ---");
        System.out.print("Original: ");
        imprimirArreglo(datos1);
        
        ordenamientoBurbuja(datos1);
        
        System.out.print("Ordenado: ");
        imprimirArreglo(datos1);

        System.out.println("\n--- PRUEBA 2: BURBUJA MEJORADO ---");
        System.out.print("Original: ");
        imprimirArreglo(datos2);
        
        ordenamientoBurbujaMejorado(datos2);
        
        System.out.print("Ordenado: ");
        imprimirArreglo(datos2);
    }
}