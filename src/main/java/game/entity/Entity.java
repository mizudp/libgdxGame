package game.entity;

import java.util.Objects;

import com.badlogic.gdx.physics.box2d.Body;

/**
 * 实体基类
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 0.1
 */
public abstract class Entity {

	/**body为了改变一些属性封装的*/
	protected Body body;
	/**当前生命值*/
	protected int health;
	/**最大生命值*/
	protected int maxHealth;
	/**实体的唯一id*/
	public int id;
	/**实体类型*/
	public Type type;
	
	public enum Type{
		PLAYER
	}

	protected Entity(Body body, int id, int maxHealth) {
		this.body = body;
		this.id = id;
		this.maxHealth = maxHealth;
	}

	/**
	 * @return The body
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		return id == other.id;
	}
}
