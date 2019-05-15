package DAO;



import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import connection.ConnectionFactory;
import entity.Password;

public class PasswordDAO {

	protected static final Logger LOGGER = Logger.getLogger(PasswordDAO.class.getName());
	private static final String insertStatementString ="Insert into Password (grade1,grade2,grade3)" + " values (?,?,?)";
	private final static String findStatementString = "SELECT * FROM Password where id = ?";
	private final static String deleteStatementString = "DELETE FROM Password where id = ?";
	//private final static String updateStatementString = "UPDATE student set name = ?, email = ? WHERE id = ?";
	private final static String viewAllStatementString = "SELECT * FROM Password";


	public List<Password> createObjects(ResultSet rs) 
	{
		// TODO Auto-generated method stub
		List<Password> list = new ArrayList<Password>();
		try {
			while(rs.next())
			{
				//Password s = new Password(rs.getInt("idPassword"),rs.getInt("Grade1"),rs.getInt("Grade2"),rs.getInt("Grade3"));
        		//list.add(s);
			} 
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}  catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;
	}
	public List<Password> ViewAll() throws IllegalArgumentException, IllegalAccessException {
        Connection dbConnection = ConnectionFactory.getConnection();
        PreparedStatement  viewAllStatement = null;
        ResultSet rs = null;
        List<Password> list = new ArrayList<Password>();
        try {
        	viewAllStatement = dbConnection.prepareStatement(viewAllStatementString);
        	rs = viewAllStatement.executeQuery();
        	
        	return createObjects(rs);
        }catch(SQLException e)
        {
        	
        }finally
        {
        	ConnectionFactory.close(rs);
        	ConnectionFactory.close(viewAllStatement);
        	ConnectionFactory.closeConnection(dbConnection);
        }
        return null;
    }
	public String[][] viewAllContent(List<Password> objects) throws IllegalArgumentException, IllegalAccessException
	{
		String[][] values = new String[objects.size()][1000];
		int coloana = 0;
		int rand = 0;
		for(Password t:objects)
		{
			coloana = 0;
			for(Field field:t.getClass().getDeclaredFields())
			{
				field.setAccessible(true);
				values[rand][coloana++] = ""+field.get(t);
			}
			rand = rand + 1;
		}
		
		return values;
	}
	
}