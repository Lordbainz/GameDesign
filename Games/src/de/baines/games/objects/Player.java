package de.baines.games.objects;

import java.awt.Rectangle;

public class Player {
	
	private Rectangle bounding;
	private float f_posx ;
	private float f_posy ;
	private int moveSpeed = 5;
	
	public Player(int x, int y ,int size ){
		this.bounding = new Rectangle(x, y, size, size);
		this.f_posx = x;
		this.f_posy = y;
	}
	
	public void update(boolean up,boolean down,boolean left,boolean right) {
		
		if (up) {f_posy -= moveSpeed;}
		if (down) {f_posy += moveSpeed;}
		if (left) {f_posx -= moveSpeed;}
		if (right) {f_posx += moveSpeed;}
		
		bounding.x=(int)f_posx;
		bounding.y=(int)f_posy;
	}
	
	public Rectangle getBounding() {
		return bounding;
	}
	
	
}
