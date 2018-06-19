package ie.rufino.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ie.rufino.entity.UserEntity;
import ie.rufino.http.Atributos;
import ie.rufino.http.Ficha;
import ie.rufino.http.Fisico;
import ie.rufino.http.Login;
import ie.rufino.http.Mental;
import ie.rufino.http.Social;
import ie.rufino.repository.LoginRepository;

/**
 * Rest class 
 * @author Tiago RUfino
 *
 */
@Path("/service")
public class ServiceController {

	private final LoginRepository repository = new LoginRepository();
	
	/**
	 * Do the login
	 * @param loginPage
	 * @param password
	 * @return login
	 */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/login")
	public Login login(@QueryParam("login") String loginPage, @QueryParam("password") String password){
		List<UserEntity> loginList = repository.login(loginPage, password);
		Login login = new Login(loginPage, password, "");
		if (!loginList.isEmpty()){
			login.setResult("");
			return login;
		}
		login.setResult("Usuário ou Password incorreto");
		return login;
	}
	
	/**
	 * Do the attributes
	 * @return Attributes
	 */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/loadAtributos")
	public Ficha atributos(){
		Ficha ficha = new Ficha();
		ficha.setNivel(1);
		Atributos atributos = new Atributos();
		atributos.setNivel(2);
		atributos.setTotal(3);
		Fisico fisico = new Fisico(4, 1, 8, 21);
		Social social = new Social(7, 2, 5, 22);
		Mental mental = new Mental(6, 5, 7, 23);
		atributos.setFisico(fisico);
		atributos.setSocial(social);
		atributos.setMental(mental);
		atributos.setTotal(3);;
		ficha.setAtributos(atributos);
		ficha.setResult("");
		
		return ficha;
	}
}
