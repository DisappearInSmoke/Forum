<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>XX论坛-登陆</title>
    <style>
        #div_first{
            text-align: center;
            margin-top: 100px;
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
            margin-top: 9px;
        }
        input:focus{
            border: 1px solid rgb(0,125,254);
        }
        a{
            text-decoration: none;
            color: rgb(9,128,255);
        }
        #remember{
            margin-top: 0px;
            width: 15px;
            height: 15px;
        }
        span{
            font-size: 36px;
            font-weight: 300;
        }
        #y{
            margin-left: 200px;
        }
    </style>
</head>
<body>
<form action="login" method="post">
    <div id="div_first">
        <span>论坛登陆</span>
        <p><input type="text" placeholder="用户名" name="name" class="in" id="name"/></p>
        <p><input type="password" placeholder="密码" name="password" class="in1" id="password" /></p>
        <p id="y"><input id="remember" name="remember" type="checkbox" value="true">记住用户名和密码</p>
        <p><input type="submit" value="登陆" id="tiJiao"/></p>
        <a href="insert.html">注册</a>
    </div>

    <script src="js/jquery.js" type="text/javascript"></script>
    <script type="text/javascript">
        $('input').on('input propertychange', function() {
            if(($.trim($('.in').val()) !== "") && ($.trim($('.in1').val()) !== "")){
                $("#tiJiao").css("background-color","rgb(204,32,38)");
            } else {
                $("#tiJiao").css("background-color","rgb(241,172,171)");
            }
        });
        function getCookie(name) {
            //传递进来一个参数，这个参数是cookie的名字
            //得到的结果是这个cookie的值
            const strCookie = document.cookie;
            const arrCookie = strCookie.split("; ");
            for (let i = 0; i < arrCookie.length; i++) {
                let arr = arrCookie[i].split("=");
                if (arr[0] === name) {
                    return arr[1];
                }
            }
            return "";
        }

        if (document.cookie.indexOf("name") === -1 || document.cookie.indexOf("token") === -1) {
            //如果浏览器中没有叫做username和toke的cookie，就将两个文本框的内容清空
            document.getElementById("name").value = "";
            document.getElementById("password").value = "";
        } else {
            document.getElementById("remember").checked = true; //让复选框打上对号
            document.getElementById("name").value = getCookie("username");
            document.getElementById("password").value = "";
        }
    </script>
</form>
</body>
</html>