package ����;

/**
* ���࣬�����������꣬Ϊ�˱�֤��ȫ����������෽��
* @author ASUS
*
*/

public class Point {
	private int x = 0;
	private int y = 0;
	
	/**
	 * ����һ��������꣬����һ����
	 * @param x ������
	 * @param y ������
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




