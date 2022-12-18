package desktop;

import game.MyGdxGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * 桌面启动程序
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 1
 */
public class Desktop {

	/**
	 * 这个只是拿来玩的
	 */
	private static String[] text = { "never gonna give you up", "never gonna let you down", "never gonna run around",
			"114514" };
	private static int MAX = text.length - 1, MIN = 0;

	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Game —— " + text[(int) (Math.random() * (MAX - MIN + 1) + MIN)];
		cfg.width = 1280;
		cfg.height = 720;
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
