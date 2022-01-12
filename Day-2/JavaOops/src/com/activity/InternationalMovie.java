package com.activity;

public class InternationalMovie extends Movie {

	private String country;
	private String language;

	public InternationalMovie(String movieName, String producedBy, String dircetedBy, String duration, String year,
			String category, String country, String language) {
		super(movieName, producedBy,dircetedBy,duration,year,category);
		this.country = country;
		this.language = language;
	}

	public void showInternaltionalMovieInformation() {
		super.showMovieInformation();
		System.out.println(" country= " + country + " language= " + language);
	}

}
