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
    <title>Title</title>
</head>
<body>
<form action="login" method="post">
    <input type="text" name="name" required="required" placeholder="用户名">
    <input type="password"  id="pwinput" name="password"required="required" placeholder="密码" maxlength="16">
    <input type="checkbox" id="pwcheck"/>显示密码
    <input type="submit" value="提交">
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        $(document).ready(function(){

            $("#pwinput").focus();

            $("#pwcheck").click(function(){
                if ($("#pwcheck").is(":checked"))
                {
                    $("#pwinput").clone()
                        .attr("type", "text").insertAfter("#pwinput")
                        .prev().remove();
                }
                else
                {
                    $("#pwinput").clone()
                        .attr("type","password").insertAfter("#pwinput")
                        .prev().remove();
                }
            });
        });
    </script>
        </form>
</body>
</html>
