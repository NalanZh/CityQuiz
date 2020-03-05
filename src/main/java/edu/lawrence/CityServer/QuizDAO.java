package edu.lawrence.CityServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Joe Gregg
 */
@Repository
public class QuizDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    /*You will need to add a single method to the DAO class that takes the id 
    number of a city as its parameter and returns that City object.*/
    
public City findById(int id) {
        String sql =  "SELECT * FROM cities WHERE id=?";
        RowMapper<City> rowMapper = new CityRowMapper();
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
   
}
