package com.activity;

public class InternationalMovie extends Movie {

	private String country;
	private String language;

	public InternationalMovie(String movieName, String producedBy, String country, String language) {
		super(movieName, producedBy);
		this.country = country;
		this.language = language;
	}

	public void showInternaltionalMovieInformation() {
		super.showMovieInformation();
		System.out.println(" country= " + country + " language= " + language);
	}

}
