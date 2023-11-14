package org.iesvdm;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Miguel!");

        System.out.println("El area de un cuadrado de lado 45 es: " + areaCuadrado(45.0));
        System.out.println("El area de un rectangulo de base 57 y altura 85 es: " + areaRectángulo(57d,85d));
    }

    public static Double areaCuadrado(Double lado){
        Double Area;

        Area = lado * lado;

        return Area;
    }

    public static Double areaRectángulo(Double Altura, Double Base) {
        Double Area;

        Area = Altura * Base;

        return Area;
    }

}