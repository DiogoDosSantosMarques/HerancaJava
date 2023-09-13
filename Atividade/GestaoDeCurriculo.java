public class GestaoDeCurriculo {
    

    public static void main(String[]  args){

        EngenheiroAgronomo engenheiro = new EngenheiroAgronomo("Engenharia", "Engenheiro Agronomo", "Pelé", "Arantes", 100, 200, 250);

        System.out.printf("O Engenheiro: Nome Profisão: %s Nome Funcionario: %s ", engenheiro.getNomeProfissao(), engenheiro.getNomeFuncionario());
    }
}
