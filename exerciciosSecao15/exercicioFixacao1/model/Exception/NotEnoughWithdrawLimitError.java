package exercicioFixacao1.model.Exception;

public class NotEnoughWithdrawLimitError extends Exception{

    public NotEnoughWithdrawLimitError(String msg) {
        super(msg);
    }
}
