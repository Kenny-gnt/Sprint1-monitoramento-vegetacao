package model;

public class TrechoRodovia {

    private String rodovia;
    private double quilometroInicial;
    private double quilometroFinal;
    private double nivelVegetacao;

    private EquipeManutencao equipeResponsavel;

    public TrechoRodovia(String rodovia,
                         double quilometroInicial,
                         double quilometroFinal,
                         double nivelVegetacao) {

        this.rodovia = rodovia;

        if (quilometroFinal > quilometroInicial) {

            this.quilometroInicial = quilometroInicial;
            this.quilometroFinal = quilometroFinal;

        } else {

            this.quilometroInicial = 0;
            this.quilometroFinal = 0;
        }

        if (nivelVegetacao >= 0) {
            this.nivelVegetacao = nivelVegetacao;
        } else {
            this.nivelVegetacao = 0;
        }
    }

    public void registrarCrescimento(double taxaCrescimento) {

        if (taxaCrescimento <= 0) {
            return;
        }

        nivelVegetacao += taxaCrescimento;
    }

    public void associarEquipe(EquipeManutencao equipe) {

        this.equipeResponsavel = equipe;
    }

    public boolean ehTrechoCritico() {

        return nivelVegetacao >= 30;
    }

    public String getRodovia() {
        return rodovia;
    }

    public double getQuilometroInicial() {
        return quilometroInicial;
    }

    public double getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

    public void setNivelVegetacao(double nivelVegetacao) {

        if (nivelVegetacao >= 0) {
            this.nivelVegetacao = nivelVegetacao;
        } else {
            this.nivelVegetacao = 0;
        }
    }

    public void exibirRelatorio() {

        System.out.println("\n--------------------------------------");
        System.out.println("TRECHO MONITORADO");
        System.out.println("--------------------------------------");
        System.out.println("Rodovia: " + rodovia);
        System.out.println("KM Inicial: " + quilometroInicial);
        System.out.println("KM Final: " + quilometroFinal);
        System.out.println("Vegetação: " + nivelVegetacao + " cm");

        if (ehTrechoCritico()) {
            System.out.println("Status: TRECHO CRÍTICO");
        } else {
            System.out.println("Status: Nível seguro");
        }

        if (equipeResponsavel != null) {
            System.out.println("Equipe Responsável: "
                    + equipeResponsavel.getNomeEquipe());
        }

        System.out.println("--------------------------------------");
    }
}