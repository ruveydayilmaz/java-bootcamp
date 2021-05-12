package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Player player) {
		System.out.println("satilan oyun: " + game.getName() + "\nfiyat" + game.getUnitPrice() + "\n satin alan: " + player.getFirstName());
		
	}

	@Override
	public void campaignSale(Game game, Player player, Campaign campaign) {
		double discountPrice = game.getUnitPrice() - (game.getUnitPrice() * campaign.getDiscount())/100 ;
		
		System.out.println("satilan oyun : " + game.getName() + "\nindirimli fiyati : " + discountPrice + "\nsatin alan : " + player.getFirstName());
		
	}

	
}
