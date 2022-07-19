package teste02;

public class Anao extends Raca {



   public Anao(int forca, int destreza, int constiuicao, int inteligencia, int sabedoria,int carisma){
       setConstituicao(2);
       setForca(2);
       setSabedoria(2);

       setForca(getForca() + forca);
       setDestreza(getDestreza() + destreza);
       setConstituicao(getConstituicao() + constiuicao);
       setInteligencia(getInteligencia() + inteligencia);
       setSabedoria(getSabedoria() + sabedoria);
       setCarisma(getCarisma() + carisma);

   }

    @Override
    public String toString() {
        return super.toString();
    }
}
