package org.iesvdm;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Triangulo (altura 99, base 33.2): "+areaTriangulo(99.00,33.2));
        System.out.println("Hexágono (lado 12.5): "+areaHexagono(12.5));
    }

    public static Double areaTriangulo(Double altura, Double base){
            return (base*altura)/2;
    }

    public static Double areaHexagono(Double lado){
        return ((lado*lado)*3*(Math.sqrt(3))/2);
        
    }
    public static BigDecimal circulo(BigDecimal radio){
        return BigDecimal.valueOf(Math.PI).multiply(radio.pow(2));
    }
    
    public static BigDecimal pentagono(BigDecimal apotema, BigDecimal lado){
        return ((lado.multiply(BigDecimal.valueOf(5))).multiply(apotema)).divide(BigDecimal.TWO);
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
