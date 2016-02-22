package org.bm.xml.validation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidationDriver {

	public static void main(final String[] args) {
		boolean flag = true;
		try {
			validate("src/main/resources/channel.xml");
		} catch (final ParserConfigurationException e) {
			flag = false;
		} catch (final FileNotFoundException e) {
			flag = false;
			e.printStackTrace();
		} catch (final SAXException e) {
			flag = false;
		} catch (final IOException e) {
			flag = false;
		}
		System.out.println("XML validation result : " + flag);
	}

	private static void validate(final String xmlFilePath)
			throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		docFactory.setValidating(true);
		final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		docBuilder.setErrorHandler(new ErrorHandler() {
			public void warning(final SAXParseException exception) throws SAXException {
				throw exception;
			}

			public void fatalError(final SAXParseException exception) throws SAXException {
				throw exception;
			}

			public void error(final SAXParseException exception) throws SAXException {
				throw exception;
			}
		});
		docBuilder.parse(new FileInputStream(xmlFilePath));
	}

}
