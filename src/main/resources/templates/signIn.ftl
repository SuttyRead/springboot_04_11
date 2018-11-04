<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/styles.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
    <title>Document</title>
</head>
<body>

<#if error??>
<div class="alert alert-danger" role="alert">Логин или пароль введены неверно</div>
</#if>

<h1>Sign In</h1>

<form action="/signIn" method="post">

    <label>Username
        <input type="text" name="username"> <br>
    </label> <br>
    <label>Password
        <input type="password" name="password"> <br>
    </label> <br>


        <label>Remember me:
    <input type="checkbox" name="remember-me" />
</label> <br>

    <input type="submit" value="Sign In"> <br>

</form>

</body>
</html>