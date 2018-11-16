<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${page.deptlist}" var="x">
    ${x.deptname} | ${x.deptpwd}
    <br>
</c:forEach>
<br>
<a href="/page?index=1">首页</a>
<a href="/page?index=${page.index - 1}">上一页</a>
<a href="/page?index=${page.index + 1}">下一页</a>
<a href="/page?index=${page.totalPages}">尾页</a>
<br>
<span>当前第${page.index}页</span>|<span>共${page.totalPages}页</span>
</body>
</html>