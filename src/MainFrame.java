import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
	
	
	private final Dimension DEFAULT_MAIN_FRAMESIZE; 

	public MainFrame() {
		super(JGSystem.NAME);
		this.DEFAULT_MAIN_FRAMESIZE = new Dimension(1024, 768);
		
		JPanelMainFrameHeader jplnHeader = new JPanelMainFrameHeader();
		jplnHeader.setSize(this.getWidth(), 100);
		this.add(jplnHeader, BorderLayout.NORTH);
		
		
		
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WLMainFrame());
		this.setSize(this.DEFAULT_MAIN_FRAMESIZE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private class WLMainFrame implements WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			Object[] object = {"Yes", "9 9 9"};
			int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to exit the JGame Collection?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, object, object[1]);
			if(answer == 0)
			{
				JGSystem.exit();
			}	
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
