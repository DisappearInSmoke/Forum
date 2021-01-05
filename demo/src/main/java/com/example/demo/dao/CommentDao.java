package com.example.demo.dao;

import com.example.demo.domain.Comment;

public interface CommentDao { //关于评论的方法
    //添加一条评论
    int saveOneComment(Comment comment);
    //删除一条评论
    int deleteOneComment(int commentId);
}
