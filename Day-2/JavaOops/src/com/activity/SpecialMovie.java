package com.activity;

public class SpecialMovie {
	
	private String movieId;
	private String movieName;
	private String producedBy;
	private String dircetedBy;
	private String duration;
	private String year;
	private String category;
	private String soundEffects;
	private String visualEffects;
	
	
	
	
	public SpecialMovie(String movieId, String movieName, String producedBy, String dircetedBy, String duration,
			String year, String category, String soundEffects, String visualEffects) {
		//super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.producedBy = producedBy;
		this.dircetedBy = dircetedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
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
	public String getSoundEffects() {
		return soundEffects;
	}
	public void setSoundEffects(String soundEffects) {
		this.soundEffects = soundEffects;
	}
	public String getVisualEffects() {
		return visualEffects;
	}
	public void setVisualEffects(String visualEffects) {
		this.visualEffects = visualEffects;
	}
	
	
	public void showMovieInformation() {
		System.out.println("movie name = " + movieName + " produced by= " + producedBy + " directed by = " + dircetedBy
				+ " duration = " + duration +"  year = "+year +" sound= "+soundEffects +" visual= "+visualEffects );
	}
	
	

}
