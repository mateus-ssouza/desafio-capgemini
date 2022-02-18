package desafio.capgemini.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Classe responsável para as operações da Questão 3.
 *  @author Mateus Souza 
 */
public class QuestaoTres {
    private String palavra;

    /**
     * Construtor Questao3
     * @param palavra a palavra informada.
     */
    public QuestaoTres(String palavra) {
        this.palavra = palavra;
    }

    /**
     * Obtém a palavra.
     * @return uma String da palavra criada.
     */
    public String getPalavra() {
        return this.palavra;
    }

    /**
     * Configura a palavra inicializada.
     * @param s a palavra.
     */
    public void setPalavra(String s) {
        this.palavra = s;
    }

    /**
     * Método para verificar as letras iguais.
     * @return um Integer.
     */
    private int verificarLetras() {
        int cont = 0, total = 0;
        char comp1, comp2;
        String letrasIguais = "";

        for (int j = 0; j < palavra.length(); j++) {
            for (int i = j + 1; i < palavra.length(); i++) {

                comp1 = palavra.charAt(i);
                comp2 = palavra.charAt(j);

                String aux = "";
                aux += comp1;

                if (comp1 == comp2 && !(letrasIguais.contains(aux))) {
                    letrasIguais += comp1;
                    cont++;
                }
                aux = "";
            }

            if (cont > 0) {
                total++;
            }
            cont = 0;
        }

        return total;
    }

    /**
     * Método para verificar os anagramas na palavra.
     * @return um Integer.
     */
    private int verificarAnagrama() {

        List<String> arraySubstrings = new ArrayList<>();
        List<String> vetorAux = new ArrayList<>();
        int cont = 0;

        for (int k = 1; k < palavra.length(); k++) {

            for (int i = 0; i <= palavra.length() - k; i++) {
                arraySubstrings.add(palavra.substring(i, i + k));
            }
        }

        for (int i = 2; i < palavra.length(); i++) {
            for (String t : arraySubstrings) {
                if (t.length() == i) {
                    char[] aux = t.toCharArray();
                    Arrays.sort(aux);
                    String st = new String(aux);
                    vetorAux.add(st);
                }
            }

            for (int j = 0; j < vetorAux.size() - 1; j++) {
                if (vetorAux.get(j).equals(vetorAux.get(j + 1)))
                    cont++;
            }

            vetorAux.clear();
        }
        return cont;
    }

    /**
     * Método para mostrar a quantidade de anagramas da palavra.
     * @return um Integer.
     */
    public int totalParesAnagramas() {
        return this.verificarAnagrama() + this.verificarLetras();
    }
}
