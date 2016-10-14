/**
 *
 */
package org.bm.soundsystem.implementations;

import org.bm.soundsystem.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author bmandal
 *
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

	private final String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private final String artist = "The Beatles";

	/*
	 * (non-Javadoc)
	 *
	 * @see org.bm.soundsystem.interfaces.CompactDisc#play()
	 */
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
