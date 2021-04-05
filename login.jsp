<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="regbox box">
			
			<h1>LOG IN</h1>
			<form action="login" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required>
					 <input type="submit" value="Login"> <a
					href="register.jsp">Don't have an account?</a>
					
			</form>
		</div>
	</div>
</body>
</html>
