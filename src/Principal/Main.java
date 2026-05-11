package Principal;

import model.EquipeManutencao;
import model.TrechoRodovia;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println(" SISTEMA DE MONITORAMENTO DE VEGETAÇÃO ");
        System.out.println("--------------------------------------");

        EquipeManutencao equipeNorte =
                new EquipeManutencao("Equipe Norte", 5);

        EquipeManutencao equipeSul =
                new EquipeManutencao("Equipe Sul", 4);

        TrechoRodovia trecho1 =
                new TrechoRodovia("BR-116", 10, 15, 12);

        TrechoRodovia trecho2 =
                new TrechoRodovia("BR-101", 20, 28, 32);

        trecho1.registrarCrescimento(8);

        trecho2.registrarCrescimento(20);

        if (trecho1.ehTrechoCritico()) {
            trecho1.associarEquipe(equipeNorte);
        }

        if (trecho2.ehTrechoCritico()) {
            trecho2.associarEquipe(equipeSul);
        }

        trecho1.exibirRelatorio();

        trecho2.exibirRelatorio();
    }
}