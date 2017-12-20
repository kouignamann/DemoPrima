import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoSlick extends BasicGame {
	public DemoSlick(String gamename)
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		g.clear();
		g.drawString("Howdy!", 10, 10);
	}

	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new DemoSlick("Simple Slick Game"));
			appgc.setDisplayMode(640, 480, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(DemoSlick.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
