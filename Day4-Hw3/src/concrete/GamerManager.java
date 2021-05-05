package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void Add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer))
		{
			System.out.println(gamer.getFirtsName() + " adli kullanici eklendi.");
		}
		else
		{
			System.out.println("Ge�ersiz ki�i giri�i yaptiniz");
		}
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + " adli kullanici bilgileri g�ncellendi.");
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + " adli kullanici silindi.");
		
	}

}
