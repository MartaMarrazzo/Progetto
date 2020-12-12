package com.example.FilminStreaming.model;

public class SitoStreaming {
	private int Id;
	private String Name;
	private int MovieDatabase;
	private String HostingNation;
	private float UpdateTime;
	private long LastUpdate;
	private long FirstUpdate;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMovieDatabase() {
		return MovieDatabase;
	}
	public void setMovieDatabase(int movieDatabase) {
		MovieDatabase = movieDatabase;
	}
	public String getHostingNation() {
		return HostingNation;
	}
	public void setHostingNation(String hostingNation) {
		HostingNation = hostingNation;
	}
	public float getUpdateTime() {
		return UpdateTime;
	}
	public void setUpdateTime(float updateTime) {
		UpdateTime = updateTime;
	}
	public long getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(long lastUpdate) {
		LastUpdate = lastUpdate;
	}
	public long getFirstUpdate() {
		return FirstUpdate;
	}
	public void setFirstUpdate(long firstUpdate) {
		FirstUpdate = firstUpdate;
	}

}
