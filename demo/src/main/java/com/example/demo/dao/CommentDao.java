package com.example.demo.dao;

import com.example.demo.domain.Comment;

import java.util.List;

public interface CommentDao { //关于评论的方法
    //添加一条评论
    int saveOneComment(Comment comment);
    //删除一条评论
    int deleteOneComment(int commentId);

    //查询某个帖子下的所有评论安时间升序排序显示
    List<Comment> findAllCommentByPostId(int postId);

}
