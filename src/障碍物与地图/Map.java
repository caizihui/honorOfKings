package 障碍物与地图;
import 其他.*;


public class Map {
	StringBuffer mapLine[];
	
	
	/**
	 * 指定地图的大小，构造一个地图，其中地图四周都是墙，墙也算入坐标。
	 * @param length 地图长度
	 * @param width 地图宽度
	 * @param barrier 地图上所有的障碍物情况
	 */
	public Map(int length,int width,Barrier barrier[]) {
		int i;
		mapLine = new StringBuffer[width];
		
		mapLine[0] = Function.getNChar(length, '#');
		for(i=1 ; i<mapLine.length-1 ; i++) {
			mapLine[i] = Function.getNChar(length, ' ');
			mapLine[i].setCharAt(0, '#');
			mapLine[i].setCharAt(length-1, '#');
		}
		mapLine[mapLine.length-1] = Function.getNChar(length, '#');
		
		for(i=0 ; i<barrier.length ; i++) {
			this.addBarrier(barrier[i]);
		}
		
		
	}
	
	/**
	 * 为地图增加障碍物
	 * @param barrier 障碍物对象
	 */
	public void addBarrier(Barrier barrier) {
		int i;
		
		if(mapLine[0].length() > barrier.position.getY())	//在横向方向还可以增加
			for(i=0 ; i<barrier.width && barrier.position.getX()+i<mapLine.length-1 ; i++) {
					mapLine[barrier.position.getX()+i].replace(barrier.position.getY() ,Math.min(barrier.position.getY()+barrier.length, mapLine[0].length()-1), new String(Function.getNChar(Math.min(barrier.length, mapLine[0].length()-1-barrier.position.getY()) , barrier.type)));	
			}
	}
	

	
	
	/**
	 * 输出地图
	 */
	public void displayMap() {
		int i;
		
		System.out.print(" ");
		for(i=0 ; i<mapLine[0].length() ; i++) {
			System.out.print(i%10);
		}
		System.out.println();
			
		for(i=0 ; i<mapLine.length ; i++) {
			System.out.print(i%10);
			System.out.println(mapLine[i]);
		}	
	}

	/**
	 * 判断一个点是否在地图内
	 * @param position 指定点
	 * @return boolean
	 */
	public boolean insideMap(Point position) {
		if(position.getX() >= 0 && position.getX() < mapLine.length 
		&& position.getY() >= 0 && position.getY() < mapLine[0].length()) 
			return true;
		
		return false;
	}
	
	/**
	 * 获取地图上的某一个位置的字符
	 * @param position 指定的位置
	 * @return char 获得的字符
	 */
	public char getChar(Point position) {
		if(insideMap(position)) 
			return mapLine[position.getX()].charAt(position.getY());
		
		return '无';
	}
	
	/**
	 * 更改地图信息
	 * @param position 更改的位置
	 * @param aim 更改的目标
	 * @return boolean
	 */
	public boolean replace(Point position,char aim) {
		if(insideMap(position))
			if(getChar(position)!='*' && getChar(position)!='#') {
				mapLine[position.getX()].setCharAt(position.getY(), aim);
				
				return true;
			}
		
		return false;
	}
	
}
