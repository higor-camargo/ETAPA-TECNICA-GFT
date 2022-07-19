package teste04;

public class CamaroteSuperior extends Vip{
    CamaroteSuperior(double valor) {
        super(valor);
    }

       public void valorIngresso(double adicional){
        setValor(getValor() +adicional );
       }

    @Override
    public String toString() {
        return super.toString();
    }
}


