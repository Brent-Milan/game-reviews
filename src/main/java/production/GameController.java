package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
	
	@Resource 
	private GameRepository gameRepo;
	
	@RequestMapping("/games")
	public String fetchGames(Model model) {
		model.addAtrribute("games", gameRepo.findAll());
		return "games";
	}
	
	@RequestMapping("/genres")
	public String fetchGames(Model model) {
		model.addAtrribute("genres", genreRepo.findOne());
		return "genres";
	}
	
	
}
