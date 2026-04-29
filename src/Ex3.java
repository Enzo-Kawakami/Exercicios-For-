import java.util.Scanner;

public class Ex3 {
    void main() {
        Scanner sc= new Scanner(System.in);
        IO.println("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        numero = Math.abs(numero);
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
       IO.println("A soma dos dígitos de " + numero+ " é: " + soma);
    }
}