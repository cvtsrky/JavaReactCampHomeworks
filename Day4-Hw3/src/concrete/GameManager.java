package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println(game.getName() + " adli oyun eklendi.");
		
	}
	
	@Override
	public void AddMultiple(Game[] games) {
		for (Game game : games) {
			System.out.println(game.getName() + " adli oyun eklendi.");
		}
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getName() + " adlý oyun güncellendi.");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getName() + " adlý oyun silindi.");
		
	}

}
