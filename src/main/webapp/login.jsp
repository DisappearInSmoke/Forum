<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2021/1/4
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>XX论坛-登陆</title>
    <style>
        #div_first{
            text-align: center;
        }
        input{
            border-radius: 9px;
            width: 350px;
            height: 45px;
            outline: none;
            border: 1px solid rgb(242,242,242);
            text-indent: 1em;
            font-size: 14px;
            background-color: rgb(242,242,242);
            margin-top: 12px;
        }
        #tiJiao{
            border: 1px solid rgb(239,171,170);
            background-color: rgb(239,171,170);
            font-size: 13px;
            color: white;
            text-indent: -1em;
            margin-top: 20px;
        }
        input:focus{
            border: 1px solid rgb(0,125,254);
        }
        a{
            text-decoration: none;
            color: rgb(9,128,255);
        }
        #tiJiao1{
            background-color: rgb(204,32,38);
            border: rgb(204,32,38);
        }
    </style>
</head>
<body>
<form action="login" method="post">
    <div id="div_first">
        <h2>XX论坛登陆</h2>
        <p><input type="text" placeholder="用户名" name="name" id="Username"/></p>
        <p><input type="password" placeholder="密码" name="password"/></p>
        <p><input type="submit" id="tiJiao" value="登陆" onclick="NotNull"/></p>
        <a href="insert.html">注册</a>
    </div>
    <script src="jquery-1.8.3.js" type="text/javascript"></script>
    <script type="text/javascript">
    </script>
</form>
</body>
</html>
