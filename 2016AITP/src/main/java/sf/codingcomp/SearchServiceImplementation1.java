package sf.codingcomp;

import java.util.ArrayList;
import java.util.List;
import sf.codingcomp.model.Entertainment;
import sf.codingcomp.model.Game;
import sf.codingcomp.model.Movie;
import sf.codingcomp.model.Platform;
import sf.codingcomp.reader.*;

public class SearchServiceImplementation1 implements SearchService {

	@Override
	public List<Movie> searchMovie(String searchValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> searchGame(String searchValue) {
		Reader myReader=new Reader();
		List<Game> allGames=myReader.readGames();
		List<Game> result=new ArrayList<Game>();
		result.clear();
		String lsv=searchValue.toLowerCase();
		for (int i=0;i<allGames.size();i++){
			Game g=allGames.get(i);
			if (g.getTitle().toLowerCase().contains(lsv)==true){
				result.add(g);
			}
		}
		return result;
	}

	@Override
	public List<Entertainment> searchGameAndMovies(String searchValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> sortMoviesByDate(String searchValue, Double userRating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> sortGamesByDate(String searchValue, Double userRating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entertainment> sortGamesAndMoviesByDate(String searchValue,
			Double userRating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> moviesByGenreAndRating(String Genre, String Rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> gamesByGenreAndRating(String Genre, String Rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entertainment> entertainmentByGenreAndRating(String Genre,
			String Rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Entertainment> void checkout(T title, Platform<T> platform) {
		// TODO Auto-generated method stub

	}

}
