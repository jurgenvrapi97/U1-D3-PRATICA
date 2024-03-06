package entities;

public class Rettangolo {

    private double altezza;
    private double base;

    // costruttore di default
    public  Rettangolo (){
    this.altezza = 2;
    this.base = 6;
    }

    public  Rettangolo(double base, double heigth){
        if (base <= 0 || heigth<= 0 ){
            System.err.println("base o altezza non validi");
        }
        this.altezza = heigth;
        this.base = base;
    }

    public double perimetro(){
        return (base + altezza)* 2;

    }

    public double area(){
        return (base*altezza);
    }

    public static void sommaPerimetroEArea(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        double perimetroTotale = rettangolo1.perimetro() + rettangolo2.perimetro();
        double areaTotale = rettangolo1.area() + rettangolo2.area();

        System.out.println("Perimetro totale: " + perimetroTotale);
        System.out.println("Area totale: " + areaTotale);
    }


}


