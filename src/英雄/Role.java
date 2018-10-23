package Ӣ��;
import ����.Function;
import ����.Point;
import �ϰ������ͼ.Barrier;
import �ϰ������ͼ.Map;

import java.awt.AWTException;
import java.util.Scanner;

public class Role {
	
	//��������
	/**
	 * ����ֵ����ʼֵΪ100
	 */
	private int Mp;
	/**
	 * ħ��ֵ����ʼֵΪ30
	 */
	private int Hp;
	/**
	 * ����ֵ����ʼֵΪ0
	 */
	private int Exp;
	/**
	 * ��ɫ���� �������ɫʱ����ָ��
	 */
    public char roleName;
    /**
     * ��ɫλ�ã������ɫʱҲ����ָ������ָ����λ�ã���Ӣ��δ�����ͼ
     */
    public Point rolePosition;
    
    /**
     * Ӣ���Ƿ��Ѿ������˵�ͼ��һ��ʼӢ���ڵ�ͼ��
     */
    public boolean insideMap = false;

    //��������
    /**
     * �����ɫ
     * @param Mp ����ֵ
     * @param Hp ħ��ֵ
     * @param Exp ����ֵ 
     * @param roleName Ӣ������
     * @param rolePosition ��ɫλ�� 
     */
    public Role(int Mp,int Hp,int Exp,char roleName,Point rolePosition) {
    	this.Mp = Mp;
    	this.Hp = Hp;
    	this.Exp = Exp;
    	this.roleName = roleName;
    	this.rolePosition = rolePosition;
    }
    
    /**
     * �����ɫ��һЩ����ȡĬ��ֵ
     * @param roleName ��ɫ��
     * @param rolePosition ��ɫλ��
     */
    public Role(char roleName,Point rolePosition) {
    	this.Mp = 100;
    	this.Hp = 30;
    	this.Exp = 0;
    	this.roleName = roleName;
    	this.rolePosition = rolePosition;
    }
    
    /**
     * ��ɫ�����ͼ
     * @param map ָ����ͼ
     */
    public void enterMap(Map map) {
    	if(map.getChar(this.rolePosition) == ' ') { //���Խ���
    		map.replace(this.rolePosition, this.roleName);
    		this.insideMap = true;
    	}
    		
    }
    
    /**
     * ����ǰ��
     * @param map Ӣ�����ڵĵ�ͼ
     * @param order Ӣ��ǰ���ķ���
     * @return ǰ���Ƿ�ɹ�
     */
    public boolean goForward(Map map,String order) {
    	if(this.insideMap) {	//��ɫ�Ѿ������ͼ���ƶ��������� 
      		if(order.equals("��")) {
    			if(map.getChar(this.rolePosition.setX(this.rolePosition.getX()-1)) == ' ') { //�������������
        			map.replace(this.rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setX(this.rolePosition.getX()-1);
        			map.replace(this.rolePosition, this.roleName);
        			
        			return true;
        		}
    		}
        				
        	else if(order.equals("��")) {
        		if(map.getChar(this.rolePosition.setX(this.rolePosition.getX()+1)) == ' ') { //�������������
        			map.replace(rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setX(this.rolePosition.getX()+1);
        			map.replace(rolePosition, this.roleName);
        			
        			return true;
        		}
        	}
        			
        	else if(order.equals("��")) {
        		if(map.getChar(this.rolePosition.setY(this.rolePosition.getY()-1)) == ' ') { //�������������
        			map.replace(rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setY(this.rolePosition.getY()-1);
        			map.replace(rolePosition, this.roleName);
        			
        			return true;
        		}
        	}
        				
        	else if(order.equals("��")) {
        		if(map.getChar(this.rolePosition.setY(this.rolePosition.getY()+1)) == ' ') { //�������������
        			map.replace(rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setY(this.rolePosition.getY()+1);
        			map.replace(rolePosition, this.roleName);
        			
        			return true;
        		}
        	}	
    	}
    	
    	return false;			
    }
   
    /**
     * 
     * @param rival ����
     */
    public void simpleAttack(Role rival) {
    	
    	
    }
    
    public void complexAttack(Role rival) {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
