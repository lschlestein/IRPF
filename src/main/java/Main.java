import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImpostoDeRenda ir = new ImpostoDeRenda(p);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome:");
        var nome = scanner.nextLine().toString();
        System.out.println("Insira o salário");
        var salario = scanner.nextDouble();
        scanner.close();

        p = new Pessoa(nome, salario);
        ir = new ImpostoDeRenda(p);
        ir.calcular();
        ir.imprimir();

    }
}
