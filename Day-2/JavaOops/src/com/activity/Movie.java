package com.activity;



public class Movie {

	private String movieId;
	private String movieName;
	private String producedBy;
	private String dircetedBy;
	private String duration;
	private String year;
	private String category;
	
	
	static int movieCounter;
	
	{
		System.out.println("Instance Block----");
		movieCounter++;
	}

	public Movie(String movieName, String producedBy) {

		this.movieName = movieName;
		this.producedBy = producedBy;
		System.out.println("Movie(String,String)");
	}

	public Movie(String movieName, String producedBy, String dircetedBy, String duration, String year,
			String category) {

		this(movieName,producedBy);
		this.movieName = movieName;
		this.producedBy = producedBy;
		this.dircetedBy = dircetedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;

		System.out.println(" All Param Movie(String,String,String,String,Date,String[]) --");
	}

	
	public String getMovieId() {
		
		return movieId=movieName+"_"+movieCounter;
		
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

	public void showMovieInformation() {
		System.out.println("movie name = " + movieName + " produced by= " + producedBy + " directed by = " + dircetedBy
				+ " duration = " + duration +"  year = "+year);
	}
	
	public String movieInfo() {
		return movieName +" "+producedBy+" "+dircetedBy+"  "+duration+"  "+year +"  "+category;
	}
	
	public static void Count() {
		System.out.println("Number of objects: "+movieCounter);
	}
	
	public void  moiveIdInfo() {
		movieId=movieName+"_"+movieCounter;
		System.out.println("movie name apend "+movieId);
	}

}
