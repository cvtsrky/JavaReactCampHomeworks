package abstracts;

import entities.Game;

public interface GameService {
		void Add(Game game);
		void AddMultiple(Game[] games);
		void Update(Game game);
		void Delete(Game game);
}
