<!DOCTYPE html>
<html>
<head>
    <title>Recipes List</title>
</head>
<body>
<h1>Recipes</h1>
<ul>
    <#list recipes as recipe>
        <li>
            <a href="/api/v1/recipe/findById/${recipe.id}">${recipe.title}</a>
        </li>
    </#list>
</ul>
</body>
</html>
