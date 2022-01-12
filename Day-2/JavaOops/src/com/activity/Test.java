package com.activity;

public class Test {
	public static void main(String[] args) {
		
		//Movie m=new Movie("RRR", "Rajamouli");
		
		Movie m=new Movie("RRR", "DVV", "Rajamouli", "190", "2022", "Action");
		m.showMovieInformation();
		Movie.Count();
		
		System.out.println("---------------");
		Movie m1=new Movie("Batman", "DC", "Nolan", "150", "2002", "Action");
		m1.showMovieInformation();
		Movie.Count();
		String movieId=m1.getMovieId();
		System.out.println("movie name apend "+movieId);;
		String movieInfo=m1.movieInfo();
		System.out.println("movie info === "+movieInfo);
		
		
	}

}
