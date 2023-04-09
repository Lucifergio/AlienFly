package ru.yandex.alienfly.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Alien {
    private Texture texture;
    private Vector2 position;
    private float vy;
    private float gravity;

    public Alien() {
        texture = new Texture("alien.png");
        position = new Vector2(100, 380);
        vy = 0.0f;
        gravity = -0.7f; //Скорость падения
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            vy = 10; // Высота прыжка
        }
        vy += gravity;
        position.y += vy;
    }
}
