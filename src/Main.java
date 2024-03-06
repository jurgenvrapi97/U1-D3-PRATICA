import entities.Rettangolo;

import java.util.Objects;
import java.util.Scanner;

import static entities.Rettangolo.sommaPerimetroEArea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci una base");
        double base = Double.parseDouble(sc.nextLine());
        System.out.println("inserisci una altezza");
        double altezza = Double.parseDouble(sc.nextLine());

       Rettangolo forma = new Rettangolo(base,altezza);

        System.out.println(forma.perimetro());
        System.out.println(forma.area());

        System.out.println("vuoi inserire un nuovo rettangolo? y/n");
        String answer = "";
        answer = sc.nextLine();

        if (Objects.equals(answer, "y")){
            System.out.println("inserisci una base");
            double base2 = Double.parseDouble(sc.nextLine());
            System.out.println("inserisci una altezza");
            double altezza2 = Double.parseDouble(sc.nextLine());

            Rettangolo forma2 = new Rettangolo(base2,altezza2);

            System.out.println(forma2.perimetro());
            System.out.println(forma2.area());

            System.out.println("hai inserito 2 triangoli vuoi avere la somma dei loro perimetri e area? y/n");
            answer = "";
            answer = sc.nextLine();
            if (Objects.equals(answer, "y")){
                sommaPerimetroEArea(forma,forma2);
            }
        }




        }
    }
