/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab_2_proje_1;
import java.util.ArrayList;

public class location {

	private int x;
	private int y;
	Boolean duvar;

	ArrayList<location> shortpath;
	int cost;
	
	public location() {
		duvar=false;
		cost=0;
		this.shortpath=new ArrayList<location>();
	}
	public location(int x,int y) {
		this.x=x;
		this.y=y;
		this.duvar=false;
		this.shortpath=new ArrayList<location>();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
