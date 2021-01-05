package com.example.demo.domain;

import java.sql.Timestamp;

public class Post {
    private int PostId;
    private int moduleId;
    private int userId;
    private String title;
    private Timestamp createTime;
    private String testContent;

    @Override
    public String toString() {
        return "Post{" +
                "PostId=" + PostId +
                ", moduleId=" + moduleId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", testContent='" + testContent + '\'' +
                '}';
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public Post(int postId, int moduleId, int userId, String title, Timestamp createTime, String testContent) {
        PostId = postId;
        this.moduleId = moduleId;
        this.userId = userId;
        this.title = title;
        this.createTime = createTime;
        this.testContent = testContent;
    }

    public Post() {
    }
}
