/**
 * 
 */
package game.screen;

import game.graphics.GrBundle;

/**
 * 默认场景用于显示异常或不正常状态<br>
 * Default screen is used for error or other unknown state
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 1
 * 
 */
public class DefaultScreen extends Screen {
	
	@Override
	public void create() {
		System.out.println("DefaultScreen.create()");
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void render(float deltaTime) {
		GrBundle.font.draw(GrBundle.batch, "HelloWorld", 100, 100);
	}

	@Override
	public byte getId() {
		return ScreenManager.DEFAULT_SCREEN;
	}

	@Override
	public void dispose() {
		
	}

}
