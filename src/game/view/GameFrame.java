package game.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{
	private GameController baseController;
	private GamePanel basePanel;
	
	public GUIFrame(GuiController baseController)
	{
		this.GameController = baseController;
		basePanel = new GamePanel(baseController);
		setupFrame();
	}
}
