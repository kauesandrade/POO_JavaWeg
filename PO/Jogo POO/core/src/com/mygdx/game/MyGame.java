package com.mygdx.game;

import org.ietf.jgss.GSSName;

import com.badlogic.gdx.Game;

public class MyGame extends Game {

	@Override
	public void create() {
		setScreen(new MainMenuScreen());
		
	}

}
