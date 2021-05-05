package concrete;

import abstracts.GameSellService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameSellManager implements GameSellService{

	
	@Override
	public void SellWithoutCampaign(Gamer gamer, Game[] games) {
		System.out.println(gamer.getFirtsName() + " adli kullanici asagidaki oyun/oyunlari almistir : ");
		for (Game game : games) {
			System.out.println("Oyun adi : " + game.getName() + " - - " + " Oyun fiyati : " + game.getPrice());
		}
		
	}

	@Override
	public void SellWithCampaign(Gamer gamer, Game[] games, Campaign campaign) {
		
		System.out.println(gamer.getFirtsName() + " adli kullanici asagidaki oyun/oyunlari " 
						+campaign.getCampaignName() +" kampanyasi ile almistir : ");
		for (Game game : games) {
			
			System.out.println("Oyun adi : " + game.getName() + " - - " + 
						" Asil oyun fiyati : " + game.getPrice()+ " - - " + 
					" Kampanya sonrasi fiyat : " + Calculate(game,campaign));
		}
		
	}
	
	private double Calculate(Game game, Campaign campaign)
	{	double afterDiscountPrice=0.0;
		afterDiscountPrice = game.getPrice() - (game.getPrice()*campaign.getDiscount()/100);
		return afterDiscountPrice;
	}

}
