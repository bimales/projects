package org.bm.xml.validation;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class ValidationDriver {

	public static void main(final String[] args) {
		Boolean validationFlag = true;
		try {
			validate("src/main/resources/channel.xml", "src/main/resources/channel.xsd");
		} catch (final SAXException e) {
			validationFlag = false;
		} catch (final IOException e) {
			validationFlag = false;
		}
		System.out.println("XML validation result : " + validationFlag);
	}

	private static void validate(final String xmlFile, final String validationSchema) throws SAXException, IOException {
		final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		schemaFactory.newSchema(new File(validationSchema)).newValidator()
				.validate(new StreamSource(new File(xmlFile)));
	}

}
