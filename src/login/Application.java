package login; 

public class Application {

	public static void main(String[] args) {
		IdSenhas idSenha = new IdSenhas();
		
		LoginPage loginPage = new LoginPage(idSenha.getLoginInfo());

	}

}
