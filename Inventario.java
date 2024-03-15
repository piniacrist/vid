package Videojuego;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Inventario {
    ArrayList<String> objetos= new ArrayList<>(6);
    ArrayList<Integer> Bonusataque= new ArrayList<>(6);
    ArrayList<Integer> Bonusvida= new ArrayList<>(6);
    ArrayList<Integer> Bonusdefensa= new ArrayList<>(6);

    public Inventario() {
    objetos.add("Zumito manzana");
    objetos.add("Multi zumito");
    objetos.add("Paraguas");
    objetos.add("Termo vacio");
    objetos.add("Chaleco reflectante");
    objetos.add("Sudadera perdida");

    Bonusataque.add(0);
    Bonusataque.add(0);
    Bonusataque.add(5);
    Bonusataque.add(3);
    Bonusataque.add(0);
    Bonusataque.add(0);

    Bonusvida.add(10);
    Bonusvida.add(22);
    Bonusvida.add(0);
    Bonusvida.add(0);
    Bonusvida.add(0);
    Bonusvida.add(0);
    Bonusvida.add(0);

    Bonusdefensa.add(0);
    Bonusdefensa.add(0);
    Bonusdefensa.add(0);
    Bonusdefensa.add(0);
    Bonusdefensa.add(2);
    Bonusdefensa.add(5);
    }
}