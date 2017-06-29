package production;

import java.util.Set;

import javax.persistence.OneToMany;

public class Genre {

	@OneToMany(mappedBy="game")
	private Set<Game> games;
}
