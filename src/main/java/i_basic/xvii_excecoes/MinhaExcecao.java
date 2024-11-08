package i_basic.xvii_excecoes;

public class MinhaExcecao extends RuntimeException {

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }

    public MinhaExcecao(String mensagem, Throwable error) {
        super(mensagem, error);
    }
}

