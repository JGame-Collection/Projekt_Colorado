import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class JPanelMainFrameHeader extends JPanel{
	
	private BufferedImage biHeader;
	
	public JPanelMainFrameHeader() {
		super();
		try {
			biHeader = ImageIO.read(new File("../mainFrameHeader.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
   @Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(biHeader, 0, 0, null);        
	}

}
