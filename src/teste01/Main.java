package teste01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um numéro:");
        int num = scan.nextInt();
        String unidade = "";
        switch (num){
            case 1 : unidade = "um";
                break;
            case 2 : unidade = "dois";
                break;
            case 3 : unidade = "tres";
                break;
            case 4 : unidade = "quatro";
                break;
            case 5 : unidade = "cinco";
                break;
            case 6 : unidade = "seis";
                break;
            case 7 : unidade = "sete";
                break;
            case 8 : unidade = "oito";
                break;
            case 9 : unidade = "nove";
                break;
        }



    }
}
