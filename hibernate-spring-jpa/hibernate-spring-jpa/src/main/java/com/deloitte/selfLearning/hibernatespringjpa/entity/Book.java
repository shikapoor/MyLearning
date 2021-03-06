package com.deloitte.selfLearning.hibernatespringjpa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity(name = "book_dtls")
public class Book {
	
	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long  bookID;
	
	@Column(name = "book_name", nullable = false)
	private String bookName;
	
	@Column(name = "book_Author", nullable = false)
	private String bookAuthor;
	
	@Column(name  = "book_publisher", nullable = false)
	private String bookPublisher;
	
	@Column(name = "book_price", nullable = false)
	private double price;
	
	@OneToMany(mappedBy = "book", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)//cascade = {CascadeType.ALL},
	private Set<Chapter> chapterSet;
	
	
	public Set<Chapter> getChapterSet() {
		if(chapterSet == null)
		{
			setChapterSet(new HashSet<>());
		}
		
		return chapterSet;
	}
	public void setChapterSet(Set<Chapter> chapterSet) {
		this.chapterSet = chapterSet;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public long getBookID() {
		return bookID;
	}
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String bookAuthor, String bookPublisher, double price) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.price = price;
	}
	

}
