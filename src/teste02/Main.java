package teste02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a raça: 1) Anao 2) Elfo 3) Humano");
        String raca = scan.nextLine();

        while (  !raca.equalsIgnoreCase("Anao")  &&  !raca.equalsIgnoreCase("Elfo") &&  !raca.equalsIgnoreCase("Humano")  ){
            System.out.println("Raca inválida. Escolha: 1) Anao 2) Elfo 3) Humano ");
            raca = scan.nextLine();
        }

        if(raca.equalsIgnoreCase("humano")){
            System.out.println("Escolha os indices de: forca, destreza, constiuicao, inteligencia, sabedoria, carisma");
            Humano humano = new Humano(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            System.out.println(humano.toString());
        }

        if(raca.equalsIgnoreCase("elfo")){
            System.out.println("Escolha os indices de: forca, destreza, constiuicao, inteligencia, sabedoria, carisma");
            Elfo elfo = new Elfo(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            System.out.println(elfo.toString());
        }

        if(raca.equalsIgnoreCase("Anao")){
            System.out.println("Escolha os indices de: forca, destreza, constiuicao, inteligencia, sabedoria, carisma");
            Anao anao = new Anao(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            System.out.println(anao.toString());
        }


    }
}


