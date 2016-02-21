package org.bm.parser.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Started scanning the XML file");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Completed scanning the XML file");
	}

	@Override
	public void startElement(final String uri, final String localName, final String qName, final Attributes attributes)
			throws SAXException {
		System.out.println("<" + qName + ">");
	}

	@Override
	public void endElement(final String uri, final String localName, final String qName) throws SAXException {
		System.out.println("</" + qName + ">");
	}

	@Override
	public void characters(final char ch[], final int start, final int length) throws SAXException {
		for (int i = start; i < start + length; i++) {
			System.out.print(ch[i]);
		}
	}

}
