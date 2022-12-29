<!DOCTYPE html>
<html>

<head>
    <title>Doctor Registration</title>
</head>

<body>
    <header>
        <div>
            <?php include 'Header.php';?>
        </div>
    </header>
    <h1>Doctor Registration</h1>
    <form action="NewDoctorConnect.php" method="POST">
        <label for="TxtDoctorName">Doctor Name</label>
        <input type="text" name="TxtDoctorName">
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
    <footer>
        <div>
            <?php include 'Footer.php';?>
        </div>
    </footer>
</body>

</html>