public class Advogado extends Profissao{

    private String oab;

    public Advogado(String area, String nomeProfissao, String nomeFuncionario, String sobrenomeFuncionario, String oab){

        super(area, nomeProfissao, nomeFuncionario, sobrenomeFuncionario);

        this.oab = oab;



        
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
}