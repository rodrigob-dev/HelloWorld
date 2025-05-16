import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        String name = input.nextLine();
        System.out.println("Olá " + name + "!");
        input.close();
    }
}