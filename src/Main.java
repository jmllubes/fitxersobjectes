import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de gestió de productes");
        System.out.println("------------------------------");
        System.out.println("1 - Desar productes");
        System.out.println("2 - Llegir productes");
        System.out.print("Tria una opció: ");
        int opcio = sc.nextInt();
        sc.nextLine(); // Consumir el salt de línia
        switch (opcio) {
            case 1:
                desarProductes();
                break;
            case 2:
                llegirProductes();
                break;
            default:
                System.out.println("Opció no vàlida");
        }
        sc.close();
    }

    private static void llegirProductes() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("productes.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (fis.available()>0) {
            Producte p = (Producte) ois.readObject();
            System.out.println(p.toString());
        }
        ois.close();
        fis.close();

    }

    public static void desarProductes() throws IOException {


        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;


        fos = new FileOutputStream("productes.dat");
        oos = new ObjectOutputStream(fos);

        Producte p1 = new Producte("Llibre", 15.99, 10);
        Producte p2 = new Producte("Llapis", 0.99, 100);
        Producte p3 = new Producte("Quadern", 2.49, 50);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();
        fos.close();

        System.out.println("Productes desats correctament a productes.dat");

    }

}

