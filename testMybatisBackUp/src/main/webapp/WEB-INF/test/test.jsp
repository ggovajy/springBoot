<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
   <script src="https://unpkg.com/react@16/umd/react.development.js" crossorigin></script>
   <script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/6.1.19/browser.js"></script>
<script type="text/javascript">
	function popUpVideo(){
		window.open("/view.do");
		}
</script>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <form action = "/view.do" method = "get">
        <input type = "submit" value = "동영상 실시간 재생">
    </form>
</body>
</html>