<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board List</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<style type="text/css">
a{
 text-decoration: auto;
}
</style>
</head>
<body>
    <br/>
    <h1 class="text-center">Board List</h1>
    <br/>
    <br/>
    <div class="container">
        <table class="table table-hover table-striped text-center" style="border:1px solid;">
            <colgroup>
                <col width="10%" />
                <col width="50%" />
                <col width="20%" />
                <col width="20%" />
            </colgroup>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>등록일자</th>
                </tr>
            </thead>
 
            <tbody>
            <c:forEach items="${list }" var="result">
                <tr>
                    <td>${result.testId}</td>
                    <td><a href="testDetail.do?testId=${result.testId}">${result.testTitle}</a></td>
                    <td>${result.testName}</td>
                    <td>${result.testDate}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <hr/>
        <div>
            <ul class="pagination justify-content-center">
                <li><a href="#" style="margin-right:5px;" class="text-secondary">◀</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">1</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">2</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">3</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">4</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">5</a></li>
                <li><a href="#" style="margin-right:5px;" class="text-secondary">▶</a></li>
            </ul>
        </div>
        <a class="btn btn-outline-info" style="float:right" href="testRegister.do">글쓰기</a>
    </div>
    <br>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
</body>
</html>

