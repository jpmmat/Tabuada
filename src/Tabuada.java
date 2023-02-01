import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Tabuada: ");
       int tabuada = scan.nextInt();

       int numero;

       System.out.println("Tabuada de "+ tabuada);
       for(int i = 1; i<=10; i++){
        System.out.println(tabuada+" + "+i + " = "+(tabuada+i) +"  " + tabuada+" X "+i + " = "+(tabuada*i));

       }


    }
}
