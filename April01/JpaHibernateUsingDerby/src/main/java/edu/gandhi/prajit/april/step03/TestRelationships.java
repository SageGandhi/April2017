package edu.gandhi.prajit.april.step03;

import javax.persistence.Persistence;

public class TestRelationships {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("JpaTryOut01Relationship01").createEntityManager();
	}
}
