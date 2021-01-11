<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2021/1/7
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" href="css/yangshi.css"/>
    <style>
    </style>
</head>
<body>
<div id="shouYe">
    <p id="deng">
        <a href="#">${sessionScope.name}</a>
        <a class="shouYe"href="login.jsp">登陆</a><a  class="shou">/</a><a class="shouYe"href="insert.jsp">立即注册</a>
    </p>
    <a href="index.html" id="lunTan" target="_self">XX论坛</a>
</div>

<div id="div_two">
    <div class="container">
        <form action="" class="parent" method="post">
            <input type="text" class="search" placeholder="请输入搜索内容">
            <input type="button" class="btn">
        </form>
    </div>
</div>
<p>当前在线人数为：<%=application.getAttribute("count") %></p>
<a href="<%=response.encodeUrl("logout.jsp") %>">退出登录</a>
<div id="div_three">
    <img src="img/86ce5bdca3cc7cd96278de523401213fb90e9143.jpg" width="400" height="500"/>
    <img src="img/86ce5bdca3cc7cd96278de523401213fb90e9143.jpg" width="400" height="500"/>
    <img src="img/86ce5bdca3cc7cd96278de523401213fb90e9143.jpg" width="400" height="500"/>
</div>
</body>
</html>
