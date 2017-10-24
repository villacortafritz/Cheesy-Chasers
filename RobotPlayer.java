import java.awt.Color;

import javax.swing.JButton;

public class RobotPlayer extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x,y, width, height, role;
	public boolean virginity;

	public RobotPlayer(){
		this.x = (int)(Math.random()*550);
		this.y = (int)(Math.random()*550);
		this.width = 30;
		this.height = 30;
		this.virginity = true;
		setBounds(x,y,width,height);
		setBorderPainted(false);
	}

	public void setRole(int role){
		this.role = role;
	}

	public int getRole(){
		return role;
	}
	
	public boolean getVirginity() {
		return virginity;
	}
	
	public void setVirginity(boolean b) {
		this.virginity = b;
	}

	public void drawMe(){
		if(role == 1){
			setBackground(Color.RED);		//crazyMover
		}
		else if(role ==2){
			setBackground(Color.YELLOW);		//StraightMover
		}
		else{
			setBackground(Color.BLUE);		//AttackMover
		}
	}

	public void move() {

	}


}