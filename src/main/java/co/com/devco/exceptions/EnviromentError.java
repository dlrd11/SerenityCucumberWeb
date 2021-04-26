package co.com.devco.exceptions;

public class EnviromentError extends Error{

    public EnviromentError(String exceptionsMessage, Throwable throwable){
        super(exceptionsMessage, throwable);
    }

    public EnviromentError(String exceptionsMessage){
        super(exceptionsMessage);
    }
}
