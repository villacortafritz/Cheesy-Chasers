import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public  class TheArena extends JFrame implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel cc = new JPanel();
	private RobotPlayer[] r;
	private boolean running  =  true;

	public TheArena(){

		r = new RobotPlayer[5];

		for(int i=0; i<5; i++){
			if(i <3){
				cc.add(r[i] = new StraightMover());
				r[i].setRole(1);
				System.out.println(r[i].getRole());
				r[i].drawMe();
			}
			else if(i == 3){
				cc.add(r[i] = new CrazyMover());
				r[i].setRole(2);
				r[i].drawMe();
			}
			else if(i == 4){
				cc.add(r[i] = new AttackMover(r[0], r[1], r[2], r[3]));
				r[i].setRole(3);
				r[i].drawMe();
			}
		}

		Thread t = new Thread(this);
		t.start();

		cc.setLayout(null);
		this.setPreferredSize(new Dimension(600,600));
		this.setMaximumSize(new Dimension(600,600));
		this.setMinimumSize(new Dimension(600,600));
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(cc,BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args){
		new TheArena();
	}

	public void run(){
		try{
			while(running){
				for(int i=0; i<5; i++){
					if(i <3){
						((StraightMover)(r[i])).moveIt();
					}
					else if(i == 3){
						((CrazyMover)(r[i])).moveIt();
					}
					else if(i == 4){
						((AttackMover)(r[i])).moveIt();
					}
				}
			Thread.sleep(100);
			}

		}
		catch(InterruptedException e){

		}
	}
}