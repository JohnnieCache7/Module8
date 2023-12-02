package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Player;
import dmacc.beans.Team;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PlayerRepository;

@SpringBootApplication
public class SpringSoccerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		  SpringApplication.run(SpringSoccerApplication.class, args);
		  /*
		  ApplicationContext appContext = new
		  AnnotationConfigApplicationContext(BeanConfiguration.class);
		  
		  Player p1 = appContext.getBean("player", Player.class);
		  
		 System.out.println(p1.toString());
		 */

	}

	@Autowired
	PlayerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		Player p1 = appContext.getBean("player", Player.class);
		p1.setPosition("Center Forward");
		repo.save(p1);

		// Create a bean to use - not managed by Spring
		Player p2 = new Player("Ronaldo", "7", "Striker");
		Team t2 = new Team("Real Madrid", "La Liga");
		p2.setTeam(t2);
		repo.save(p2);

		List<Player> allMyPlayers = repo.findAll();
		for (Player people : allMyPlayers) {
			System.out.println(people.toString());
		}

		((AbstractApplicationContext) appContext).close();

	}

}
