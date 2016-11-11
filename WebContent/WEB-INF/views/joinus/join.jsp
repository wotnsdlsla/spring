<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

      <main>
         <h2>이건 조인페이지야.</h2>
         <form action="join" method="post">
            <fieldset> 
            <legend>회원정보</legend>
            <c:if test="${not empty errorMsg}">
            <div style="border:1px solid red">
            ${errorMsg}
            </div>
                </c:if>
               <table>
                  <tbody>
                     <tr>
                        <th><label>아이디</label></th>
                        <td>
                           <input name="mid" />
                           <input type="submit" name="btn" value="중복확인">
                           <span>${duplicatedResult}</span>
                        </td>
                     </tr>
                     <tr>
                        <th><label>비밀번호</label></th>
                        <td><input name="pwd" /></td>
                     </tr>
                     <tr>
                        <th>비밀번호 확인</th>
                        <td><input name="ppwd" /></td>
                     </tr>
                     <tr>
                        <th>이름</th>
                        <td><input name="name" /></td>
                     </tr>
                     <tr>
                        <th><label>필명</label></th>
                        <td><input name="nickname" /></td>
                     </tr>
                     <tr>
                        <th><label>성별</label></th>
                        <td>
                           <select name="gender">
                              <option>선택</option>
                              <option>남성</option>
                              <option>여성</option>
                        </td>
                     </tr>
                     <tr>
                        <th><label>생년월일</label></th>
                        <td>
                           <input name="y"/>년<input name="m" />월<input name="d"/>일
                           <input type="radio" name="sun" />양력
                           <input type="radio" name="moon" />음력
                        </td>
                     </tr>
                     <tr>
                        <th><label>핸드폰번호</label></th>
                        <td><input name="phone" /></td>
                     </tr>
                     <tr>
                        <th><label>이메일</label></th>
                        <td><input name="email" /></td>
                     </tr>
                     <tr>
                        <th><label><input type="submit" name="btn" value="확인" /></label></th>
                     </tr>
                  </tbody>
               </table>
            </fieldset>
         </form>
      </main>