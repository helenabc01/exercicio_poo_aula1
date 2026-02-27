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

        Suculenta echeveria = new Suculenta();
        echeveria.especie = "Echeveria";
        echeveria.nivelAgua = 3;
        echeveria.solConstante = true;

        Suculenta aloeVera = new Suculenta();
        aloeVera.especie = "Aloe Vera";
        aloeVera.nivelAgua = 1;
        aloeVera.solConstante = false;

        System.out.println("Suculenta 1: " + echeveria.especie + "; nível de água: " + echeveria.nivelAgua + "; Precisa de muito sol? " + echeveria.solConstante);
        System.out.println("Suculenta 1: " + aloeVera.especie + "; nível de água: " + aloeVera.nivelAgua + "; Precisa de muito sol? " + aloeVera.solConstante);
    }
}