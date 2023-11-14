package org.iesvdm;

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
}
