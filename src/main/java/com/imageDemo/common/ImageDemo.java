package com.imageDemo.common;

public class ImageDemo implements java.io.Serializable {

	private Integer id;
	private byte[] image;

	public ImageDemo() {
	}

	public ImageDemo(byte[] image) {
		this.image = image;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
