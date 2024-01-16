package Exceptions;

public class ChavePIXException extends PagamentoException {
    public ChavePIXException() {
        super("Chave PIX vazia.");
    }
}
