package com.activity;

public class SpecialMovie extends Movie {
	
	
	private String soundEffects;
	private String visualEffects;
	
	
	
	
	
	
	
	public SpecialMovie(String movieName, String producedBy, String dircetedBy, String duration, String year,
			String category, String soundEffects,String visualEffects) {
		super(movieName, producedBy,dircetedBy,duration,year,category);
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
	}







	public void showSPInformation() {
		super.showMovieInformation();
		System.out.println(" sound= "+soundEffects +" visual= "+visualEffects );
	}
	
	

}
