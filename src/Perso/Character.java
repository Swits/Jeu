package Perso;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character implements KeyListener {
	String nom;
	int xp;
	int pdv;
	int force;
	int agilite;
	int intelligence;
	
	
	public Character(String n,int pdv,int f, int a, int i){
		this.nom = n;
		this.pdv = pdv;
		this.force = f;
		this.agilite = a;
		this.intelligence = i;
	}
	
	public Character(){}
	
	public int getxp(){
		return this.xp;
	}
	
	public int getPDV(){
		return this.pdv;
	}
	
	public void setPDV(int n){
		this.pdv += n;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
