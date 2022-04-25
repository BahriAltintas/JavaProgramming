package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("It is time for short break");
    }

    public FadyException(String message){
        super(message);
    }

} // custom unchecked exception

class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args){

        //throw new FadyException("It is time for lunch");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
