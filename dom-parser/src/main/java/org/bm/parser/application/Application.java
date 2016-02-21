package org.bm.parser.application;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.bm.parser.handler.Handler;
import org.bm.parser.pojo.Note;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Application {

	private static final String XML_FILE = "src/main/resources/notes.xml";

	public static void main(final String[] args) {
		final Handler handler = new Handler();
		final DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			final DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			final Document doc = docBuilder.parse(XML_FILE);
			final List<Note> noteList = handler.noteNodeHandler(doc);
			noteReport(noteList);
		} catch (final ParserConfigurationException e) {
			e.printStackTrace();
		} catch (final SAXException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	private static void noteReport(final List<Note> noteList) {
		for (final Note note : noteList) {
			System.out.println(note.toString());
		}
	}

}
