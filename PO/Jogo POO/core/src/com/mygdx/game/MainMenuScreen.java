package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class MainMenuScreen extends ScreenAdapter {
    private SpriteBatch batch;
    private Texture buttonTexture;
    private Rectangle buttonBounds;
    private Vector3 touchPoint;

    public MainMenuScreen() {
        batch = new SpriteBatch();
        buttonTexture = new Texture("meteoro.png");
        buttonBounds = new Rectangle(100, 100, buttonTexture.getWidth(), buttonTexture.getHeight());
        touchPoint = new Vector3();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isTouched()) {
            touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            if (buttonBounds.contains(touchPoint.x, Gdx.graphics.getHeight() - touchPoint.y)) {
                System.out.println("Botão pressionado!");
                
   
            }
        }

        batch.begin();
        batch.draw(buttonTexture, buttonBounds.x, buttonBounds.y);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        buttonTexture.dispose();
    }
}
