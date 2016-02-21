package org.bm.parser;

import java.io.IOException;

import org.bm.parser.handler.SaxHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Application {

	public static void main(final String[] args) {
		try {
			final XMLReader xmlReader = XMLReaderFactory.createXMLReader();
			xmlReader.setContentHandler(new SaxHandler());
			xmlReader.parse("src/main/resources/notes.xml");
		} catch (final SAXException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
