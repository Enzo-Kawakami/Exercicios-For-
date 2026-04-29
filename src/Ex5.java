import java.util.Scanner;

public class Ex5 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um numero e mostraremos o Maior e o Menor");
        int N = sc.nextInt();
        int num1 = 0;
        for ( int num = 0;num <=N; num++ ){
            IO.println(num);

        }
        IO.println("O maior numero é " + N);
        IO.println("O menor numero é "+num1);
    }
}