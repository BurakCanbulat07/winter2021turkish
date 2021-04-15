package day40_exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckException {
		String email="rasit@gmail.com";
		mailDogrula(email);
	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckException{
		if (email.contains("@gmail.com")||email.contains("@hotmail.com")) {
			System.out.println(email);
		}else {
			throw new InvalidEmailIdCheckException("Email uygun degil");
		}
	}
}
