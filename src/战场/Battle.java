package ս��;

import Ӣ��.*;
import �ϰ������ͼ.*;

import java.awt.AWTException;
import java.util.LinkedList;
import java.util.Scanner;

import ����.Function;
import ����.Point;

public class Battle {
	/*--------------------��ͼ-------------------*/
	Map M;
	
	/*------------ս��A��������һ����ɫ����------------*/
	LinkedList<Role> LA;
	
	/*------------ս��A��������һ����ɫ����------------*/
	LinkedList<Role> LB;
	
	/**
	 * ����һ��ս��
	 */
	public Battle() {
		int i;
		Barrier barrier[] = new Barrier[5];

		barrier[0] = new Barrier('#',new Point(15,35),4,3);
		barrier[1] = new Barrier('*',new Point(20,15),12,8);
		barrier[2] = new Barrier('#',new Point(5,20),6,8);
		barrier[3] = new Barrier('*',new Point(19,80),5,3);
		barrier[4] = new Barrier('#',new Point(23,87),9,6);
		
		M = new Map(120,25,barrier);
		LA = new LinkedList<Role>();
		LB = new LinkedList<Role>();
	}
	
	/**
	 * չʾս����ͼ
	 */
	void displayMap() {
		M.displayMap();
	}
	
	
	
	
	
	
	
	public static void main(String [] args) throws AWTException {
		Battle B = new Battle();
		
		Role R = new Role(10,1,5,'A',new Point(3,4));
		R.enterMap(B.M);
		
		B.displayMap();
		
		while(true) {
			R.goForward(B.M, new Scanner(System.in).next());
			Function.clearConsole();
			B.displayMap();
		}
	}

}

