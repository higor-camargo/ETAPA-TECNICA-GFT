package teste02;

public class Humano extends Raca{

    public Humano(int forca, int destreza, int constiuicao, int inteligencia, int sabedoria,int carisma){
        setCarisma(1);
        setConstituicao(1);
        setDestreza(1);
        setForca(1);
        setInteligencia(1);
        setSabedoria(1);

        setForca(getForca() + forca);
        setDestreza(getDestreza() + destreza);
        setConstituicao(getConstituicao() + constiuicao);
        setInteligencia(getInteligencia() + inteligencia);
        setSabedoria(getSabedoria() + sabedoria);
        setCarisma(getCarisma() + carisma);
    }
}
