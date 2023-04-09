package ru.yandex.alienfly.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {

    private static class BackgroundPictures {
        private final Texture texture;
        private final Vector2 position;

        public BackgroundPictures(Vector2 position) {
            texture = new Texture("back.jpg");
            this.position = position;
        }
    }

    private final BackgroundPictures[] backArray;
    private final int speed;

    public Background() {
        speed = 4;
        backArray = new BackgroundPictures[2];
        backArray[0] = new BackgroundPictures(new Vector2(0, 0));
        backArray[1] = new BackgroundPictures(new Vector2(800, 0));
    }

    public void render(SpriteBatch batch) {
        for (int i = 0; i < backArray.length; i++) {
            batch.draw(backArray[i].texture,
                    backArray[i].position.x,
                    backArray[i].position.y);
        }
    }

    public void update() {
        for (int i = 0; i < backArray.length; i++) {
            backArray[i].position.x -= speed;
        }
     if (backArray[0].position.x < -800) {
         backArray[0].position.x = 0;
         backArray[1].position.x = 800;
     }
    }
}
