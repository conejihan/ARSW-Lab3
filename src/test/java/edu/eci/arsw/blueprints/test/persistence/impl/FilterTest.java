package edu.eci.arsw.blueprints.test.persistence.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;
import edu.eci.arsw.blueprints.services.BlueprintsServices;

public class FilterTest {

	   @Test
	    public void getRedundanceFilteredBp() throws BlueprintPersistenceException, BlueprintNotFoundException {
	    	// Put label "@Service" on RedundanceFilter
		    ApplicationContext  spring = new ClassPathXmlApplicationContext("applicationContext.xml");
			BlueprintsServices bpps = spring.getBean(BlueprintsServices.class);
	    	Point[] pts=new Point[]{new Point(0, 0),new Point(10, 10), new Point(10, 10), new Point(15, 15), new Point(15, 15), new Point(16,16)};
	    	HashSet<Blueprint> hbp = new HashSet<Blueprint>();
	    	Blueprint bp = new Blueprint("Luis","LaPintura", pts);
	    	bpps.addNewBlueprint(bp);
	
	    	List<Point> list = bpps.getBlueprint("Luis","LaPintura").getPoints();
	    	List<Point> esp = new ArrayList<Point>();
	    	esp.add(new Point(0,0));
	    	esp.add(new Point(10,10));
	    	esp.add(new Point(15,15));
	    	esp.add(new Point(16,16));
	    	boolean valido = true;
	    	for(int i = 0; i < esp.size(); i++) {
	    		if(!(esp.get(i).getX() == list.get(i).getX() && esp.get(i).getY() == list.get(i).getY())) {
	    			valido = false;
	    		} 
	    	}
	    	assertTrue(valido);
	    
	    }
	   
	   @Test
	    public void getSecuenceFilteredBp() throws BlueprintPersistenceException, BlueprintNotFoundException {
	    	// Put label "@Service" on RedundanceFilter
		    ApplicationContext  spring = new ClassPathXmlApplicationContext("applicationContext.xml");
			BlueprintsServices bpps = spring.getBean(BlueprintsServices.class);
	    	Point[] pts=new Point[]{new Point(0, 0),new Point(10, 10), new Point(10, 10), new Point(15, 15), new Point(20, 20)};
	    	HashSet<Blueprint> hbp = new HashSet<Blueprint>();
	    	Blueprint bp = new Blueprint("Luis","LaPintura", pts);
	    	bpps.addNewBlueprint(bp);
	
	    	List<Point> list = bpps.getBlueprint("Luis","LaPintura").getPoints();
	    	List<Point> esp = new ArrayList<Point>();
	    	esp.add(new Point(0,0));
	    	esp.add(new Point(10,10));
	    	esp.add(new Point(20,20));
	    	boolean valido = true;
	    	for(int i = 0; i < esp.size(); i++) {
	    		if(!(esp.get(i).getX() == list.get(i).getX() && esp.get(i).getY() == list.get(i).getY())) {
	    			valido = false;
	    		} 
	    	}
	    	assertTrue(valido);
	    
	    }
	   

}
