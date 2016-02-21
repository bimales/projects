package org.bm.parser.handler;

import java.util.ArrayList;
import java.util.List;

import org.bm.parser.pojo.Note;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NoteNodeHandler {

	public List<Note> handleNoteNodes(final Document doc) {
		final List<Note> noteList = new ArrayList<Note>();
		final NodeList nodeLists = doc.getElementsByTagName("note");
		for (int i = 0; i < nodeLists.getLength(); i++) {
			noteList.add(getNode(nodeLists.item(i)));
		}
		return noteList;
	}

	private Note getNode(final Node item) {
		Note noteObject = null;
		if (item.getNodeType() == Node.ELEMENT_NODE) {
			final Element note = (Element) item;
			noteObject = createNoteObject(note);
		}
		return noteObject;
	}

	private Note createNoteObject(final Element note) {
		final Note noteObject = new Note();
		noteObject.setId(Integer.parseInt(note.getAttribute("id")));
		final NodeList chileNodeList = note.getChildNodes();
		for (int i = 0; i < chileNodeList.getLength(); i++) {
			final Node node = chileNodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				final Element nodeElement = (Element) node;
				if (nodeElement.getTagName().equals("to")) {
					noteObject.setTo(nodeElement.getTextContent());
				} else if (nodeElement.getTagName().equals("from")) {
					noteObject.setFrom(nodeElement.getTextContent());
				} else if (nodeElement.getTagName().equals("heading")) {
					noteObject.setHeading(nodeElement.getTextContent());
				} else if (nodeElement.getTagName().equals("body")) {
					noteObject.setBody(nodeElement.getTextContent());
				}
			}
		}
		return noteObject;
	}

}
