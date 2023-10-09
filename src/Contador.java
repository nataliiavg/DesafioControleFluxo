import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            int parametroUm, parametroDois = 0;

            try {
                System.out.println("Digite o primeiro parâmetro: ");
                parametroUm = terminal.nextInt();

                System.out.println("Digite o segundo parâmetro: ");
                parametroDois = terminal.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Os parâmetros precisam ser numéricos! ");
                return;
            }

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
