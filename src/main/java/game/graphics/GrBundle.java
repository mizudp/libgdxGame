/**
 * 
 */
package game.graphics;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * 有关图画的捆绑包整合用<br>
 * This class is for graphics
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 1
 */
public final class GrBundle {
	/**
	 * 主要的绘图工具<br>
	 * The main drawing tool of this game<br>
	 * <br>
	 * 注：已经开始(begin)批量绘图<br>
	 * tips: Batch drawing has already started;<br>
	 * <br>
	 * <code>
	 * batch.begin();
	 * </code>
	 */
	public static SpriteBatch batch;

	/**
	 * 游戏主相机<br>
	 * The main camera of this game<br>
	 * 注：相机已经调用过<code>camera.update()</code>方法
	 */
	public static OrthographicCamera camera;

	/**
	 * 绘制游戏文字用<br>
	 * This variable is used for drawing game text
	 */
	public static BitmapFont font;
	
	private GrBundle() {}
}
