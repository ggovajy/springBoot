<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="https://unpkg.com/react@16/umd/react.development.js" crossorigin></script>
    <script src="https://unpkg.com/react-dom@16/umd/react-dom.development.js" crossorigin></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/6.1.19/browser.js"></script>
<script type="text/javascript">
var chkRow = 0;
	function actionUpdate() {
		var returnIndex = chkRow;
		var returnID = $("#resID_"+returnIndex).val();
		var returnNAME = $("#resNAME_"+returnIndex).val();
		var returnTEAMID = $("#resTEAMID_"+returnIndex).val();
		$("#retIndex").val(returnIndex);
		$("#retID").val(returnID);
		$("#retNAME").val(returnNAME);
		$("#retTEAMID").val(returnTEAMID);
        document.testForm.action="<c:url value='/update.do'/>";
        document.testForm.method="post";
        //document.loginForm.j_username.value = document.loginForm.userSe.value + document.loginForm.username.value;
        //document.loginForm.action="<c:url value='/j_spring_security_check'/>";
        document.testForm.submit();
		}
	function actionDelete() {
		var returnIndex = chkRow;
		var returnID = $("#resID_"+returnIndex).val();
		$("#retIndex").val(returnIndex);
		$("#retID").val(returnID);
        document.testForm.action="<c:url value='/delete.do'/>";
        document.testForm.method="post";
        //document.loginForm.j_username.value = document.loginForm.userSe.value + document.loginForm.username.value;
        //document.loginForm.action="<c:url value='/j_spring_security_check'/>";
        document.testForm.submit();
		}
	function changVal(statusIndex){
			chkRow = statusIndex;
		}
	function actionVideo(){
        document.testForm.action="<c:url value='/video.do'/>";
        document.testForm.method="post";
        //document.loginForm.j_username.value = document.loginForm.userSe.value + document.loginForm.username.value;
        //document.loginForm.action="<c:url value='/j_spring_security_check'/>";
        document.testForm.submit();
		}
	function popUpVideo(){
		window.open("/view.do");
		}
</script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta http-equiv="content-language" content="ko">
<title>Insert title here</title>
</head>
<body>
	<div id="like_button_container">test</div>
	<input type="button" value="추가/수정하기" onclick="javascript:actionUpdate()"/>
	<input type="button" value="삭제하기" onclick="javascript:actionDelete()"/>
	<input type="button" value="이미지재생" onclick="javascript:actionVideo()"/>
    <form action = "/view.do" method = "get">
    	<!-- <input type="button" value="이미지 재생" onclick="javascript:actionView()"/> -->
        <input type = "submit" value = "전송">
    </form>
    <input type="button" value="팝업동영상" onclick="javascript:popUpVideo()"/>
    
	<div id="table">
		<table width="100%" border="0" cellpadding="0" cellspacing="0" summary="카테고리ID, 케테고리명, 사용여부, Description, 등록자 표시하는 테이블">
   			<colgroup>
   				<col width="40"/>
   				<col width="100"/>
   				<col width="100"/>
   				<col width="150"/>
   			</colgroup>
			<c:forEach var="result" items="${resultList}" varStatus="status">
				<tr>
					<td><input type="checkbox" id="chk" onchange="javascript:changVal('${status.index}')"/></td>
	 				<td align="center" class="listtd"><input id="resID_${status.index}" readonly="readonly" name ="resID_${status.index}" type="text" value="${result.ID}" onchange="javascript:changVal('${status.index}')"/></td>
	 				<td align="left" class="listtd" ><input type="text" id = "resNAME_${status.index}" value="${result.NAME}" onchange="javascript:changVal('${status.index}')"/></td>
	 				<td align="center" class="listtd" ><input type="text" id = "resTEAMID_${status.index}" value="${result.TEAM_ID}" onchange="javascript:changVal('${status.index}')"/></td>
	 			</tr>
	 			<c:if test="${resultList.size() eq status.count}">
	 				<td><input type="checkbox" id="chk"/></td>
	 				<td align="center" class="listtd"><input id="resID_${status.count}" name ="resID_${status.count}" type="text" value="" onchange="javascript:changVal('${status.count}')"/></td>
	 				<td align="left" class="listtd" ><input type="text" id = "resNAME_${status.count}" value="" onchange="javascript:changVal('${status.count}')"/></td>
	 				<td align="center" class="listtd" ><input type="text" id = "resTEAMID_${status.count}" value="" onchange="javascript:changVal('${status.count}')"/></td>
	 			</c:if>
 				<input type="hidden" id="resIndex" value="${status.index}"/> 
			</c:forEach>
		</table>
	</div>
	<form:form name="testForm" method="post">
		<input type="hidden" name="retID" 	id ="retID" 	value="fail"/>
		<input type="hidden" name="retNAME" 	id ="retNAME"	value="fail"/>
		<input type="hidden" name="retTEAMID" id ="retTEAMID"	value="fail"/>
		<input type="hidden" name="retIndex"  id ="retIndex"	value="fail"/>
	</form:form>
	
	
	  <!-- Load React. -->
	  <!-- Note: when deploying, replace "development.js" with "production.min.js". -->
	  <!-- <script src="https://unpkg.com/react@17/umd/react.development.js" crossorigin></script>
	  <script src="https://unpkg.com/react-dom@17/umd/react-dom.development.js" crossorigin></script> -->
	
	  <!-- Load our React component. -->
	  <script src="like_button.js"></script>
</body>
</html>