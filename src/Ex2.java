import java.util.Scanner;

public class Ex2 {
    void main() {
        Scanner sc= new Scanner(System.in);
        IO.println("Quantos números você deseja digitar?");
        int num = sc.nextInt();
        IO.println("Digite um número: ");
        if (num <=0) {
            IO.println("A quantidade de números deve ser maior que zero!");
        }
        int nume = sc.nextInt();
        int maior = nume;
        int menor = nume;
        for (int n = 2; n <=num; n++) {
            IO.println("Digite o " + n+"º número: ");
            int numero = sc.nextInt();
            if (num > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        IO.println("O maior número digitado foi:" + maior);
        IO.println("O menor número digitado foi: " + menor);
    }
}