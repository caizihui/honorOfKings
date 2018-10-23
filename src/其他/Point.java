package 其他;

/**
* 点类，包括横纵坐标，为了保证安全，增加了许多方法
* @author ASUS
*
*/

public class Point {
	private int x = 0;
	private int y = 0;
	
	/**
	 * 给定一组横纵坐标，构造一个点
	 * @param x 横坐标
	 * @param y 纵坐标
	 */
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	public Point setXY(int x,int y) {
		return new Point(x,y);
	}
	
	public Point setX(int x) {
		return new Point(x,this.y);
	}
	
	public Point setY(int y) {
		return new Point(this.x,y);
	}
	
	public String toString() {
		return "[x:"+this.x+" , y:"+this.y+"]";
	}
}




