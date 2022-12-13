package game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import game.graphics.GrBundle;
import game.screen.ScreenManager;

/**
 * 游戏入口<br>
 * The entrance of this game
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 0.1
 *
 */
public class MyGdxGame implements ApplicationListener {

	@Override
	public void create() {
		
		GrBundle.batch = new SpriteBatch();
		GrBundle.font = new BitmapFont();
		GrBundle.font.setColor(Color.WHITE);
		GrBundle.camera = new OrthographicCamera();
		GrBundle.camera.setToOrtho(false, Gdx.graphics.getWidth() >> 1, Gdx.graphics.getHeight() >> 1);
	}

	@Override
	public void resize(int width, int height) {
		ScreenManager.instance.resize(width, height);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		
		GrBundle.camera.update();
		ScreenManager.instance.update();

		GrBundle.batch.setProjectionMatrix(GrBundle.camera.combined);
		GrBundle.batch.begin();
		ScreenManager.instance.render();
		GrBundle.batch.end();
	}

	@Override
	public void pause() {
		ScreenManager.instance.pause();
	}

	@Override
	public void resume() {
		ScreenManager.instance.resume();
	}

	@Override
	public void dispose() {
		ScreenManager.instance.dispose();
		GrBundle.batch.dispose();
		GrBundle.font.dispose();
	}

}
