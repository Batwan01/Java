/* Ref_4.txt ==> 192 page, STEP_16_Thread_3.java */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 class FrameThread {

	JFrame  frame;
	JPanel  panel, panel_other; 
	JLabel  lbl_ball;

	FrameThread(boolean flag, JLabel lbl_ball, int x, int y) {

		frame = new JFrame();

		panel = new JPanel(); 
		panel.setBackground(Color.white);
		panel.setPreferredSize(new Dimension(400, 400));
		panel.setLayout(null);

		this.lbl_ball = lbl_ball;

		JButton btn_snd = new JButton("Send"); 
			btn_snd.setBounds(165, 300, 70, 30);
			btn_snd.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sendBall();
				} } );
		panel.add(btn_snd);

		JButton btn_end = new JButton("End"); 
			btn_end.setBounds(165, 360, 70, 30);
			btn_end.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				} } );
		panel.add(btn_end);

		if (flag) panel.add(lbl_ball);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void  sendBall() {
 	   	panel.remove(lbl_ball);     panel.repaint();
		panel_other.add(lbl_ball);  panel_other.repaint();
	}

	void 	setOtherPanel(JPanel panel) {  panel_other = panel; }

	JPanel	getPanel()                  {  return (panel); 	    }
 }

public class STEP_16_Thread_3 {
	public static void main(String args[]) throws InterruptedException {
		ImageIcon img = new ImageIcon("Ball.jpg");
		JLabel lbl_ball = new JLabel(img);
		lbl_ball.setBounds(175, 175, 50, 50);

		FrameThread frameTh_1 = new FrameThread(true, lbl_ball, 0, 0);
		FrameThread frameTh_2 = new FrameThread(false, lbl_ball, 0, 450);
		FrameThread frameTh_3 = new FrameThread(false, lbl_ball, 0, 900);


		frameTh_1.setOtherPanel(frameTh_2.getPanel());
		frameTh_1.setOtherPanel(frameTh_3.getPanel());

		frameTh_2.setOtherPanel(frameTh_1.getPanel());
		frameTh_2.setOtherPanel(frameTh_3.getPanel());

		frameTh_3.setOtherPanel(frameTh_2.getPanel());
		frameTh_3.setOtherPanel(frameTh_1.getPanel());
	
		System.out.println("Console thread is going out !!!");
	}
}