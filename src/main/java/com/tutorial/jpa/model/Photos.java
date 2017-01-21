package com.tutorial.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="player_photos")
public class Photos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="player_fk")
	private Players player_photos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Players getPlayer_photos() {
		return player_photos;
	}

	public void setPlayer_photos(Players player_photos) {
		this.player_photos = player_photos;
	}

	@Override
	public String toString() {
		return "Photos [id=" + id + ", photo=" + photo + ", player_photos=" + player_photos + "]";
	}
	
	

}
