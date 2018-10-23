package 障碍物与地图;
import 其他.Point;


/**
 * 障碍物类，具有得数据成员有长和宽
 * @author 蔡子辉
 *
 */
public class Barrier {
	/**
	 * 障碍物在地图上的位置
	 * "*":某些英雄可以穿过的障碍物
	 * "#":绝对不能穿过的障碍物
	 */
	char type;
	Point position;
	int length=0;
	int width=0;
	
	/**
	 * 构造方法，构造一个障碍物
	 * @param type 障碍物类型
	 * @param position 障碍物在地图上的位置
	 * @param length 障碍物的长度
	 * @param width 障碍物的宽度
	 */
	public Barrier(char type,Point position,int length,int width) {
		this.type = type;
		this.position = position;
		this.length = length;
		this.width = width;
	}
}
