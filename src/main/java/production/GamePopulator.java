package production;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GamePopulator implements CommandLineRunner {
	
	@Resource
	private GameRepository gameRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Game ffxiv= new Game("Final Fantasy XIV","MMO");
		Game hots= new Game("Heroes of the Storm", "MOBA");
		
		
		
	}
}
