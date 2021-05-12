package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SaleService {

	void sale(Game game, Player player);
	void campaignSale(Game game, Player player, Campaign campaign);
}
