package Videojuego;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */

public class Jugador {

    private String nombre;
    private int salud, ataque, defensa, exp, dinero, seleccion;

    
public Jugador(String nombre){
    this.nombre = nombre;
    salud = 22;
    ataque = 0;
    defensa = 2;
    dinero = 5;
    exp = 0;
}

public String getNombre(){
    return nombre;
}

public int getSalud(){
    return salud;
}

public int getAtaque(){
    return ataque;
}

public int getDefensa(){
    return defensa;
}

public int getDinero(){
    return dinero;
}

public int getExp(){
    return exp;
}

public void setSalud(int salud){
    this.salud = salud;
}

public void setAtaque(int ataque){
    this.ataque = ataque;
}

public void setDefensa(int defensa){
    this.defensa = defensa;
}

public void setDinero(int dinero){
    this.dinero = dinero;
}

public void setExp(int exp){
    this.exp = exp;
}

public void CalcularFuerzaInicial(){
    Random aleatorio = new Random();
    int numero = aleatorio.nextInt(8);
    setAtaque(numero);
    System.out.println("ATQ: " + getAtaque());
}

    public void TiradaAdicional(){
        
        Scanner teclado = new Scanner(System.in);
        if (dinero > 0){
            System.out.println("Tienes la oportunidad de conseguir poder de nuevo, a cambio de 1 de oro");
            System.out.println("1: Paga 1 de oro para barajar tu poder");
            System.out.println("2: Enfrentate a tu destino con tu fuerza");
            seleccion = teclado.nextInt();
                if (seleccion == 1){
                    dinero = dinero - 1;
                    CalcularFuerzaInicial();
                }
                if (seleccion == 2){
                    System.out.println("Buena suerte en tu viaje");
                }
    }
    if (dinero <= 0){
        System.out.println("No tienes oro que ofrecer, tu poder se quedara como esta");
    }
}

public void ObjetoInicial(){

    Scanner teclado = new Scanner(System.in);
    System.out.println("Se te ofrece un cofre con tres objetos para empezar tu aventura");

    System.out.println("Objeto 1: Una vieja daga, siempre confiable (ATQ + 3)");
    System.out.println("Objeto 2: Un palo largo y contundente (ATQ + 1, DEF + 1)");
    System.out.println("Objeto 3: Una tabla con un asa detras, suficiente para cubrirte (DEF + 3)");

    System.out.println("Elige UNO de los tres objetos");
    seleccion = teclado.nextInt();
    if (seleccion == 1){
        ataque = ataque + 3;
    }
    if (seleccion == 2){
        ataque = ataque + 1;
        defensa = defensa + 1;
    }
    if (seleccion == 3){
        defensa = defensa + 3;
    }
    
}

@Override
public String toString() {
    String mensaje = "Nombre: " + nombre + "\n"
                + "Salud: " + salud + "\n"
                + "Ataque: " + ataque + "\n"
                + "Defensa: " + defensa + "\n"
                + "Dinero: " + dinero + "\n"
                + "Experiencia: " + exp + "\n";
    return mensaje;
}


}