package desafio.capgemini.classes;

/**
 *  Classe responsável para as operações da Questão 1.
 *  @author Mateus Souza 
 */
public class QuestaoUm {
    private int tamanho;
    private String saida[][];

    /**
     * Construtor QuestaoUm
     * @param tamanho o tamanho do valor N.
     */
    public QuestaoUm(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Obtém o tamanho
     * @return um Integer especificando o valor passado de N.
     */
    public int getTamanho() {
        return this.tamanho;
    }

    /**
     * Configura o tamanho de N que foi inicializado.
     * @param t o tamanho.
     */
    public void setTamanho(int t) {
        this.tamanho = t;
    }

    /**
     * Método para realizar a criação do desenho.
     * @return um Array de String.
     */
    public String[][] criarSaida() {

        if (tamanho <= 0)
            return null;

        this.saida = new String[tamanho][tamanho];
        int aux = tamanho - 1;

        for (int i = 0; i < saida.length; i++) {
            for (int j = 0; j < saida.length; j++) {
                if (j < aux) {
                    saida[i][j] = " ";
                } else {
                    saida[i][j] = "*";
                }
            }
            aux--;
        }

        return this.saida;
    }
    
    /**
     * Método para mostrar a saída baseada no valor N.
     */
    public void mostrarSaida() {

        if (tamanho <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        

        String aux[][] = this.criarSaida();

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                System.out.print(aux[i][j]);
            }
            System.out.println();
        }
    }
}
