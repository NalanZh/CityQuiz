package edu.lawrence.CityServer;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Joe Gregg
 */
public class CityRowMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet row, int rowNum) throws SQLException {
        City c = new City();
        c.setId(row.getInt("id"));
        c.setCapital(row.getString("capital"));
        String choices[] = new String[6];
        choices[0]=row.getString("choice1");
        choices[1]=row.getString("choice2");
        choices[2]=row.getString("choice3");
        choices[3]=row.getString("choice4");
        choices[4]=row.getString("choice5");
        choices[5]=row.getString("choice6");
        c.setChoices(choices);
        c.setAnswer(row.getInt("answer"));
        return c;
    }
}
