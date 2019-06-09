class 
{
connection con=null;
get connection ()
{ Class.forName("oracle.jdbc.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

}
execute Update()
{
if(con=null){
get connection meatrhod call;
}
con.execute Update()
}
execute query()
{
if(con =null)
}
execute query;
}
close connection()
{
if(con!=null)
{
con.close();
}