package com.example.demo.dao;

import com.example.demo.domain.Module;
import com.example.demo.domain.ModuleViews;

import java.util.List;

public interface ModuleDao { //关于模块的方法
    //查询所有模块
    List<Module> showAllModule();

    //遍历某一个节点的子节点
    List<Module> showAllNodeChildNode(int NodeId);

    //求某个节点有多少个子节点：(右-左-1)/2
    int findNodeAllChildNumber(int NodeId);

    //找出某个节点在哪个层上
    int findNodeLevel(int NodeId);

    //通过查询view，查看某个节点的所有子节点及其所在level
    List<ModuleViews> findAllChildNodeLevel(int NodeId);

    //获得某个节点一直到根的父路径
    List<ModuleViews> findNodeParentPath(int NodeId);

    //为某个节点增加一个子节点
    int saveChild(int id,String moduleName);

    //为某个节点删除一个子节点
    int delChild(int id);
}
