package ru.yandex.alienfly;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import ru.yandex.alienfly.entity.Alien;
import ru.yandex.alienfly.entity.Background;

public class StartGame extends ApplicationAdapter {
	SpriteBatch batch;
	Background background;
	Alien alien;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Background();
		alien = new Alien();
	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		background.render(batch);
		alien.render(batch);
		batch.end();
	}

	public void update() {
		background.update();
		alien.update();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
