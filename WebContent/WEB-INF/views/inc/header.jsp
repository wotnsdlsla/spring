<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
		<div id="header">
	   <div class="content-container">
	      <heade>
	      <%-- 앞에 ${ctx} 붙으면 절대경로 표시 --%>
	
	
	            <h1 id="logo">
	            	<img src="${ctx}images/logo.png" alt="뉴렉처 온라인">
	            </h1>
	            
			 <section>
    			<h1>헤더</h1>
    			
	            <nav id="main-menu">
	               <h1>메인 메뉴</h1>
	               <ul>
	                  <li><a href="">학습가이드</a></li>
	                  <li><a href="">뉴렉과정</a></li>
	                  <li><a href="">강좌선택</a></li>
	               </ul>
	            </nav>
	
	
	            <section id="search-form">
	               <h1>강좌검색 폼</h1>
	               <form>
	                  <fieldset>
	                     <legend>과정검색 필드</legend>
	                     <label>강좌검색</label>
	                     <input type="text" value="kor eng" /> 
	                     <input type="submit" value="" />
	                  </fieldset>
	               </form>
	            </section>
	
	            <nav id="member-menu">
	               <h1>회원메뉴</h1>
	               <ul>
	                  <li><a href="${ctx}/index">HOME</a></li>
	                  
	                  <c:if test="${empty sessionScope.mid}">
	                  <li><a href="${ctx}/joinus/login">로그인</a></li>
	                  </c:if>
	                  <c:if test="${not empty sessionScope.mid}">
	                  <li><a href="${ctx}/joinus/logout">로그아웃</a></li>
	                  </c:if>
	                  <li><a href="${ctx}/joinus/agree">회원가입</a></li>
	               </ul>
	            </nav>
	
	            <nav id="custom-menu">
	               <h1>고객메뉴</h1>
	               <ul>
	                  <li><img src="${ctx}images/txt-mypage.png" alt="마이페이지"></li>
	                  <li><a href="${ctx}/customer/notice"><img src="${ctx}images/txt-customer.png" alt="고객센터"></a></li>
	               </ul>
	            </nav>
	         </section>
	      </header>
	      </div>
      </div>