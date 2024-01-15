package com.demo.blog;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Named
@ApplicationScoped
public class BlogPostListBean {
    private ArrayList<BlogPost> blogPosts;

    public BlogPostListBean() {
        blogPosts = new ArrayList<>();
        blogPosts.add(new BlogPost("Hello World", LocalDateTime.now(), "Boryana", "This is My First Blog Post."));
        blogPosts.add(new BlogPost("Second Blog Post", LocalDateTime.now(), "Boryana", "This is My Second Blog Post."));
        blogPosts.add(new BlogPost("Third Blog Post", LocalDateTime.now(), "Boryana", "This is My Third Blog Post."));
        blogPosts.add(new BlogPost("New Blog Post", LocalDateTime.now(), "Boryana", "Lorem ipsum dolor sit amet, consectetur" +
                " adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Pulvinar mattis nunc sed blandit libero volutpat sed." +
                " Tristique risus nec feugiat in fermentum. Duis at consectetur lorem donec massa sapien faucibus et molestie. Tristique et egestas quis ipsum suspendisse" +
                " ultrices gravida dictum fusce. Tellus pellentesque eu tincidunt tortor. Cursus risus at ultrices mi tempus imperdiet nulla malesuada pellentesque." +
                " Quis eleifend quam adipiscing vitae. Mauris sit amet massa vitae tortor. Viverra nam libero justo laoreet sit amet. Integer feugiat scelerisque varius morbi." +
                " Malesuada fames ac turpis egestas maecenas pharetra convallis posuere morbi. Platea dictumst quisque sagittis purus sit amet volutpat consequat."));
    }

    public ArrayList<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(ArrayList<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
}
