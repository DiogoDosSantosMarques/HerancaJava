public class EngenheiroAgronomo extends Profissao {
    private int idade;
    private int qtdGado;
    private double hecTerra;


    public EngenheiroAgronomo(String area, String nomeProfissao, String nomeFuncionario, String sobrenomeFuncionario, int idade, int qtdGado, double hecTerra){

        super(area, nomeProfissao, nomeFuncionario, sobrenomeFuncionario);

        this.idade = idade;
        this.qtdGado = qtdGado;
        this.hecTerra = hecTerra;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getQtdGado() {
        return qtdGado;
    }


    public void setQtdGado(int qtdGado) {
        this.qtdGado = qtdGado;
    }


    public double getHecTerra() {
        return hecTerra;
    }


    public void setHecTerra(double hecTerra) {
        this.hecTerra = hecTerra;
    }
    

    


    
}
