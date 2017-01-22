package com.tutorial.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="PHOTOS")
public class Photos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="PHOTO",length=100,nullable=false)
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_FK")
	private Players player;

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

	public Players getPlayer() {
		return player;
	}

	public void setPlayer(Players player_photos) {
		this.player = player_photos;
	}

	@Override
	public String toString() {
		return "Photos [id=" + id + ", photo=" + photo + ", player_photos=" + player + "]";
	}
	
	

}
