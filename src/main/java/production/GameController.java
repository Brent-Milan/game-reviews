package production;

import org.springframework.stereotype.Controller;

@Controller
public class GameController {
	
	@Resource 
	private GameRepository gameRepo;
	
	@RequestMapping("/reviews")
	public String fetchGames(Model model) {
		model.addAtrribute("games", gameRepo.findAll());
	}
		return "reviews";
}
