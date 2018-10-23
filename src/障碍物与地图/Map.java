package �ϰ������ͼ;
import ����.*;


public class Map {
	StringBuffer mapLine[];
	
	
	/**
	 * ָ����ͼ�Ĵ�С������һ����ͼ�����е�ͼ���ܶ���ǽ��ǽҲ�������ꡣ
	 * @param length ��ͼ����
	 * @param width ��ͼ���
	 * @param barrier ��ͼ�����е��ϰ������
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
	 * Ϊ��ͼ�����ϰ���
	 * @param barrier �ϰ������
	 */
	public void addBarrier(Barrier barrier) {
		int i;
		
		if(mapLine[0].length() > barrier.position.getY())	//�ں����򻹿�������
			for(i=0 ; i<barrier.width && barrier.position.getX()+i<mapLine.length-1 ; i++) {
					mapLine[barrier.position.getX()+i].replace(barrier.position.getY() ,Math.min(barrier.position.getY()+barrier.length, mapLine[0].length()-1), new String(Function.getNChar(Math.min(barrier.length, mapLine[0].length()-1-barrier.position.getY()) , barrier.type)));	
			}
	}
	

	
	
	/**
	 * �����ͼ
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
	 * �ж�һ�����Ƿ��ڵ�ͼ��
	 * @param position ָ����
	 * @return boolean
	 */
	public boolean insideMap(Point position) {
		if(position.getX() >= 0 && position.getX() < mapLine.length 
		&& position.getY() >= 0 && position.getY() < mapLine[0].length()) 
			return true;
		
		return false;
	}
	
	/**
	 * ��ȡ��ͼ�ϵ�ĳһ��λ�õ��ַ�
	 * @param position ָ����λ��
	 * @return char ��õ��ַ�
	 */
	public char getChar(Point position) {
		if(insideMap(position)) 
			return mapLine[position.getX()].charAt(position.getY());
		
		return '��';
	}
	
	/**
	 * ���ĵ�ͼ��Ϣ
	 * @param position ���ĵ�λ��
	 * @param aim ���ĵ�Ŀ��
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
