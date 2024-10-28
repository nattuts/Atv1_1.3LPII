public class Retangulo{
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento(){
        return comprimento;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public float getLargura(){
        return largura;
    }
    public void setLargura(float largura){
        this.largura =  largura;
    }

    public float getArea(){
        return comprimento * largura;
    }

    public float getPerimetro(){
        return 2*(comprimento + largura);
    }

    public String toString(){
        return "Retangulo[comprimento = " + comprimento + ", largura = " + largura + "]";
    }
}