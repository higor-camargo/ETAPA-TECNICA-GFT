package teste04;
public class CamaroteInferior extends Vip{

    int piso;
    int camarote;


    CamaroteInferior(double valor) {
        super(valor);
    }

    public void localizaçãoIngresso(int piso, int num){
        setPiso(piso);
        setCamarote(num);

    }

    public void imprimirLocalizacao(){
        System.out.println("Sala VIP piso: "+piso+" , camarote: "+camarote);
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }
}
