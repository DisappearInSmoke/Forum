<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册_XX论坛</title>
    <style>
        input{
            border-radius: 9px;
            width: 430px;
            height: 45px;
            outline: none;
            border: 1px solid rgb(242,242,242);
        }
        a{
            text-decoration: none;
        }
        input{
            background-color: rgb(242,242,242);
        }
        input:focus{
            border: 1px solid rgb(0,125,254);
        }
        #div_first{
            margin-top: 100px;
            text-align: center;
        }
        #zhuCe{
            border: 1px solid rgb(166,203,252);
            background-color: rgb(166,203,252);
            color: #FFFFFF;
            font-size: 16px;
            margin-top: 20px;
            width: 300px;
        }
        .neiRong{
            text-indent: 1em;
        }
        #gao{
            margin-top: 25px;
        }
        #span_first{
            font-size: 36px;
            font-weight: 300;
        }#span_secends{
             margin-top: 40px;
             font-size: 18px;
         }

        a:link{
            color: rgb(0,125,254);
        }
        a:visited{
            color: rgb(0,125,254);
        }

    </style>
</head>
<form method="post" action="insert">
    <body>
    <div id="div_first">
        <span id="span_first">XX账号注册</span><br>
        <span id="span_secends">已有账号，<a href="login.jsp">去登录 ></a></span>
        <br/><br /><br />
        <p><input class="neiRong" type="text" name="name" id="neirong1" placeholder="用户名" required="required" max="10"/></p>
        <p id="gao"></p>
        <p><input class="neiRong" type="password" name="password" id="neirong2"  placeholder="密码" required="required" max="16"/>
            <a href="#" id="passwordeye" class="eye_disable"></a>
        <p id="gao"></p>
        <p><input class="neiRong" type="email" name="email" id="neirong4" placeholder="邮箱地址" required="required"/></p>
        <p id="gao"></p>
        <p><input class="neiRong" type="date" name="birthday" id="neirong5" required min="2000-01-01" value="2000-01-01"  placeholder="出生日期"/></p>
        <p id="gao"</p>
        <p><input type="submit" id="zhuCe" value="注册"/></p>
    </div>
</form>
<script src="js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
    $('input').on('input propertychange', function() {
        if (($.trim($('#neirong1').val()) !== "") && ($.trim($('#neirong2').val()) !== "")
            && ($.trim($('#neirong4').val()) !== "")) {
            $("#zhuCe").css("background-color", "rgb(0,125,254)");
        } else {
            $("#zhuCe").css("background-color", "rgb(166,203,252)");
        }
    });
</script>
</body>
</html>
