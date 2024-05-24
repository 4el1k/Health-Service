<!DOCTYPE html>
<html>
<head>
    <title>Create User</title>
</head>
<body>
<h1>Create User</h1>
<form action="/api/v1/user" method="post">
    Username: <input type="text" name="username" required><br>
    Password: <input type="password" name="password" required><br>
    Email: <input type="email" name="email" required><br>
    <button type="submit">Create User</button>
</form>
</body>
</html>
