package �ϰ������ͼ;
import ����.Point;


/**
 * �ϰ����࣬���е����ݳ�Ա�г��Ϳ�
 * @author ���ӻ�
 *
 */
public class Barrier {
	/**
	 * �ϰ����ڵ�ͼ�ϵ�λ��
	 * "*":ĳЩӢ�ۿ��Դ������ϰ���
	 * "#":���Բ��ܴ������ϰ���
	 */
	char type;
	Point position;
	int length=0;
	int width=0;
	
	/**
	 * ���췽��������һ���ϰ���
	 * @param type �ϰ�������
	 * @param position �ϰ����ڵ�ͼ�ϵ�λ��
	 * @param length �ϰ���ĳ���
	 * @param width �ϰ���Ŀ��
	 */
	public Barrier(char type,Point position,int length,int width) {
		this.type = type;
		this.position = position;
		this.length = length;
		this.width = width;
	}
}
