package 其他;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * 函数类,包含一些待用函数
 * @author 蔡子辉
 *
 */
public class Function {
	/**
	 *
	 * @param n 字符串长度
	 * @param ch 指定的字符
	 * @return StringBuffer n个相同的ch字符
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
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);		//按下鼠标右键
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);	//释放鼠标右键
		r.keyPress(KeyEvent.VK_CONTROL);				//按下Ctrl键
		r.keyPress(KeyEvent.VK_R);						//按下R键
		r.keyRelease(KeyEvent.VK_R);					//释放R键
		r.keyRelease(KeyEvent.VK_CONTROL);				//释放Ctrl键
		r.delay(100);
	}
}
