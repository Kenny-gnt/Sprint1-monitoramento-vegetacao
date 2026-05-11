package model;

public class EquipeManutencao {

    private String nomeEquipe;
    private int quantidadeFuncionarios;

    public EquipeManutencao(String nomeEquipe, int quantidadeFuncionarios) {

        this.nomeEquipe = nomeEquipe;

        if (quantidadeFuncionarios > 0) {
            this.quantidadeFuncionarios = quantidadeFuncionarios;
        } else {
            this.quantidadeFuncionarios = 1;
        }
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void exibirEquipe() {

        System.out.println("Equipe: " + nomeEquipe);
        System.out.println("Funcionários: " + quantidadeFuncionarios);
    }
}