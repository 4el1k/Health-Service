<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
<h1>User Details</h1>
<p><strong>Username:</strong> ${user.username}</p>
<p><strong>Email:</strong> ${user.email}</p>
<a href="/user/update">Update My Profile</a><br>
<form action="/api/v1/user/delete" method="post">
    <button type="submit">Delete My Profile</button>
</form>
</body>
</html>
