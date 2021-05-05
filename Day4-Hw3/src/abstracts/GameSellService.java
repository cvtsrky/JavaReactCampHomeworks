package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface GameSellService {
		void SellWithoutCampaign(Gamer gamer, Game[] games);
		void SellWithCampaign(Gamer gamer, Game[] games, Campaign campaign);
}
