/**
 * 
 */
package game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

/**
 * 负责绘制游戏场景绘制和游戏逻辑实现
 * @author mizudp
 * @date 2022年11月27日
 * @version TODO
 * 
 */
public class GameScreen extends Screen {
	
	private World world;
	private OrthographicCamera box2dCamera;
	private Box2DDebugRenderer renderer;
	

	@Override
	public void dispose() {
		renderer.dispose();
		world.dispose();
	}

	@Override
	public void create() {
		world = new World(new Vector2(0, -9.8f), true);
		box2dCamera = new OrthographicCamera();
		box2dCamera.setToOrtho(false, Gdx.graphics.getWidth()/100, Gdx.graphics.getHeight()/1000);
		renderer = new Box2DDebugRenderer();
	}

	@Override
	public void update() {
		world.step(1/60.0f, 6, 4);
		box2dCamera.update();
	}

	@Override
	public void render(float deltaTime) {
		renderer.render(world, box2dCamera.combined);
	}

	@Override
	public byte getId() {
		return ScreenManager.GAME_SCREEN;
	}

}
