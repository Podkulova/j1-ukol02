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
        posunSeDoLeva(340);
        nakresliKolecko(150, 36, new Color(250,135,184));

        //Snehulak
        nakresliSnehulaka(new Color(67,162,211));

        //Masinka
        posunDoPrava(500);
        nakresliRovnostarnnýTrojuhelnik(150, Color.black);
        nakresliObdelnik(120,250, Color.black);
        nakresliObdelnik2(150,250, Color.black);
        nakresliKolo( Color.black);

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
    }

    public void posunSeDoLeva (int vlevo) {
        zofka.penUp();
        zofka.move(vlevo);
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

    public void posunDoPrava(int posunSe) {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(posunSe);
        zofka.turnRight(30);
        zofka.penDown();
    }

        public void nakresliObdelnik (int StranaA, double StranaB, Color barvaCary) {
            zofka.setPenColor(barvaCary);
            zofka.turnLeft(30);
            zofka.penUp();
            zofka.move(130);
            zofka.turnLeft(90);

            zofka.penDown();
            zofka.move(StranaA);
            zofka.turnRight(90);
            zofka.move(StranaB);
            zofka.turnRight(90);
            zofka.move(StranaA);
            zofka.turnRight(90);
            zofka.move(StranaB);
            zofka.turnRight(90);
        }
    public void nakresliObdelnik2 (int StranaA, double StranaB, Color barvaCary) {
        zofka.setPenColor(barvaCary);

        zofka.turnRight(90);
        zofka.move(StranaB);
        zofka.turnLeft(90);
        zofka.move(StranaB);
        zofka.turnRight(90);
        zofka.move(StranaA);
        zofka.turnRight(90);
        zofka.move(StranaB);
        zofka.turnRight(90);
        zofka.move(StranaA);
        zofka.turnRight(90);
    }

    public void nakresliKolo (Color barvaKola) {
        zofka.turnRight(180);

        zofka.penUp();
        zofka.move(10);
        zofka.penDown();

        for (int i = 0; i < 24; i++) {
            zofka.turnLeft(15.0);
            zofka.move(20);
        }
    }


    }



