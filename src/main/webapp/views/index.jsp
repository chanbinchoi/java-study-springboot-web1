<%@page language="java" %>

<html>
<head>
    <!-- static 폴더에 있는 css는 /파일명 으로 접근 -->
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
<h2>Telsuko Calculator</h2>

<!-- /add URL로 요청 보냄 -->
<form action="addAlien">
    <!-- 입력값 name이 컨트롤러 @RequestParam과 매칭됨 -->
    <label for="aid">Enter Id :</label>
    <input type="text" id="aid" name="aid"><br>

    <label for="aname">Enter Name :</label>
    <input type="text" id="aname" name="aname"><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>