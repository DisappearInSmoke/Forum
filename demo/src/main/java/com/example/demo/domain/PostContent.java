package com.example.demo.domain;

public class PostContent {
    private int postId;
    private int comment;

    @Override
    public String toString() {
        return "PostContent{" +
                "postId=" + postId +
                ", comment=" + comment +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public PostContent(int postId, int comment) {
        this.postId = postId;
        this.comment = comment;
    }

    public PostContent() {
    }
}
