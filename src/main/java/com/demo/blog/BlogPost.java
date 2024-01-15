package com.demo.blog;

import java.time.LocalDateTime;
import java.util.Date;

public class BlogPost {
    private String title;
    private LocalDateTime datePublished;
    private String author;
    private String content;

    public BlogPost(String title, LocalDateTime datePublished, String author, String content) {
        this.title = title;
        this.datePublished = datePublished;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDatePublished() {
        return new Date(datePublished.getYear(), datePublished.getMonthValue(), datePublished.getDayOfMonth());
    }

    public void setDatePublished(LocalDateTime datePublished) {
        this.datePublished = datePublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
