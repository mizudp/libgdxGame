/**
 * 
 */
package game.entity;

/**
 * 实体管理类
 * @author mizudp
 * @date 2022年11月26日
 * @version 0.1
 * 
 */
public class EntityManager {
	
	private static final EntityManager instance;
	
	static {
		instance=new EntityManager();
	}
	
	private EntityManager() {
		
	}

	/** 获取当前类的实例
	 * @return the instance
	 */
	public static EntityManager getInstance() {
		return instance;
	}
}
