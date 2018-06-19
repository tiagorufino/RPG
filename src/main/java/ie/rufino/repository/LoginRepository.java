package ie.rufino.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ie.rufino.entity.UserEntity;

public class LoginRepository {

	private final EntityManagerFactory entityManagerFactory;
	private final EntityManager entityManager;
	
	public LoginRepository(){
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_rpg");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<UserEntity> login(String login, String password){
		List<UserEntity> UserList = this.entityManager
				.createQuery("SELECT p FROM UserEntity p where p.login=:login and p.password=:password")
				.setParameter("login", login).setParameter("password", password)
				.getResultList();
		return  UserList;
	}
	
}
