package consoleMain;

import java.util.GregorianCalendar;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GameSellManager;
import concrete.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirtsName("Ad");
		gamer1.setLastName("Soyad");
		gamer1.setNationalId("12345678910");
		gamer1.setEmailAddress("abc@gmail.com");
		gamer1.setDateOfBirth(new GregorianCalendar(1996,07,04).getTime());
		GamerManager  gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.Add(gamer1);
		System.out.println("-----------------------------");
		Game game1 = new Game(1, "H1Z1",150);
		Game game2 = new Game(2, "GTA5",300);
		Game game3 = new Game(3, "Euro Truck Simulator 2",20);
		Game game4 = new Game(4, "Call Of Duty 2",75);
		Game[] games = new Game[] {game1,game2,game3,game4};
		GameManager gameManager = new GameManager();
		gameManager.AddMultiple(games);
		System.out.println("-----------------------------");
		Campaign campaign1 = new Campaign(1, "Black Friday", 10);
		Campaign campaign2 = new Campaign(1, "Anneler Gunu", 30);
		Campaign campaign3 = new Campaign(1, "Sevgililer Gunu", 25);
		Campaign[] campaigns = new Campaign[] {campaign1,campaign2,campaign1};
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.AddMultiple(campaigns);
		System.out.println("-----------------------------");
		GameSellManager gameSellManager = new GameSellManager();
		gameSellManager.SellWithoutCampaign(gamer1, games);
		gameSellManager.SellWithCampaign(gamer1, games, campaign1);
		System.out.println("-----------------------------");
		gameSellManager.SellWithCampaign(gamer1, games, campaign2);
		System.out.println("-----------------------------");
		gameSellManager.SellWithCampaign(gamer1, games, campaign3);
	}

}
