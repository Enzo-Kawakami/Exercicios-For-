import java.util.Scanner;

public class Exe10 {
    void main() {
        double valor = 0;
        Scanner sc = new Scanner(System.in);
        for (int aura = 1; aura <= 5; aura++) {
            IO.println("Digite sua nota: ");
            double nota = sc.nextDouble();
            valor += nota;
        }
        IO.println(valor/5);
    }
}
