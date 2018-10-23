package 英雄;
import 其他.Function;
import 其他.Point;
import 障碍物与地图.Barrier;
import 障碍物与地图.Map;

import java.awt.AWTException;
import java.util.Scanner;

public class Role {
	
	//数据区：
	/**
	 * 生命值，初始值为100
	 */
	private int Mp;
	/**
	 * 魔法值，初始值为30
	 */
	private int Hp;
	/**
	 * 经验值，初始值为0
	 */
	private int Exp;
	/**
	 * 角色名字 ，构造角色时必须指定
	 */
    public char roleName;
    /**
     * 角色位置，构造角色时也必须指定。虽指定了位置，但英雄未进入地图
     */
    public Point rolePosition;
    
    /**
     * 英雄是否已经进入了地图，一开始英雄在地图外
     */
    public boolean insideMap = false;

    //方法区：
    /**
     * 构造角色
     * @param Mp 生命值
     * @param Hp 魔法值
     * @param Exp 经验值 
     * @param roleName 英雄名称
     * @param rolePosition 角色位置 
     */
    public Role(int Mp,int Hp,int Exp,char roleName,Point rolePosition) {
    	this.Mp = Mp;
    	this.Hp = Hp;
    	this.Exp = Exp;
    	this.roleName = roleName;
    	this.rolePosition = rolePosition;
    }
    
    /**
     * 构造角色，一些属性取默认值
     * @param roleName 角色名
     * @param rolePosition 角色位置
     */
    public Role(char roleName,Point rolePosition) {
    	this.Mp = 100;
    	this.Hp = 30;
    	this.Exp = 0;
    	this.roleName = roleName;
    	this.rolePosition = rolePosition;
    }
    
    /**
     * 角色进入地图
     * @param map 指定地图
     */
    public void enterMap(Map map) {
    	if(map.getChar(this.rolePosition) == ' ') { //可以进入
    		map.replace(this.rolePosition, this.roleName);
    		this.insideMap = true;
    	}
    		
    }
    
    /**
     * 人物前进
     * @param map 英雄所在的地图
     * @param order 英雄前进的方向
     * @return 前进是否成功
     */
    public boolean goForward(Map map,String order) {
    	if(this.insideMap) {	//角色已经进入地图，移动才有意义 
      		if(order.equals("上")) {
    			if(map.getChar(this.rolePosition.setX(this.rolePosition.getX()-1)) == ' ') { //如果可以往上走
        			map.replace(this.rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setX(this.rolePosition.getX()-1);
        			map.replace(this.rolePosition, this.roleName);
        			
        			return true;
        		}
    		}
        				
        	else if(order.equals("下")) {
        		if(map.getChar(this.rolePosition.setX(this.rolePosition.getX()+1)) == ' ') { //如果可以往下走
        			map.replace(rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setX(this.rolePosition.getX()+1);
        			map.replace(rolePosition, this.roleName);
        			
        			return true;
        		}
        	}
        			
        	else if(order.equals("左")) {
        		if(map.getChar(this.rolePosition.setY(this.rolePosition.getY()-1)) == ' ') { //如果可以往左走
        			map.replace(rolePosition, ' ');
        			this.rolePosition = this.rolePosition.setY(this.rolePosition.getY()-1);
        			map.replace(rolePosition, this.roleName);
        			
        			return true;
        		}
        	}
        				
        	else if(order.equals("右")) {
        		if(map.getChar(this.rolePosition.setY(this.rolePosition.getY()+1)) == ' ') { //如果可以往右走
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
     * @param rival 对手
     */
    public void simpleAttack(Role rival) {
    	
    	
    }
    
    public void complexAttack(Role rival) {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
