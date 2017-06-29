package production;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GenratedValue
	private long id;
	
	private String title;
	private String genre;
	
	private Game() {
		
	}
	
	public Game(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	
	
}
