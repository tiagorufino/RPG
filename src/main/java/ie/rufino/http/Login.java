package ie.rufino.http;

public class Login {

	public Login (){
		
	}
	
	public Login (String login, String password, String result){
		this.login = login;
		this.password = password;
		this.result = result;
	}
	
	public Login (String result){
		this.result = result;
	}
	
	private String login;
	private String password;
	private String result;
	
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
