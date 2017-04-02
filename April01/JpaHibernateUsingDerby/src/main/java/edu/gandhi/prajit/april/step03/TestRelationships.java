package edu.gandhi.prajit.april.step03;

import java.text.MessageFormat;

import javax.persistence.Persistence;

public class TestRelationships {
	public static void main(String[] args) {
		String[] UnitName = { "JpaTryOut01", "JpaTryOut02ForMappingXml", "JpaTryOut01RelationshipMto",
				"JpaTryOut01RelationshipOto", "JpaTryOut01RelationshipOtm", "JpaTryOut01RelationshipMtm",
				"JpaTryOut01RelationshipUniotm", "JpaTryOut01RelationshipElementCollection01",
				"JpaTryOut01Relationship01", "JpaTryOut01Jpql01" };
		for (final String puName : UnitName) {
			System.out.println(MessageFormat
					.format("Persistence.createEntityManagerFactory(\"{0}\").createEntityManager().close();", puName));
			/*Persistence.createEntityManagerFactory(puName).createEntityManager().close();*/
		}
		/*Persistence.createEntityManagerFactory("JpaTryOut01").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut02ForMappingXml").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipMto").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipOto").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipOtm").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipMtm").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipUniotm").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01RelationshipElementCollection01").createEntityManager().close();*/
		/*Persistence.createEntityManagerFactory("JpaTryOut01Relationship01").createEntityManager().close();*/
		Persistence.createEntityManagerFactory("JpaTryOut01Jpql01").createEntityManager().close();
	}
}