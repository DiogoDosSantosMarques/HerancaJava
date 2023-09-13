public class Motorista extends Profissao{
    private int anosCompletos;
    private String cnh;


    public Motorista(String area, String nomeProfissao, String nomeFuncionario, String sobrenomeFuncionario, int anosCompletos, String cnh){

        super(area, nomeProfissao, nomeFuncionario, sobrenomeFuncionario);

        this.anosCompletos = anosCompletos;
        this.cnh = cnh;
    }


    public int getAnosCompletos() {
        return anosCompletos;
    }


    public void setAnosCompletos(int anosCompletos) {
        this.anosCompletos = anosCompletos;
    }


    public String getCnh() {
        return cnh;
    }


    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    
}