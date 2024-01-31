package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.
        zofka.turnRight(30);

        //Zmrzlina
        nakresliRovnostarnnýTrojuhelnik(300, new Color(68,46,29));
        nakresliKolecko(150, 36, new Color(250,135,184));

        //Snehulak
        nakresliSnehulaka(new Color(67,162,211));
    }


    public void nakresliRovnostarnnýTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
       // zofka.penUp();
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
      //  zofka.penDown();
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);

        zofka.penUp();
        zofka.move(340);
        zofka.turnLeft(120);
        zofka.move(169);
    }

    public void nakresliKolecko(int polomer, int pocetStran, Color barvaKruhu) {
        zofka.setPenColor(barvaKruhu);
        zofka.penUp();
        zofka.move(polomer);
        zofka.penDown();

        int uhel = 360 / pocetStran;

        int delkaStrany = (int) (Math.sin(Math.PI * (double) uhel / 360d) * polomer * 2);

        zofka.turnRight(90);
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
        zofka.turnLeft(90);

    }

    public void nakresliSnehulaka(Color barvaSnehulaka) {
        zofka.setPenColor(barvaSnehulaka);

        zofka.penUp();

        zofka.move(300);

        zofka.penDown();
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15.0);
            zofka.move(12);
        }

        for (int i = 0; i < 24; i++) {
            zofka.turnLeft(15.0);
            zofka.move(20);
        }

        //ruka levá
        zofka.penUp();
        for (int i = 0; i < 3; i++) {
            zofka.turnLeft(15.0);
            zofka.move(30);
        }


        zofka.turnRight(75);
        zofka.move(8);
        zofka.penDown();

        for (int i = 0; i < 24; i++) {
            zofka.turnLeft(15.0);
            zofka.move(6);
        }
        //pravá ruka

        zofka.penUp();
        zofka.turnRight(150); //150
        zofka.move(198);

        zofka.penDown();
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15.0);
            zofka.move(6);
        }

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(-10); //80 do prava nebo leva
        zofka.turnLeft(90);
        zofka.move(240); //250 zvedá nahoru a dulů

        zofka.penDown();
        for (int i = 0; i < 24; i++) {
            zofka.turnRight(15.0);
            zofka.move(30);
        }

        }



    }



