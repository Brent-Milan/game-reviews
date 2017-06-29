package production;

import org.springframework.boot.CommandLineRunner;

public class GamePopulator implements CommandLineRunner {
	
	@Resource
	private GameRepository gameRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Game ffxiv= new Game("MMO");
		Game hots= new Game("MOBA");
		
		
		
	}
}
