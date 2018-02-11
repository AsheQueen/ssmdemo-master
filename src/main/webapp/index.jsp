<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.json-2.4.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Insert title here</title>
    <script type="text/javascript">

        function shuzuTest() {
            var dataArr = new Array();
            for(var i = 0; i < 10; i++){
                dataArr.push(i);
            }
            $.ajax({
                url : "http://localhost:8080/restAPI/arrayParam.action",
                data : {
                    "datas" : dataArr
                },
                dataType : "json",
                success : function(data) {
                    alert(data);
                },
                async : false
            });
        }

        function strshuzuTest() {
            var dataArr = new Array();
            // for(var i = 0; i < 10; i++){
            //     dataArr.push(i.toString());
            // }
            var orgId = 123;
            $.ajax({
                url : "http://localhost:8080/restAPI/strArrayParam.action",
                data : {
                    "datas" : ["搜索","嗷嗷","吃的"],
                    "orgId" : orgId
                },
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success : function(data) {
                    alert(data);
                },
                async : false
            });
        }

        // var cmd = {
        //     "userPhone": $("#userPhone").val(),
        //     "userPassword": $("#userPassword").val()
        // }
        //
        // function ajaxTest() {
        //     $.ajax({
        //         data: cmd,
        //         type: "GET",
        //         dataType: 'json',
        //         url: "userLogin.action",
        //         error: function (data) {
        //             alert("出错了！！:");
        //             alert(data)
        //         },
        //         success: function (data) {
        //             alert("success:" );
        //             $("#result").html(data.msg);
        //         }
        //     });
        // }
    </script>
</head>
<body>
<input type="text" name="userPhone" id="userPhone"/>
<input type="password" name="userPassword" id="userPassword"/>
<input type="submit" value="登录" onclick="ajaxTest();"/>
<div id="result"></div>

<button class="button" onclick="shuzuTest()">点击</button><br><br>
<button class="button1" onclick="strshuzuTest()">字符数组</button><br><br>
</body>
</html>