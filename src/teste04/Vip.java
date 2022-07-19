package teste04;

public class Vip extends Ingresso{

    Vip(double valor) {
        super(valor);
    }

    public void ingressoVip(double adicional){
        setValor(getValor() + adicional);

    }
}
