package com.activity;

public class Test {
	public static void main(String[] args) {
		
		
		
		Movie m=new Movie("RRR", "DVV", "Rajamouli", "190", "2022", "Action");
		m.showMovieInformation();
		Movie.Count();
		
		System.out.println("----------------------------------");
		Movie m1=new Movie("Batman", "DC", "Nolan", "150", "2002", "Action");
		m1.showMovieInformation();
		Movie.Count();
		
		String movieId=m1.getMovieId();
		System.out.println("movie name apend "+movieId);
		
		String movieInfo=m1.movieInfo();
		System.out.println("movie info ========== "+movieInfo);
		
		System.out.println("---------------------------------------");
		
		SpecialMovie spmovie=new SpecialMovie("Ironman", "marvel", "rusos", "155", "2008", "action", "dolby 5.1", "3D");
		spmovie.showSPInformation();
		
		System.out.println("---------------------------------------");
		
		InternationalMovie ima1=new InternationalMovie("BB", "DVS", "Rajamouli", "175", "2015", "Action", "India", "Telugu");
		ima1.showInternaltionalMovieInformation();
		
	}

}
