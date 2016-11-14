<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" tagdir="/WEB-INF/tags" %>
  
   <main>
      <h2 class="main-title">공지사항</h2>
         <div id = "breadcrumb">
            <h3 class="hidden">경로(빵쪼가리)</h3>
            <ul>
               <li><img src="../images/icon-home.png" alt="home" />home</li>
               <li>고객센터</li>
               <li>공지사항</li>
            </ul>
         </div>
         <div>
            <h3 class="hidden">공지사항 검색폼</h3>
            <form action="notice" method="get">
               <fieldset> <select name="t">
                  <option value="none">분류선택</option>
         
                  <c:if test="${param.t=='title' }">
                     <option value="title" selected="selected">제목</option>
                  </c:if>
                  <c:if test="${param.t!='title' }">
                     <option value="title">제목</option>
                  </c:if>
         
                  <c:if test="${param.t=='content' }">
                     <option value="content" selected="selected">내용</option>
                  </c:if>
                  <c:if test="${param.t!='content' }">
                     <option value="content">내용</option>
                  </c:if>
         
                  <c:if test="${param.t=='writer' }">
                     <option value="writer" selected="selected">작성자</option>
                  </c:if>
                  <c:if test="${param.t!='writer' }">
                     <option value="writer">작성자</option>
                  </c:if>
               </select> 
               <label class="hidden">검색어</label> 
               <input name="q" value="${param.q}" /> <!-- header와   request에있는 애들 뽑아올수있음.    request.getParamter("q") -->
               <input type="submit" value="검색" /> 
               </fieldset>
            </form>
         </div>
         <div class="table-container">
            <h3 class="hidden">공지사항목록</h3>
            <table class="table">
               <thead>
                  <tr>
                     <td>번호</td>
                     <td>제목</td>
                     <td>작성자</td>
                     <td>작성일</td>
                     <td>조회수</td>
         
                  </tr>
               </thead>
               <tbody>
                  <c:forEach var="n" items="${list}">
                     <tr>
                        <td>${n.code}</td>
                        <td><a href="notice-detail?code=${n.code}">${n.title}</a></td>
                        <td>${n.writer}</td>
                        <td><fmt:formatDate pattern="yyyy-MM-dd" value="${n.regDate}" />
                        </td>
                        <td>${n.hit}</td>
                     </tr>
                  </c:forEach>
               </tbody>
            </table>
            <div>
               <a href="notice-reg">글쓰기</a>
            </div>
         </div>
      
         <div>
            <h3>페이저</h3>
            <s:pager />
         </div>
   </main>