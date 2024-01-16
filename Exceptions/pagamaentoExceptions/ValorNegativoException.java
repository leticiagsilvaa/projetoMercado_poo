package Exceptions;

public class ValorNegativoException extends PagamentoException {
    public ValorNegativoException() {
        super("O valor do pagamento não pode ser negativo.");
    }
}
