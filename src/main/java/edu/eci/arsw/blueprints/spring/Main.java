package edu.eci.arsw.blueprints.spring;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.eci.arsw.blueprints.services.BlueprintsServices;
import edu.eci.arsw.blueprints.model.Blueprint;

public class Main {
	public static void main(String[] args) {
		ApplicationContext  spring = new ClassPathXmlApplicationContext("applicationContext.xml");
		BlueprintsServices bpps = spring.getBean(BlueprintsServices.class);
		Set<Blueprint> allblueprint = bpps.getAllBlueprints();
	}

}
