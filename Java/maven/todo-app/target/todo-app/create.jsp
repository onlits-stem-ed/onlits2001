<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Todo Item</title>
</head>

<body>
    <h1>New Todo Item</h1>
    <p><a href="index.jsp">Home</a></p>
    <form action="/todo-app/todo-create" method="post">
        <div>
            <label for="Description">Description</label>
            <input type="text" name="description" id="description"> <br>
            <button>Submit</button>
        </div>
    </form>
</body>

</html>