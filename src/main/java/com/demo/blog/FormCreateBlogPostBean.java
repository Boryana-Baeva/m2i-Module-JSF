package com.demo.blog;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.time.LocalDateTime;
import java.util.Date;

@Named
@RequestScoped
public class FormCreateBlogPostBean {
    private String title;
    private LocalDateTime datePublished;
    private String author;
    private String content;

    @Inject
    BlogPostListBean blogPostListBean;

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

    public void submit() {
        blogPostListBean.getBlogPosts().add(new BlogPost(title, LocalDateTime.now(), author, content));
        title="";
        author="";
        content="";
    }
}
