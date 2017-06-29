package production;

import javax.persistence.Entity;

@Entity
public class Game {

	@Id
	@GenratedValue
	private long id;
	
	private String title;
	private String genre;
	
	private Game() {
		
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
