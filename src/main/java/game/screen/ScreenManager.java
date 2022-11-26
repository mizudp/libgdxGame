package game.screen;

import java.util.Stack;

import com.badlogic.gdx.Gdx;

/**
 * 场景的管理类<br>
 * The manager of screens
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 0.1
 */
public final class ScreenManager {

	/** 场景的id */
	public static final byte DEFAULT_SCREEN = 0;

	/**实例*/
	public static final ScreenManager instance;

	static {
		instance = new ScreenManager();
	}

	private Stack<Screen> screens;
	private Screen peekScreen;

	private ScreenManager() {
		screens = new Stack<Screen>();
		peekScreen = screens.push(getScreenById(DEFAULT_SCREEN));
	}

	public ScreenManager instance() {
		return instance;
	}
	
	/**
	 * 更新顶部场景的逻辑
	 */
	public void update() {
		peekScreen.update();
	}

	/**
	 * 渲染顶部场景 <br>
	 */
	public void render() {
		peekScreen.render(Gdx.graphics.getDeltaTime());
	}

	/**
	 * 根据id获得场景实例<br>
	 * According to specific id to get appointing screen instance
	 * 
	 * @param id
	 * @return 指定场景(Specific screen)
	 */
	public Screen getScreenById(byte id) {
		switch (id) {
		case DEFAULT_SCREEN:
			return new DefaultScreen();
		}
		return null;
	}
}
