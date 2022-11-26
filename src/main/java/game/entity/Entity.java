package game.entity;

import java.util.Objects;

import com.badlogic.gdx.physics.box2d.Body;

/**
 * 实体基类<br>
 * Entity's base class
 * 
 * @author mizudp
 * @date 2022年11月25日
 * @version 0.1
 */
public abstract class Entity {

	/**body为了改变一些属性封装的*/
	private Body body;
	/**实体的唯一id*/
	private int id;
	/**当前生命值*/
	private int health;
	/**最大生命值*/
	private int maxHealth;

	protected Entity(int id, Body body) {

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
