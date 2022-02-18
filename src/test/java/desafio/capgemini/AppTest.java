package desafio.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import desafio.capgemini.classes.QuestaoDois;
import desafio.capgemini.classes.QuestaoTres;
import desafio.capgemini.classes.QuestaoUm;

/**
 * Testes Unitários
 */
public class AppTest 
{
    /**
     *  Tests Questão Um
     */
    @Test
    public void valorDeNPassado(){
        QuestaoUm q1 = new QuestaoUm(6);
        assertNotNull(q1);
    }

    @Test
    public void criarSaidaComNValores() {
        QuestaoUm q1 = new QuestaoUm(6);
        String aux[][] = q1.criarSaida();

        assertNotNull(aux);
    }

    @Test
    public void criarSaidaComNInvalido() {
        QuestaoUm q1 = new QuestaoUm(-1);
        String aux[][] = q1.criarSaida();

        assertNull(aux);
    }

    @Test
    public void verificarTamanhoValido() {
        QuestaoUm q1 = new QuestaoUm(6);
        assertEquals(6, q1.getTamanho());
    }

    @Test
    public void verificarTamanhoInvalido() {
        QuestaoUm q1 = new QuestaoUm(-1);
        assertEquals(-1, q1.getTamanho());
    }

    /**
     *  Tests Questão Dois
     */
    @Test
    public void senhaValida() {
        QuestaoDois q2 = new QuestaoDois("Qwer@123");
        assertTrue(q2.verificarSenha());
    }

    @Test
    public void senhaInvalida() {
        QuestaoDois q2 = new QuestaoDois("qwer123");
        assertFalse(q2.verificarSenha());
    }

    @Test
    public void verificarMensagemSenhaValida() {
        QuestaoDois q2 = new QuestaoDois("Qwer@123");
        assertEquals("Senha aceita com sucesso!", q2.resultadoSenha());
    }

    @Test
    public void verificarMensagemSenhaInvalida() {
        QuestaoDois q2 = new QuestaoDois("qwer123");
        assertEquals("Senha inválida!", q2.resultadoSenha());
    }

    @Test
    public void verificarMensagemSenhaPoucosDigitos() {
        QuestaoDois q2 = new QuestaoDois("qwe");
        assertEquals("3", q2.resultadoSenha());
    }

    @Test
    public void verificarSenhaPreenchida() {
        QuestaoDois q2 = new QuestaoDois("Qwer@123");
        assertEquals("Qwer@123", q2.getSenha());
    }

    @Test
    public void verificarSenhaNaoPreenchida() {
        QuestaoDois q2 = new QuestaoDois("");
        assertEquals("", q2.getSenha());
    }

    /**
     *  Tests Questão Três
     */
    @Test
    public void verificarParesDeAnagramasPalavraVazia() {
        QuestaoTres q3 = new QuestaoTres("");
        assertEquals(0, q3.totalParesAnagramas());
    }

    @Test
    public void verificarParesDeAnagramasPalavraCheia() {
        QuestaoTres q3 = new QuestaoTres("ifailuhkqq");
        assertEquals(3, q3.totalParesAnagramas());
    }

    @Test
    public void verificarPalavraNaoVazia() {
        QuestaoTres q3 = new QuestaoTres("ifailuhkqq");
        assertEquals("ifailuhkqq", q3.getPalavra());
    }

    @Test
    public void verificarPalavraVazia() {
        QuestaoTres q3 = new QuestaoTres("");
        assertEquals("", q3.getPalavra());
    }
}
