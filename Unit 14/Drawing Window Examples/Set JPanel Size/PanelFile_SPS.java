import java.awt.*;
import javax.swing.*;

public class PanelFile_SPS extends JPanel
{
	public PanelFile_SPS(int panelWidth, int panelHeight)
	{
		//create the panel
		super();
		
		//sets the size of the panel
		setSize(panelWidth, panelHeight);
	}

	public void paint(Graphics g)
	{
		// draws a black background and a red X
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.RED);
		g.drawLine(0,0,getWidth(),getHeight());
		g.drawLine(getWidth(),0,0,getHeight());
	}
}