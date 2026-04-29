import java.util.Scanner;

public class Ex1 {
    void main (){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um numero e mostrarei seu fatorial: ");
        int num2 = sc.nextInt();
        int valor = 1;
        for(int num1 = 1;num1 <= num2;num1++){
            IO.println(num1);
            valor = valor*num1;
        }
        IO.println(valor);
    }
}
