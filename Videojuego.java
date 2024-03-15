package Videojuego;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Fin(Enemigo rival, Jugador pau) throws InterruptedException {

        int salud;
        int esalud;
        int dinero;
        int edinero;
        int exp;
        int eexp;

        if (pau.getSalud() < 0){
            System.out.println("has perdido el combate...");
            System.out.println("FIN DE LA PARTIDA");
            System.exit(0);
        }
        if (rival.getEsalud() < 0){
            System.out.println("ganaste el combate!");
            System.out.println("Ganaste el botin de tu rival! Puedes continuar");
            dinero = pau.getDinero() + rival.getEdinero();
            pau.setDinero(dinero);
            exp = pau.getExp() + rival.getEexp();
            pau.setExp(exp);
        }
    }

    public static void Habitacion(Enemigo rival, Jugador pau) throws InterruptedException {

        int esalud;
        int salud;
        int ataque;
        int eataque;
        int defensa;
        int edefensa;
        int dinero;
        int edinero;
        int exp;
        int eexp;

        Random x = new Random();
        int sala = x.nextInt(3);
        if (sala == 1) {
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println("Entras a una habitacion vacia, paras un momento a descansar");
        } else {
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println("Hay un enemigo dentro de la habitacion, no puedes avanzar hasta derrotarlo");
            
            rival.NombreEnemigo();
            rival.CalcularVidaEnemigo();
            rival.CalcularFuerzaEnemigo();
            rival.CalcularDefensaEnemigo();
            rival.Saqueo();
            rival.Soltar();

            do{

                System.out.println(rival);
                System.out.println(pau);
                System.out.println("El jugador ataca!");
                esalud = rival.getEsalud() - (pau.getAtaque() - rival.getEdefensa());
                rival.setEsalud(esalud);
                if (rival.getEsalud() > 0){

                    System.out.println("El enemigo resistio el golpe! Vida restante: " + rival.getEsalud());
                    Thread.sleep(1000);
                    System.out.println("Turno del enemigo!");
                    Thread.sleep(1000);
                    salud = pau.getSalud() - (rival.getEataque() - pau.getDefensa());
                    pau.setSalud(salud);
                }
                if (pau.getSalud() > 0){

                    System.out.println("Aguantas el golpe, sigues luchando!");
                    Thread.sleep(1000);
                    System.out.println("Tu vida actual es: " + pau.getSalud());
                    Thread.sleep(1000);
                }

                System.out.println("salud enemigo: " + rival.getEsalud());
            } while (pau.getSalud() > 0 && rival.getEsalud() > 0 );
            Fin(rival, pau);
        }
    }

    public static void Menu(Jugador pau, Enemigo rival) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        int eleccion;
        int dinero;
        int salud;
        int ataque;
        int defensa;
        do {
            System.out.println("---------------------------------------------------------MENU-------------------------------------------------");
            System.out.println("-----------------------------------------Introduce una opcion para continuar----------------------------------");
            System.out.println("1 - Merodear");
            System.out.println("2 - Visitar la tienda");
            System.out.println("3 - Revisar estadisticas");
            System.out.println("4 - Salir del juego");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("------------------------------------------------------Merodear------------------------------------------------");
                    Habitacion(rival, pau);
                    break;
                case 2:
                    System.out.println("-------------------------------------------Visitar la tienda------------------------------------------");
                    Thread.sleep(500);
                    System.out.println("Buscas una maquina expendedora en el centro y la encuentras. Te acercas a ver que tiene disponible");
                    Thread.sleep(500);
                    System.out.println("La pantalla se ilumina y te muestra un mensaje de bienvenida, seguido de una luz que se enciende en la ranura del dinero");
                    Thread.sleep(500);
                    System.out.println("Pulse 1: Zumito Manzana - 'Se venden por separado' 4 de oro + 10 de PVmax");
                    Thread.sleep(500);
                    System.out.println("Pulse 2: Multi zumito - 'Sabe a tu sabor favorito!' 7 de oro + 22 de PVmax");
                    Thread.sleep(500);
                    System.out.println("Pulse 3: Paraguas - 'No es afilado, pero se puede usar como arma' 12 de oro + 5 ATQ");
                    Thread.sleep(500);
                    System.out.println("Pulse 4: Termo vacio - 'Hecho de metal, si estuviese lleno doleria mas...' 8 de oro + 3 de ATQ");
                    Thread.sleep(500);
                    System.out.println("Pulse 5: Chaleco reflectante - 'Tiene mangas, es raro' 6 de oro + 2 DEF");
                    Thread.sleep(500);
                    System.out.println("Pulse 6: Sudadera perdida - 'Nadie la reclamo, no parece que huela a nadie tampoco' 14 de oro + 5 DEF");
                    Thread.sleep(500);
                    System.out.println("Pulse 7 para salir de la tienda");
                    Thread.sleep(500);
                    System.out.println("Tu monedero: " + pau.getDinero() + " de oro");
                    eleccion = teclado.nextInt();
                    if (eleccion == 1) {
                        if (pau.getDinero() < 4) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            salud = pau.getSalud() + 10;
                            pau.setSalud(salud);
                            dinero = pau.getDinero() - 4;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 2) {
                        if (pau.getDinero() < 7) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            salud = pau.getSalud() + 22;
                            pau.setSalud(salud);
                            dinero = pau.getDinero() - 7;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 3) {
                        if (pau.getDinero() < 12) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            ataque = pau.getAtaque() + 5;
                            pau.setAtaque(ataque);
                            dinero = pau.getDinero() - 12;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 4) {
                        if (pau.getDinero() < 8) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            ataque = pau.getAtaque() + 3;
                            pau.setAtaque(ataque);
                            dinero = pau.getDinero() - 8;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 5) {
                        if (pau.getDinero() < 6) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            defensa = pau.getDefensa() + 2;
                            pau.setDefensa(defensa);
                            dinero = pau.getDinero() - 6;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 6) {
                        if (pau.getDinero() < 14) {
                            System.out.println("Credito insuficiente");
                        } else {
                            System.out.println("Gracias por su compra!");
                            defensa = pau.getDefensa() + 4;
                            pau.setDefensa(defensa);
                            dinero = pau.getDinero() - 14;
                            pau.setDinero(dinero);
                        }
                    }
                    if (eleccion == 7) {
                        System.out.println("Abandonando la tienda");
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------------------revisar estadisticas-------------------------------------------");
                    System.out.println(pau);
                    break;
                case 4:
                    System.out.println("--------------------------------------------Salir del juego-------------------------------------------");
                    break;
                default:
                    System.out.println("No has elegido una opcion");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner valores = new Scanner(System.in);
        String nombre;
        String enombre;
        int seleccion;
        int salud;
        int ataque;
        int defensa;
        int dinero;
        int exp;
        int esalud;
        int eataque;
        int edefensa;
        int edinero;
        int eexp;

        System.out.println("Bienvenidos");

        Jugador pau = new Jugador("paulino");
        Enemigo rival = new Enemigo("quien");
        System.out.println("Introduce el nombre de tu personaje");
        nombre = valores.nextLine();

        System.out.println("PJ: " + pau.getNombre());
        System.out.println("PV: " + pau.getSalud());
        pau.CalcularFuerzaInicial();
        System.out.println("DEF: " + pau.getDefensa());
        System.out.println("DINERO: " + pau.getDinero());
        System.out.println("EXP: " + pau.getExp());
        
        pau.TiradaAdicional();
        pau.ObjetoInicial();
        System.out.println(pau);
        Menu(pau, rival);
    }
}
