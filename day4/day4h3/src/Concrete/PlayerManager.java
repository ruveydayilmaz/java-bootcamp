package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " : eklendi");
		}
		else {
			System.out.println("gecersiz kullanici");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " : silindi");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " : guncellendi");
		
	}

}
