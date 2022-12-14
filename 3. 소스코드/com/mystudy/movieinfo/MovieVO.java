package com.mystudy.movieinfo;
public class MovieVO {

	int movie_id;
	String movie_name;
	String genre1_id;
	String genre2_id;
	String genre_name;
	int running_time;
	String actors;
	String opendate;
	String summary;
	String rating_id;
	String rating_name;
	String company;
	String director;
	double avg_grade;
	double booking_rate;

	public MovieVO(int movie_id, String movie_name, String genre1_id, String genre2_id, String genre_name,
			int running_time, String actors, String opendate, String summary, String rating_id, String rating_name,
			String company, String director, double avg_grade, double booking_rate) {
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.genre1_id = genre1_id;
		this.genre2_id = genre2_id;
		this.genre_name = genre_name;
		this.running_time = running_time;
		this.actors = actors;
		this.opendate = opendate;
		this.summary = summary;
		this.rating_id = rating_id;
		this.rating_name = rating_name;
		this.company = company;
		this.director = director;
		this.avg_grade = avg_grade;
		this.booking_rate = booking_rate;
	}

	public double getBooking_rate() {
		return booking_rate;
	}

	public void setBooking_rate(double booking_rate) {
		this.booking_rate = booking_rate;
	}

	public MovieVO() {
		super();
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getGenre1_id() {
		return genre1_id;
	}

	public void setGenre1_id(String genre1_id) {
		this.genre1_id = genre1_id;
	}

	public String getGenre2_id() {
		return genre2_id;
	}

	public void setGenre2_id(String genre2_id) {
		this.genre2_id = genre2_id;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	public int getRunning_time() {
		return running_time;
	}

	public void setRunning_time(int running_time) {
		this.running_time = running_time;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getRating_id() {
		return rating_id;
	}

	public void setRating_id(String rating_id) {
		this.rating_id = rating_id;
	}

	public String getRating_name() {
		return rating_name;
	}

	public void setRating_name(String rating_name) {
		this.rating_name = rating_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getAvg_grade() {
		return avg_grade;
	}

	public void setAvg_grade(double avg_grade) {
		this.avg_grade = avg_grade;
	}

	@Override
	public String toString() {

		return "???????????? = " + getMovie_id() + "\n???????????? = " + getMovie_name() + "\n???????????? = "
				+ getRunning_time() + "\n????????? = " + getActors() + "\n???????????? = " + getOpendate() + "\n?????? = "
				+ getSummary() + "\n???????????? = " + getRating_name() + "\n?????? = " + getDirector() + 
				"\n????????? = " + getCompany() + "\n???????????? = " + getAvg_grade() + "\n?????? = " + getGenre1_id() + ", " + getGenre2_id()
				;

	}

}
