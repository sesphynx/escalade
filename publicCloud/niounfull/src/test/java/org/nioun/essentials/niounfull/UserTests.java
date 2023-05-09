package org.nioun.essentials.niounfull;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.nioun.essentials.niounfull.model.User;
import org.nioun.essentials.niounfull.repositories.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserTests {

	@Autowired
	private TestEntityManager entityManager; 
	
	@Autowired 
	private UserRepository userRepository;
	
	
	
	@Test
	public void test_save_user() {
		
		User user = new User();
		user.setName("Moussa");
		user.setSurname("kalamou");
		user.setEmail("mkdsmks@hkd.cor");
		user.setUsername("mouska");
		user.setPassword("mouska");
		 entityManager.persist(user);
		//userRepository.save(user);
		
		assertThat(user).hasFieldOrPropertyWithValue( "name","Moussa");
		assertThat(user).hasFieldOrPropertyWithValue("email" , "mkdsmks@hkd.cor");
		
	}
	
	@Test
	public void test_get_users() {
		User user = new User();
		user.setName("jon");
		user.setSurname("kalamou");
		user.setEmail("mkdsmks@hkd.cor");
		user.setUsername("mouska");
		user.setPassword("mouska");
		entityManager.persist(user);
		
		
		User user1 = new User();
		user1.setName("aicha");
		user1.setSurname("bajjo");
		user1.setEmail("bajjo@iri.cor");
		user1.setUsername("chabaj");
		user1.setPassword("chabaj");
		entityManager.persist(user1);
		
		List<User> users = new ArrayList<>(userRepository.findAll());
		
	  assertThat(users).hasSize(2).contains(user,user1);
		
	}
	
	@Test
	public void test_get_user() {
		User user = new User();
		user.setName("Moussa");
		user.setSurname("kalamou");
		user.setEmail("mkdsmks@hkd.cor");
		user.setUsername("mouska");
		user.setPassword("mouska");
		entityManager.persist(user);
		
		User user1 = new User();
		user1.setName("aicha");
		user1.setSurname("bajjo");
		user1.setEmail("bajjo@iri.cor");
		user1.setUsername("chabaj");
		user1.setPassword("chabaj");
		entityManager.persist(user1);
		
		User user2 = new User();
		user2.setName("funxbii");
		user2.setSurname("chap");
		user2.setEmail("chaplii@saaman.world");
		user2.setUsername("chaplii");
		user2.setPassword("chaplii");
		entityManager.persist(user2);
		
		
		User person = userRepository.findById(user2.getId()).get();
		
		//assertThat(person.getName()).isEqualTo(user2.getName());
		//assertThat(person.getSurname()).isEqualTo("chap");
		
	}
	
	

}
