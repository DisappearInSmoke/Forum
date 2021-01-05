package com.example.demo.dao.impl;

import com.example.demo.dao.CommentDao;
import com.example.demo.domain.Comment;
import com.example.demo.util.BaseDao;

public class CommentDaoImpl extends BaseDao implements CommentDao {
    @Override
    public int saveOneComment(Comment comment) {
        String sql="insert into Comment( post_id, user_id, reply_content, reply_time, comment_up_one_level_id) value (?,?,?,?,?)";
        return executeUpdate(sql,
                comment.getPostId(),
                comment.getUserId(),
                comment.getReplyContent(),
                comment.getReplyTime(),
                comment.getCommentUpOneLevelId());
    }

    @Override
    public int deleteOneComment(int commentId) {
        String sql="delete from Comment where comment_id=?";
        return executeUpdate(sql,commentId);
    }
}
