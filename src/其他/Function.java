package ����;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * ������,����һЩ���ú���
 * @author ���ӻ�
 *
 */
public class Function {
	/**
	 *
	 * @param n �ַ�������
	 * @param ch ָ�����ַ�
	 * @return StringBuffer n����ͬ��ch�ַ�
	 */
	public static StringBuffer getNChar(int n,char ch) {
		int i;
		StringBuffer result = new StringBuffer();
		
		for(i=0 ; i<n ; i++)
			result.append(ch);
		
		return result;
	}
	
	public static void clearConsole() throws AWTException {
		Robot r = new Robot();
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);		//��������Ҽ�
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);	//�ͷ�����Ҽ�
		r.keyPress(KeyEvent.VK_CONTROL);				//����Ctrl��
		r.keyPress(KeyEvent.VK_R);						//����R��
		r.keyRelease(KeyEvent.VK_R);					//�ͷ�R��
		r.keyRelease(KeyEvent.VK_CONTROL);				//�ͷ�Ctrl��
		r.delay(100);
	}
}
