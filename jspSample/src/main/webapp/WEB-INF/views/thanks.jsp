<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 完了画面　nameのみ受け取り表示 -->
<% String name = (String)session.getAttribute("name"); %>>    

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/styles.css">
<meta charset="UTF-8">
<!--  <title>Insert title here</title>-->
</head>
<body>
<main class="page-main page-other">
	<header class="page-header-other">
		<h1>お問い合わせ完了</h1>
	</header>

	<div class="container">
		<div class="other-container">
			<p>この度は、お問い合わせありがとうございました。<br>
				<b><%= name %>様</b>からのお問い合わせを受付けました。<br>
				内容を確認後に、ご返答させていただきます。<br>
				また、状況により、ご返答が数日、遅れてしまう場合がございますことをご了承ください。<br>
				今後ともどうぞよろしくお願いいたします。<br><br>
			</p>
			<div style="text-align: center;">
				<a href="top" class="contact-button">TOPページへ戻る</a>
			</div>
		</div>
	</div>
</main>

</body>
</html>