package org.bm.parser.handler;

import java.util.List;

import org.bm.parser.pojo.Note;
import org.w3c.dom.Document;

public class Handler {

	public List<Note> noteNodeHandler(final Document doc) {
		final NoteNodeHandler nodeHandler = new NoteNodeHandler();
		final List<Note> noteList = nodeHandler.handleNoteNodes(doc);
		return noteList;
	}
}
