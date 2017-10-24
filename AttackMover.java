import java.awt.Color;
import java.awt.Rectangle;

public class AttackMover extends RobotPlayer implements ITheMove {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5815594963281537972L;
	private int x, y, width, height;

	private RobotPlayer[] r = new RobotPlayer[4];

	public AttackMover(RobotPlayer r0,RobotPlayer r1, RobotPlayer r2, RobotPlayer r3){
		super();
		this.x = (int)(Math.random()*550);
		this.y = (int)(Math.random()*550);
		this.width = 30;
		this.height = 30;
		setBounds(x,y,width,height);
		setBorderPainted(false);
		
		this.r[0] = r0;
		this.r[1] = r1;
		this.r[2] = r2;
		this.r[3] = r3;
	}

	public void moveIt(){
		
		int closest = getClosest();
		int destinationX = r[closest].getX();
		int destinationY = r[closest].getY();
		
		for(int i=0; i<10; i++){
			if(this.x > destinationX) {
				this.x--;
			}
			if(this.x < destinationX) {
				this.x++;
			}
			if(this.y > destinationY) {
				this.y--;
			}
			if(this.y < destinationY) {
				this.y++;
			}
		}
		detectCollision();
		this.setBounds(x,y,width,height);

	}
	public int getClosest(){ 	//determined by the least value provided by the distance formula
		
		int index =0;
		int a = 0;			
	    int minValue =(int) (Math.sqrt(Math.pow((r[0].getX()-this.x),2)+Math.pow((r[0].getY()-this.y),2))); 
	    for(int i=1;i<4;i++){ 
	    	a = (int) (Math.sqrt(Math.pow((r[i].getX()-this.x),2)+Math.pow((r[i].getY()-this.y),2)));
	      if(minValue > a){ 
	    	  if(r[i].getVirginity() == true) {
	    		minValue = a; 
	  	        index = i;
	    	  }
	      } 
	    } 
	    return index; 
	 } 
	
	public void detectCollision() {
		
		 Rectangle attacker = new Rectangle(this.x,this.y,this.width,this.height);
		 Rectangle[] robotBody = new Rectangle[4];
		 
		 for(int i=0; i<4; i++) {
			 robotBody[i] = new Rectangle(r[i].getX(),r[i].getY(),r[i].getWidth(),r[i].getHeight());
			 if (robotBody[i].intersects(attacker)) {
				 r[i].setBackground(Color.black);
				 r[i].setVirginity(false);
			 }
		 }
	}
}