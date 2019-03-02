import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long numero;
        int num;

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        numero = sc.nextLong();

        System.out.println(contador(numero, num));
    }

    public static int contador(long numero, int num){
        int cont=0;
        if(numero > 0) {
            if (numero % 10 == num) cont++;
            return cont + contador(numero / 10, num);
        }
        else return 0;
    }

}
