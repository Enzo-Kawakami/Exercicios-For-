import java.util.Scanner;

public class Eleicao {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Quantas pessoas irão votar?: ");
        int eleitores = sc.nextInt();
        int Qvotos1 = 0;
        int Qvotos2 = 0;
        for (int e = 1; e<= eleitores; e++) {
            IO.println("Voce quer votar em quem: ");
            IO.println("\n "+ "(1)" + "\n" + "(2)Bolsonaro");
            int voto = sc.nextInt();

            if (voto == 1) {
                Qvotos1 += 1;
            } else if (voto == 2) {
                Qvotos2 += 1;
            } else
                IO.println("Voce votou em branco");
        }
        if (Qvotos1 < Qvotos2){
            IO.println("O Bolsonaro Ganhou a Eleição!!");
        }else if(Qvotos1>Qvotos2){
            IO.println("O Lula Ganhou a Eleição!!");
        }else
            IO.println("Eles Empataram");
        IO.println("Lula: "+Qvotos1+" | Bolsonaro: "+Qvotos2);

    }

}
