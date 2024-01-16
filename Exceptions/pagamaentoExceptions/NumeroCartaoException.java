package Exceptions;

public class NumeroCartaoException extends PagamentoException {
    public NumeroCartaoException() {
        super("Número do cartão vazio.");
    }
}
