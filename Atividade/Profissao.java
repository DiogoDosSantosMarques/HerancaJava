public class Profissao{
    private String area;
    private String nomeProfissao;
    private String nomeFuncionario;
    private String sobrenomeFuncionario;


    public Profissao(String area, String nomeProfissao, String nomeFuncionario, String sobrenomeFuncionario){
        this.area = area;
        this.nomeProfissao = nomeProfissao;
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }



    // Getters and Setters

    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }



    public String getNomeProfissao() {
        return nomeProfissao;
    }



    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }



    public String getNomeFuncionario() {
        return nomeFuncionario;
    }



    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }



    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }



    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }

    

    

}