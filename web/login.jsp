<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <%@ include file="meta.jsp" %>
    <title>Login | Food Xpress</title>
</head>
<body>
<div class="wrapper">
    <%@ include file="welcome-header.jsp" %>
    <main class="welcome-main">
        <section class="container login-box">
            <h4 class="text-center">Login</h4>
            <hr />
            <form method="post" action="login-servlet">
                <div class="form-group">
                    <label class="label" for="login-username">Username</label>
                    <input type="text" name="username" class="form-control" placeholder="Enter username" id="login-username" required>
                </div>
                <div class="form-group">
                    <label class="label" for="login-password">Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Enter password" id="login-password" required>
                </div>
                <div class="container-footer-right">
                    <button type="submit" class="btn">Login</button>
                </div>
            </form>
        </section>
    </main>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>

