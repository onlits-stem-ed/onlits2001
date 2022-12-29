using System.Data.SqlClient;
class DatabaseExample
{
    static void Main()
    {
        MysqlConnection con = new MysqlConnection("server=localhost; database=school; uid=test; pass=test");
    }
}

/*
    Not able to get reference for MySQLConnection Class
*/