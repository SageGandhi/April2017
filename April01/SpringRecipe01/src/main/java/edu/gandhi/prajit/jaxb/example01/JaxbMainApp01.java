package edu.gandhi.prajit.jaxb.example01;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import edu.gandhi.prajit.jaxb.example01.classes.JcgCountry;

public class JaxbMainApp01 {
	public static void main(String[] args) throws Exception {
		/** Setup Data For JcgCountry */
		final JcgCountry jcgCountry01 = JcgCountry.class.newInstance();
		jcgCountry01.setCapital("New Delhi");
		jcgCountry01.setContinent("Asia");
		jcgCountry01.setName("India");
		jcgCountry01.setPopulation("125M");
		jcgCountry01.setNationalLanguage("Hindi");
		/**
		 * Let Marshall Java Object To Xml,Initialize Marshaller Using
		 * JaxbContext
		 */
		final Marshaller marshaller01 = JAXBContext.newInstance(JcgCountry.class).createMarshaller();
		/** Format The Output :Set True */
		marshaller01.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller01.marshal(jcgCountry01, System.out);
	}
}