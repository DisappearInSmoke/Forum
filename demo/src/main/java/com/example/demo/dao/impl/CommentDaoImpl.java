package com.example.demo.dao.impl;

import com.example.demo.dao.CommentDao;
import com.example.demo.domain.Comment;
import com.example.demo.domain.Module;
import com.example.demo.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommentDaoImpl extends BaseDao implements CommentDao {
    @Override
    public int saveOneComment(Comment comment) {
        String sql="insert into Comment( post_id, user_id, reply_content, reply_time, comment_up_one_level_id,comment_up_one_level_comment_id) value (?,?,?,?,?,?)";
        return executeUpdate(sql,
                comment.getPostId(),
                comment.getUserId(),
                comment.getReplyContent(),
                comment.getReplyTime(),
                comment.getCommentUpOneLevelId(),
                comment.getCommentUpOneLevelCommentId());
    }

    @Override
    public int deleteOneComment(int commentId) {
        String sql="delete from Comment where comment_id=?";
        return executeUpdate(sql,commentId);
    }

    @Override
    public List<Comment> findAllCommentByPostId(int postId) {
        String sql="select * from Comment where post_id=? order by reply_time asc;";
        List<Comment> comments = new ArrayList<>();
        ResultSet resultSet = executeQuery(sql,postId);
        try {
            while (resultSet.next())
                comments.add(new Comment(
                        resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getTimestamp(5).toLocalDateTime(),
                        resultSet.getInt(6),
                        resultSet.getInt(7)
                ));
            return comments;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
