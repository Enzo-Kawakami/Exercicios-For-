import java.util.Scanner;

public class Exe7 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um Numero: ");
        int num = sc.nextInt();
        int valor;

        for (int i = 1; i <=10; i++){
            valor = num*i;
            IO.println(num+ " x "+i+" = "+valor);
        }
    }
}
