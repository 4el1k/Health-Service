<!DOCTYPE html>
<html>
<head>
    <title>Update User</title>
</head>
<body>
<h1>Update User</h1>
<form action="/api/v1/user/update" method="post">
    Username: <input type="text" name="username" value="${user.username}" readonly><br>
    New Password: <input type="password" name="newPassword"><br>
    New Email: <input type="email" name="newEmail"><br>
    <button type="submit">Update</button>
</form>
</body>
</html>
