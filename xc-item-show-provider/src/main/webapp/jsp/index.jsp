<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
添加商品信息
<form method="post" action="/addorup">
    商品ID  :<input type="text" name="pid">
    商品名称:<input type="text" name="name">
    商品类型:<input type="text" name="catalog_name">
    商品价格:<input type="text" name="price">
    商品type:<input type="text" name="type">
    商品描述:<input type="text" name="description">
    图片信息:<input type="text" name="picture">
    <input type="submit" value="提交">
</form>
修改商品信息
<form method="post" action="/addorup">
    商品ID  :<input type="text" name="pid">
    商品名称:<input type="text" name="name">
    商品类型:<input type="text" name="catalog_name">
    商品价格:<input type="text" name="price">
    商品type:<input type="text" name="type">
    商品描述:<input type="text" name="description">
    图片信息:<input type="text" name="picture">
    <input type="submit" value="提交">
</form>
删除商品信息根据一个ID
<form method="post" action="/del">
    商品ID  :<input type="text" name="a">
    <input type="submit" value="提交">
</form>
删除商品信息根据多个ID
<form method="post" action="/deltwo">
    商品ID  :<input type="text" name="a">
    商品ID  :<input type="text" name="b">
    商品ID  :<input type="text" name="c">
    <input type="submit" value="提交">
</form>
删除商品信息根据指定属性查询
<form method="post" action="/delthree">
    商品名称 :<input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>