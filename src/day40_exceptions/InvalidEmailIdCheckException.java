package day40_exceptions;

public class InvalidEmailIdCheckException extends Exception{
	
	private static final long serialVersionUID = 1L;
	//Java exceptionlarin tekrarsiz olmasi icin her exception a unique bir kod verir

	InvalidEmailIdCheckException(String message){
		super(message);
	}

}
