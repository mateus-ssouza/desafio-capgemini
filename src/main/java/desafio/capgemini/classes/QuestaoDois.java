package desafio.capgemini.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Classe responsável para as operações da Questão 2.
 *  @author Mateus Souza 
 */
public class QuestaoDois {

    private String senha;

    /**
     * Construtor QuestaoDois
     * @param senha a senha informada.
     */
    public QuestaoDois(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém a senha.
     * @return uma String com o valor da senha criada.
     */
    public String getSenha() {
        return this.senha;
    }

    /**
     * Configura a senha inicializada.
     * @param s a senha.
     */
    public void setSenha(String s) {
        this.senha = s;
    }

    /**
     * Método para veficar a senha criada.
     * @return um Boolean.
     */
    public boolean verificarSenha() {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6,}$";

        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);
        return m.matches();
    }

    /**
     * Método para mostrar o resultado da senha.
     * @return uma String.
     */
    public String resultadoSenha() {

        if (!verificarSenha()) {
            int total = 6 - senha.length();
            if (total > 0) {
                return String.format("%d", total);
            }
            return "Senha inválida!";
        }
        return "Senha aceita com sucesso!";
    }

}
