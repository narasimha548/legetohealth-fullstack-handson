package com.activity;

public class SpecialMovie extends Movie {
	
	
	private String soundEffects;
	private String visualEffects;
	
	
	
	
	
	public SpecialMovie(String movieName, String producedBy, String soundEffects, String visualEffects) {
		super(movieName, producedBy);
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
	}
	
	
	
	public void showMovieInformation() {
		super.showMovieInformation();
		System.out.println(" sound= "+soundEffects +" visual= "+visualEffects );
	}
	
	

}
