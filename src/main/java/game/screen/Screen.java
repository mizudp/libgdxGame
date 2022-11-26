package game.screen;

import java.util.Objects;

import com.badlogic.gdx.utils.Disposable;

/**
 * 场景的基类 <br>
 * The base class of screen
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 0.1
 */
public abstract class Screen implements Disposable {

	protected Screen() {
		create();
	}

	/**
	 * 当类的构造方法被调用时调用<br>
	 * Call when its class construction was called
	 */
	abstract public void create();
	
	/**
	 * 更新逻辑时调用<br>
	 * Call when update logic
	 */
	abstract public void update();

	/**
	 * 渲染时会调用这个方法<br>
	 * Call when this screen is rendering
	 * 
	 * @param deltaTime 绘制两帧之间所用的时间(The time between two frame)
	 */
	abstract public void render(float deltaTime);

	/**
	 * 当该场景被其他的场景覆盖的时候调用<br>
	 * Call when its screen was covered by other screen
	 */
	public void hide() {

	}

	/**
	 * 当该场景重新被渲染的时候调用<br>
	 * Call when its screen was back to render
	 */
	public void show() {

	}

	/**
	 * 当窗口失去焦点时调用<br>
	 * Call when window lose focus
	 */
	public void pause() {

	}

	/**
	 * 当窗口获得焦点时调用<br>
	 * Call when window gain focus
	 */
	public void resume() {

	}

	/**
	 * 当窗口大小改变时调用<br>
	 * Call when window size changed
	 * 
	 * @param width  新的宽度(New width)
	 * @param height 新的高度(New height)
	 */
	public void resize(int width, int height) {

	}

	/**
	 * @return 场景唯一的id (The only id of this screen)
	 */
	abstract public byte getId();

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return this.getId() == other.getId();
	}
}
