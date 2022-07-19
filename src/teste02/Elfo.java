package teste02;

public class Elfo extends Raca{

    public Elfo(int forca, int destreza, int constiuicao, int inteligencia, int sabedoria,int carisma){
        setDestreza(2);
        setCarisma(2);
        setInteligencia(2);

        setForca(getForca() + forca);
        setDestreza(getDestreza() + destreza);
        setConstituicao(getConstituicao() + constiuicao);
        setInteligencia(getInteligencia() + inteligencia);
        setSabedoria(getSabedoria() + sabedoria);
        setCarisma(getCarisma() + carisma);

    }


}
