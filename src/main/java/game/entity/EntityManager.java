/**
 * 
 */
package game.entity;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.utils.ObjectMap;

/**
 * 实体管理类
 * 
 * @author mizudp
 * @date 2022年11月26日
 * @version 0.1
 * 
 */
public class EntityManager {
	private static final EntityManager instance;
	
	ObjectMap<Integer, Entity> entityMap;
	public BodyDef def;
	public FixtureDef fDef;

	static {
		instance = new EntityManager();
	}

	private EntityManager() {
		def = new BodyDef();
		fDef= new FixtureDef();
	}

	/**
	 * 获取当前类的实例
	 */
	public static EntityManager getInstance() {
		return instance;
	}
	
	public void update() {
		
	}
	
	//TODO
	public Entity creatEntity(int maxHealth) {
		return null;
	}
}
