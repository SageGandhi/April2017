package edu.gandhi.prajit.april.appmain;

import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForProperties;
import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;

public class SystemDefaultMainClassV01 {
	public static void main(String[] args){
		/**We Have Configured hibernate.properties File In ClassPath.*/
		HibernateUtilForProperties.getSessionFactory().openSession().close();
		HibernateUtilForProperties.getSessionFactory().close();
		/**We Have Configured hibernate.cfg.xml File In ClassPath.*/
		HibernateUtilForXml.getSessionFactory().openSession().close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}