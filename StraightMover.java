public class StraightMover extends RobotPlayer implements ITheMove {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x, y, width, height;
	private int moveCounter=0;
	private int direction = (int)(Math.random()*4);

	public StraightMover(){
		super();
		this.x = (int)(Math.random()*550);
		this.y = (int)(Math.random()*550);
		this.width = 30;
		this.height = 30;
		this.virginity = true;
		setBounds(x,y,width,height);
		setBorderPainted(false);
	}

	public void moveIt(){

		if(moveCounter<=5){

		for(int i =0; i<10; i++){
			if(direction == 0){		//right
					this.x++;
					if(this.x>=560){
						this.x--;
					}
			}
			if(direction==1){		//left
				this.x--;
				if(this.x<=5){
					this.x++;
				}
			}
			if(direction == 2){		//up
				this.y--;
				if(this.y<=5){
					this.y++;
				}
			}
			if(direction == 3){		//down
				this.y++;
				if(this.y>=540){
					this.y--;
				}
			}
		}
			moveCounter++;
			this.setBounds(x,y,width,height);
		}
		else if(moveCounter>5){
			direction = (int)(Math.random()*4);
			moveCounter =0;
		}
	}
}