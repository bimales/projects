/**
 *
 */
package org.bm.soundsystem.implementations;

import org.bm.soundsystem.interfaces.CompactDisc;
import org.bm.soundsystem.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bmandal
 *
 */
@Component
public class CDPlayer implements MediaPlayer {

	private final CompactDisc cd;

	@Autowired
	public CDPlayer(final CompactDisc cd) {
		this.cd = cd;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.bm.soundsystem.interfaces.MediaPlayer#play()
	 */
	public void play() {
		cd.play();
	}

}
