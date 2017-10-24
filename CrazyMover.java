public class CrazyMover extends RobotPlayer implements ITheMove {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1182950438470738714L;
	private int x, y, width, height;

	public CrazyMover(){
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
		int direction = (int)(Math.random()*4);

		for(int i=0; i<10; i++){
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
				if(this.y>=560){
					this.y--;
				}
			}
		}
		this.setBounds(x,y,width,height);
	}
}