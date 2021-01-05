package com.example.demo.domain;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Comment { //评论表实体
    private int CommentId; //评论编号
    private int PostId; //帖子编号
    private int userId; //用户编号
    private String replyContent; //回复内容
    private LocalTime replyTime; //回复时间
    private int commentUpOneLevelId; //评论上级编号

    public Comment() {
    }

    public Comment(int commentId, int postId, int userId, String replyContent, LocalTime replyTime, int commentUpOneLevelId) {
        CommentId = commentId;
        PostId = postId;
        this.userId = userId;
        this.replyContent = replyContent;
        this.replyTime = replyTime;
        this.commentUpOneLevelId = commentUpOneLevelId;
    }

    public int getCommentId() {
        return CommentId;
    }

    public void setCommentId(int commentId) {
        CommentId = commentId;
    }

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public LocalTime getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(LocalTime replyTime) {
        this.replyTime = replyTime;
    }

    public int getCommentUpOneLevelId() {
        return commentUpOneLevelId;
    }

    public void setCommentUpOneLevelId(int commentUpOneLevelId) {
        this.commentUpOneLevelId = commentUpOneLevelId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "CommentId=" + CommentId +
                ", PostId=" + PostId +
                ", userId=" + userId +
                ", replyContent='" + replyContent + '\'' +
                ", replyTime=" + replyTime +
                ", commentUpOneLevelId=" + commentUpOneLevelId +
                '}';
    }
}
