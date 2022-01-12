package com.activity;

public class InternationalMovie {
	
	private String movieId;
	private String movieName;
	private String producedBy;
	private String dircetedBy;
	private String duration;
	private String year;
	private String category;
	private String country;
	private String language;
	
	public InternationalMovie(String country, String language) {
		super();
		this.country = country;
		this.language = language;
		System.out.println(" country= "+country +" language= "+language);
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getDircetedBy() {
		return dircetedBy;
	}

	public void setDircetedBy(String dircetedBy) {
		this.dircetedBy = dircetedBy;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	public void showMovieInformation() {
		System.out.println("movie name = " + movieName + " produced by= " + producedBy + " directed by = " + dircetedBy
				+ " duration = " + duration +"  year = "+year +" country= "+country +" language= "+language );
	}
	
	

}
