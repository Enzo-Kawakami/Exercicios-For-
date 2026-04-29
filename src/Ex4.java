public class Ex4 {
    void main(){
        int impar;
        int valor = 0;
        for(int num = 1;num <= 20; num++){
            impar = (num%2);
            if (impar == 1){
                IO.println(num);
                valor = valor+num;
            }
        }IO.println(valor);
    }
}
