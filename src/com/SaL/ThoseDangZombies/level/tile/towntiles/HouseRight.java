package com.SaL.ThoseDangZombies.level.tile.towntiles;

import java.awt.Graphics;

import com.SaL.ThoseDangZombies.screen.GameScreen;

public class HouseRight extends TownTiles {
	
	public void Register(int x, int y) {
		world[x][y] = TownTiles.HouseRight;
	}

	public void render(int x, int y, Graphics g) {
		GameScreen.rendertile(6,4,x,y,g);
	}

}
