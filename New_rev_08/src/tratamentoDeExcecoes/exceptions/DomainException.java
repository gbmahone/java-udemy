package tratamentoDeExcecoes.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    //não é obrigado a tratar RuntimeException, então não tem necessidade de colocar o throws no inicio dos metodos
    //na classe reservation
    public DomainException(String msg) {
        super(msg);
    }
}
