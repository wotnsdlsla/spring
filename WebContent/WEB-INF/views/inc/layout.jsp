<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="s" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
<link href="${ctx}/resource/customer/css/layout.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/resource/customer/css/<tiles:getAsString name="css"/>" type="text/css" rel="stylesheet" />
<script src="${ctx}/resource/js/modernizr-custom.js">
</head>
<body>
   <!------------------ <header> -------------------->
       <tiles:insertAttribute name="header" />

      <!----------------- <body> --------------------->
      <div id="body">
         <div class="content-container clearfix">

         </div>
      </div>
   <!------------------ footer -------------------->
     <tiles:insertAttribute name="footer" />
</body>
</html>