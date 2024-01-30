package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	private static User save;
	private static List<User> of;

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userrepository = context.getBean(UserRepository.class);
	//		User user = new User();
	//		user.setId(0);
	//		user.setName("Akshat Nandu Hole");
	//		user.setCity("Pune");
	//		user.setStatus("BUsy");
	//		
	//		User user1 = userrepository.save(user);
	//		System.out.println(user1);
		
		
		User user1 = new User();
		user1.setName("Pritesh");
		user1.setCity("Konkarn");
		user1.setStatus("Traveling");
		
		User user2 = new User();
		user2.setName("Karan");
		user2.setCity("Phaltan");
		user2.setStatus("Car");
		
	//	User resultUser = userrepository.save(user1);		//saving user
		
//		System.out.println("saved USer" + resultUser);
		//save All objects
//		List<User> users = List.of(user1 , user2);
//		Iterable<User> result = userrepository.saveAll(users);
//		
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		System.out.println("done");
		
//		Optional<User> optional = userrepository.findById(52);
//		User user =optional.get();
//		
//		user.setName("Atharva");
//		User result= userrepository.save(user);
//		System.out.println(result);
		
		
		//how to get the data
		Iterable<User> result = userrepository.findAll();
//		Iterator<User> iterator = result.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		
//		result.forEach(new Consumer<User>() {
//			@Override
//			
//			public void accept(User t) {
//				System.out.println(t);
//			}
//		});
//		
//		
//		result.forEach(user->System.out.println(user));
		
		
//		userrepository.delete(user1);
		
	}

}
