package com.tutorial.jpa.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "PLAYER")
public class Players implements Serializable {

	private static final long serialVersionUID = -2766273286662783500L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surname;

	@Column(name = "AGE")
	private int age;

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTH")
	private Date birthDate;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "player", orphanRemoval = true, targetEntity=Photos.class)
	private Collection<Photos> photos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Collection<Photos> getPhotos() {
		return photos;
	}

	public void setPhotos(Collection<Photos> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", birthDate="
				+ birthDate + ", photos=" + photos + "]";
	}

}