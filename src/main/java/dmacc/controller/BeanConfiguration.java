package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Player;
import dmacc.beans.Team;

@Configuration
public class BeanConfiguration {
	@Bean
	public Player player() {
		Player bean = new Player("Messi");
		bean.setName("Lionel Messi");
		bean.setNumber("10");
		bean.setPosition("Mid");
		return bean;
	}

	@Bean
	public Team team() {
		Team bean = new Team("FC Barcelona", "La Liga");
		return bean;
	}
}