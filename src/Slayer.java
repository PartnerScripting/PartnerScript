import org.powerbot.concurrent.strategy.Condition;
import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;


@Manifest(
		name = "",
		authors = "",
		description = "",
		version = 1.0,
		vip = false
		)

public class Slayer extends ActiveScript {
	
	public int slayerRing = 13281;
	public int enchantedGem = 4155;

	@Override
	protected void setup() {
		
	}

	public class checkTask extends Strategy implements Runnable, Condition {

		public boolean validate() {
			return false;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}
	
}


