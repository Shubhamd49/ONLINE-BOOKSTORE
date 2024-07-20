package com.bookstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
	@Id
	private String id;

	private String bookId;
	private String userId;
	private String reviewText;
	private Integer rating;

	// getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	//constructors
	public Review(String id, String bookId, String userId, String reviewText, Integer rating) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.userId = userId;
		this.reviewText = reviewText;
		this.rating = rating;
	}

	public Review() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "Review [id=" + id + ", bookId=" + bookId + ", userId=" + userId + ", reviewText=" + reviewText
				+ ", rating=" + rating + "]";
	}
	
	
	
	
	

}
