package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	public Genre genre ;
	
	private String title;
	
	
	private Game() {
		
	}
	
	public Game(String title, Genre genre) {
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
