package com.pablo;

import java.util.Scanner;

public class Application {

    public static Scanner ingresa;

    public static void main(String[] args) {
        ingresa = new Scanner(System.in);

        System.out.println("Ingrese la puntuación entre 0 y 100: ");
        int puntuacion = ingresa.nextInt();

        String calificacion = obtenerNota(puntuacion);

        System.out.println("La calificación es: " + calificacion);

        ingresa.close();
    }

    public static String obtenerNota(int puntuacion) {
        int r = puntuacion /10;
        return switch (r) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
