package de.baines.game.objects;

import java.awt.Rectangle;

public class Player {
	
	private Rectangle bounding;
	private int screenHeight;
	private int screenWidth;
	private float f_posx ;
	private float f_posy ;
	private int size;
	private int moveSpeed = 5;
	
	private int energy;
	
	public Player(int x, int y ,int size ,int sHeight, int sWidth){
		this.bounding = new Rectangle(x, y, size, size);
		this.f_posx = x;
		this.f_posy = y;		
		this.size=size;
		this.screenHeight=sHeight;
		this.screenWidth=sWidth;		
	}
	
	public void update(boolean up,boolean down,boolean left,boolean right) {
		
		if (up) {f_posy -= moveSpeed;}
		if (down) {f_posy += moveSpeed;}
		if (left) {f_posx -= moveSpeed;}
		if (right) {f_posx += moveSpeed;}
		
		if (f_posx<0) {f_posx=0;}
		if (f_posy<0) {f_posy=0;}
		if (f_posx>screenWidth-size) {f_posx=screenWidth-size;}
		if (f_posy>screenHeight-size-25) {f_posy=screenHeight-size-25;}

		bounding.x=(int)f_posx;
		bounding.y=(int)f_posy;
	}
	
	public Rectangle getBounding() {
		return bounding;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy=energy;
		
	}
	
	
}
