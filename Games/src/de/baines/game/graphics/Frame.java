package de.baines.game.graphics;


import javax.swing.JFrame;

import de.baines.game.objects.KeyHandler;


public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;

	private Screen screen;
	
	public Frame() {
		super("MoveTest");
	}
		
	public void setKeyHandler(KeyHandler keyHandler) {
		addKeyListener(keyHandler);
	}
	
	public void addScreen(Screen screen) {
		add(screen);
	}
	
	public Screen getScreen() {
		return this.screen;
	}
	
	
}
