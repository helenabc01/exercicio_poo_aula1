package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Suculenta;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        Suculenta echeveria = new Suculenta("Echeveria", 3, true);
        Suculenta aloeVera = new Suculenta("Aloe Vera", 1, false);

        System.out.println("\n--- Testando métodos das suculentas ---");

        echeveria.regar();

        aloeVera.regar();

        echeveria.tomarSol();

        aloeVera.tomarSol();

        System.out.println("\n--- Testando proteção do setter ---");

        aloeVera.setNivelAgua(-5);

        System.out.println("Nível de água da " + aloeVera.getEspecie() + ": " + aloeVera.getNivelAgua());

        System.out.println("\n--- Estado final das plantas ---");
        System.out.println(echeveria.getEspecie() + " | nível de água: " + echeveria.getNivelAgua());
        System.out.println(aloeVera.getEspecie() + " | nível de água: " + aloeVera.getNivelAgua());
    }
}