package model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


/**
 * The persistent class for the Videos database table.
 * 
 */
@Entity
@Table(name="Videos")
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@NotBlank(message = "ID is null !!!")
	@Column(name="VideoId")
	private String videoId;

	@Column(name="Active")
	private boolean active;

	@Column(name="Category")
	private String category;

	@Column(name="Description")
	private String description;

	@Column(name="Poster")
//	@NotBlank(message = "Poster is null !!!")
	private String poster;

	@Column(name="Title")
	@NotBlank(message = "Title is null !!!")
	private String title;

	@Column(name="VideoURL")
	@NotBlank(message = "Video URL is null !!!")
	private String videoURL;

	@Column(name="Views")
	private int views;

	public Video() {
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPoster() {
		return this.poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideoURL() {
		return this.videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

}