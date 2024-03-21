import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> users = new ArrayList<>();
        while (true) {
            Menu.impMenuAdd();
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Digite um Nome: ");
                String nome = scan.nextLine();
                System.out.println("Digite a sua Idade: ");
                int idade = scan.nextInt();
                System.out.println("Digite seu genero: ");
                String genero = scan.nextLine();
                System.out.println("Digite seu ano de Nascimento: ");
                int anoDeNascimento = scan.nextInt();
                System.out.println("Digite quantos Irmaoes e irmas voce tem: ");
                int numIrma = scan.nextInt();
                Usuario insertUser = new Usuario(nome, idade, anoDeNascimento, genero, numIrma);
                users.add(insertUser);
            }else if (choice == 2) {
                int count = 1;
                for (Usuario u : users) {
                    System.out.println(count +"." + u.getNome());
                    count++;
                }
                System.out.println("Digite quem voce quer remover: ");
                int indexRemove = scan.nextInt();
                users.remove(users.get(indexRemove-1));
            } else if (choice == 3) {
                break;
            }
            
        }

    }
}