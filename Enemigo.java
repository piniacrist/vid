package Videojuego;
import java.util.Random;
import java.util.Scanner;

public class Enemigo {

    private String enombre;
    private int esalud, eataque, edefensa, edinero, eexp;

public Enemigo(String enombre){
    this.enombre = enombre;
    esalud = 0;
    eataque = 0;
    edefensa = 0;
    edinero = 0;
    eexp = 0;
}

public String getEnombre(){
    return enombre;
}

public int getEsalud(){
    return esalud;
}

public int getEataque(){
    return eataque;
}

public int getEdefensa(){
    return edefensa;
}

public int getEdinero(){
    return edinero;
}

public int getEexp(){
    return eexp;
}

public void setEsalud(int esalud){
    this.esalud = esalud;
}

public void setEataque(int eataque){
    this.eataque = eataque;
}

public void setEdefensa(int edefensa){
    this.edefensa = edefensa;
}

public void setEdinero(int edinero){
    this.edinero = edinero;
}

public void setEexp(int eexp){
    this.eexp = eexp;
}

public void CalcularVidaEnemigo(){
    Random v = new Random();
    int vida = v.nextInt(30);
    setEsalud(vida);
    System.out.println("Salud de " + getEnombre() + ": " + getEsalud());
}

public void CalcularFuerzaEnemigo(){
    Random y = new Random();
    int fuerza = y.nextInt(15);
    setEataque(fuerza);
    System.out.println("Fuerza de " + getEnombre() + ": " + getEataque());
}

public void CalcularDefensaEnemigo(){
    Random d = new Random();
    int aguante = d.nextInt(3);
    setEdefensa(aguante);
    System.out.println("Defensa de " + getEnombre() + ": "  + getEdefensa());
}

public void Saqueo(){
    Random cash = new Random();
    int money = cash.nextInt(20);
    setEdinero(money);
    System.out.println("El botin de " + getEnombre() + " es: " + getEdinero());
}

public void Soltar(){
    Random xp = new Random();
    int expe =  xp.nextInt(30);
    setEexp(expe);
    System.out.println("Al ganar conseguiras: " + getEexp() + " de experiencia");
}

public void NombreEnemigo(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Tu rival puede tener nombre, pero por que te lo iba a decir? Llamalo como tu quieras");
    enombre = teclado.nextLine();
}

@Override
public String toString() {
    String mensaje = "Nombre: " + enombre + "\n"
                + "Salud: " + esalud + "\n"
                + "Ataque: " + eataque + "\n"
                + "Defensa: " + edefensa + "\n"
                + "Dinero: " + edinero + "\n"
                + "Experiencia: " + eexp + "\n";
    return mensaje;
}
}