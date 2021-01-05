package com.example.demo.dao;

import com.example.demo.domain.Module;

import java.util.List;

public interface ModuleDao { //关于模块的方法
    //查询所有模块
    List<Module> showAllModule();
}
