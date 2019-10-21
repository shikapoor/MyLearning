package com.deloitte.learning.jpa.learning.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity(name = "Chapter_dtls")
public class Chapter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name= "chapter_seq",  allocationSize = 10, initialValue = 1)
	@Column(name = "chapter_id")
	private int chapterId;
	
	@Column(name  = "chapter_name", nullable = false)
	private String chapterName;
	
	@ManyToOne
	@Cascade({CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "book_id")
	private Book book;
	
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	
	public Chapter() {
		super();
	}
	public Chapter(String chapterName, Book book) {
		super();
		this.chapterName = chapterName;
		this.book = book;
	}
	
	
	
	
	

}
