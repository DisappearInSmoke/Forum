package com.example.demo.dao.impl;

import com.example.demo.dao.CommentDao;
import com.example.demo.dao.ModuleDao;
import com.example.demo.domain.Comment;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ModuleDaoImplTest {
    private final ModuleDao moduleDao = new ModuleDaoImpl();
    private final CommentDao commentDao = new CommentDaoImpl();
    @Test
    void Test(){
        // System.out.println(moduleDao.findNodeAllChildNumber(1));
        //moduleDao.showAllNodeChildNode(2).forEach(System.out::println);

        /*Comment comment = new Comment();
        comment.setPostId(1);
        comment.setUserId(1);
        comment.setReplyContent("bbbbbbbb");
        comment.setReplyTime(LocalDateTime.now());
        comment.setCommentUpOneLevelId(2);
        comment.setCommentUpOneLevelCommentId(2);
        commentDao.saveOneComment(comment);*/
        //commentDao.deleteOneComment(1);
        commentDao.findAllCommentByPostId(1).forEach(System.out::println);
    }

}