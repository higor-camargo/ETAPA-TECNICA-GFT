package teste04;

public class Main {
    public static void main(String[] args) {
       Normal ingressoNormal = new Normal(15);
       Vip vip = new Vip(200);
       CamaroteInferior camInf = new CamaroteInferior(120);
       CamaroteSuperior camSup = new CamaroteSuperior(130);

        System.out.println(ingressoNormal.toString());
        vip.ingressoVip(200);
        System.out.println(vip.toString());
        camInf.localizaçãoIngresso(2,3);
        camInf.imprimirLocalizacao();
        camSup.ingressoVip(300);
        System.out.println(camSup.toString());




    }
}
