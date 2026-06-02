package ads.poo;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a,b;

        try {
            System.out.println("Entre com um número");
            a = sc.nextInt();
            System.out.println("Entre com um número");
            b = sc.nextInt();

            int res = a / b;

            System.out.printf("%d dividido por %d é equivalente a %d \n", a, b, res);
        } catch(InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
            sc.nextLine();
        } catch(ArithmeticException e){
            System.err.println("Não é permitido fazer divisão por zero");
            sc.nextLine();
        }
        System.out.println("Fim do programa");
    }
}
