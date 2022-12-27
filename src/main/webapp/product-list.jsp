<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
<title>UrbanEasy</title>
</head>
<body>
<h1 class="bg-red-500 border">Hello world</h1>
<div class="flex">
	<c:forEach var="product" items="${productList}">
	<a class="flex flex-col" href="product-detail">
	<img src="https://a0.muscache.com/im/pictures/8301bc54-88f5-4f22-a9bd-a28cdd6f3985.jpg?im_w=720" class="w-60 h-60 rounded-md"/>
	<p class="text-slate-800"><c:out value="${product.district}, ${product.city}"/></p>
	<div class="flex space-x-1">
	<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor" class="w-6 h-6">
  <path fill-rule="evenodd" d="M10.788 3.21c.448-1.077 1.976-1.077 2.424 0l2.082 5.007 5.404.433c1.164.093 1.636 1.545.749 2.305l-4.117 3.527 1.257 5.273c.271 1.136-.964 2.033-1.96 1.425L12 18.354 7.373 21.18c-.996.608-2.231-.29-1.96-1.425l1.257-5.273-4.117-3.527c-.887-.76-.415-2.212.749-2.305l5.404-.433 2.082-5.006z" clip-rule="evenodd" />
</svg>
	
	<p class="text-slate-800"><c:out value="${product.stars}"/></p>
	</div>
	</a>

</c:forEach>
</div>



</body>
</html>