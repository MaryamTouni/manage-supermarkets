package com.meme.managemarkets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "SUPERMARKET")
public class SuperMarket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "ARABIC_NAME")
	private String arabicName;
	@Column(name = "ENGLISH_NAME")
	private String englishName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(columnDefinition = "tinyint(1) default 1", name = "STATUS")
	private boolean status;
	@Lob
	@Column(name = "PHOTO")
	private byte[] photo;

	public SuperMarket() {
	}

	public SuperMarket(Integer id, String arabicName, String englishName, String address, Boolean status,
			byte[] photo) {
		super();
		this.id = id;
		this.arabicName = arabicName;
		this.englishName = englishName;
		this.address = address;
		this.status = status;
		this.photo = photo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArabicName() {
		return arabicName;
	}

	public void setArabicName(String arabicName) {
		this.arabicName = arabicName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

}
