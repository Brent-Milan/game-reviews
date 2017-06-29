package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
	
	@Resource 
	private GameRepository gameRepo;
	
	@Resource
	private GenreRepository genreRepo;
	
	@RequestMapping("/games")
	public String fetchGames(Model model) {
		model.addAttribute("games", gameRepo.findAll());
		return "games";
	}
	
	@RequestMapping("/genres")
	public String fetchGenre(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}
	
	
}
