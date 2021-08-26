package edu.eci.arsw.blueprints.persistence.impl;

import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;

public class AnotherBlueprintsPersistence implements BlueprintsPersistence{

	@Override
	public void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Blueprint getBlueprint(String author, String bprintname) throws BlueprintNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Blueprint> getBlueprintsByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
