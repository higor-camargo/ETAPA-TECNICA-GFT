package teste03;

import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        int i=0,restoOne,resto2,divisao,div2;
        String centena="",dezena="",unidade="";

        System.out.print("Digite um num entre 0 e 1000: ");

        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        while(i<=1000 && i!=-1){
            restoOne = i%100;
            divisao = i/100;
            resto2 = restoOne%10;
            div2 = restoOne/10;

            switch(divisao){
                case 1 : centena = "cento";
                break;
                case 2 : centena = "duzentos";
                break;
                case 3 : centena = "trezentos";
                break;
                case 4 : centena = "quatrocentos";
                break;
                case 5 : centena = "quinhentos";
                break;
                case 6 : centena = "seiscentos";
                break;
                case 7 : centena = "setecentos";
                break;
                case 8 : centena = "oitocentos";
                break;
                case 9 : centena = "novecentos";
                break;
            }

            if(restoOne !=0 && restoOne>10 && restoOne<20) {
                switch(restoOne){
                    case 11: dezena = "onze";
                    break;
                    case 12: dezena = "doze";
                    break;
                    case 13: dezena = "treze";
                    break;
                    case 14: dezena = "quatorze";
                    break;
                    case 15: dezena = "quinze";
                    break;
                    case 16: dezena = "dezesseis";
                    break;
                    case 17: dezena = "dezessete";
                    break;
                    case 18: dezena = "dezoito";
                    break;
                    case 19: dezena = "dezenove";
                    break;
                }
            }else{
                switch(div2){
                    case 1 : dezena = "dez";
                    break;
                    case 2 : dezena = "vinte";
                    break;
                    case 3 : dezena = "trinta";
                    break;
                    case 4 : dezena = "quarenta";
                    break;
                    case 5 : dezena = "cinquenta";
                    break;
                    case 6 : dezena = "sessenta";

                    break;
                    case 7 : dezena = "setenta";
                    break;
                    case 8 : dezena = "oitenta";
                    break;
                    case 9 : dezena = "noventa";
                    break;
                }
            }

            if(restoOne>=20 || i<10 || restoOne<10){
                switch(resto2){
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

            if(i==0)
                System.out.println("zero");
            else{
                if(i==1000)
                    System.out.println("mil");
                else{
                    if(i==100)
                        System.out.println("cem");
                    else{
                        if(i>100 && restoOne<10 && restoOne!=0)

                            System.out.println(centena + " e " + unidade);
                        else{
                            if(i>100 && restoOne ==0)
                                System.out.println(centena);
                            else {
                                if(i>100 && restoOne !=0 && resto2 !=0 && restoOne>=20)
                                    System.out.println(centena + " e " + dezena + " e " + unidade);
                                else{
                                    if(i>100 && restoOne !=0 && resto2 ==0)
                                        System.out.println(centena + " e " + dezena);
                                    else{
                                        if(i>100 && restoOne !=0)
                                            System.out.println(centena + " e "+ dezena);
                                        else{
                                            if(i<100 && restoOne !=0 && resto2 ==0)
                                                System.out.println(dezena);
                                            else{
                                                if(i>20 && restoOne !=0 && resto2 !=0)
                                                    System.out.println(dezena + " e " + unidade);
                                                else{
                                                    if(i<10)
                                                        System.out.println(unidade);
                                                    else
                                                        System.out.println(dezena);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("");
            System.out.print("Digite um numero: ");
            i = scanner.nextInt();
        }
    }
}
