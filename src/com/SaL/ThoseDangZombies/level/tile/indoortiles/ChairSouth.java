package com.SaL.ThoseDangZombies.level.tile.indoortiles;

import java.awt.Graphics;

import com.SaL.ThoseDangZombies.level.tile.Tile;
import com.SaL.ThoseDangZombies.screen.GameScreen;

public class ChairSouth extends Tile{
	public void Register(int x, int y) {
	loc[x][y] = IndoorTiles.ChairSouth;
	world[x][y] = loc[x][y];
	// Level.Solid[x][y] = true;
	OverTiles[x][y] = true;

	}
	
	public void render(int x, int y, Graphics g) {
		//woodfloor mask
		GameScreen.rendertile(0,0,x,y,g);
		GameScreen.rendertile(7,1,x,y,g);
	}
	public void overrender(int x, int y, Graphics g) {
		GameScreen.rendertile(7,0,x,y-1,g);
	}
}
