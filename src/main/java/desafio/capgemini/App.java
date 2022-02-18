package desafio.capgemini;

import desafio.capgemini.classes.QuestaoDois;
import desafio.capgemini.classes.QuestaoTres;
import desafio.capgemini.classes.QuestaoUm;

/**
 *  Classe de execução.
 *  @author Mateus Souza.
 */
public class App {

    public static void main(String[] args) {

       /**
        * Exemplo Questão 1
        */
        System.out.print("Exemplo Questão 1:\n\n");
        QuestaoUm n = new QuestaoUm(6);
        n.mostrarSaida();
        System.out.print("======================================\n\n");
        
        /**
        * Exemplos Questão 2
        */
        System.out.print("Exemplo Questão 2:\n\n");
        System.out.println("Ex1 senha(Ya3):");
        QuestaoDois entrada = new QuestaoDois("Ya3");
        System.out.println(entrada.resultadoSenha());

        System.out.println("Ex2 senha(Ya3&ab):");
        entrada.setSenha("Ya3&ab");
        System.out.println(entrada.resultadoSenha());
        System.out.print("======================================\n\n");
        
        /**
        * Exemplos Questão 3
        */
        System.out.print("Exemplo Questão 3:\n\n");
        System.out.println("Ex1 palavra(ovo):");
        QuestaoTres palavra = new QuestaoTres("ovo");
        System.out.println(palavra.totalParesAnagramas());

        System.out.println("Ex2 palavra(ifailuhkqq):");
        palavra.setPalavra("ifailuhkqq");
        System.out.println(palavra.totalParesAnagramas());
        
    }
}
