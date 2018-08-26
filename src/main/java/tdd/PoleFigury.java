package tdd;

public class PoleFigury {


    static double poleProstokata(double a, double b) {
        return a*b;
    }

    static double poleKwadratu(double a) {
        return Math.pow(a,2);
    }

    static double poleTrojkata(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }

    static double poleTrapezu(double a, double b, double h) {
        return ((a+b)*h)/2;
    }

    static double poleKola(double r) {
        return Math.PI*Math.pow(r,2);
    }
}
