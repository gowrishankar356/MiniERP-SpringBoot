package com.minierp.minierp.DO;
import com.minierp.minierp.model.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDO {
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Autowired
    private JdbcTemplate jdbc;
    public int createPerson(Person person){
        String sql = "Insert into person(title, firstName, lastName, gender, dateofbirth, datecreated, createdby) values(?, ?, ?,?, ?, ?, ?);";
        try {
             int personid = jdbc.update(sql, person.getTitle(), person.getFirstname(), person.getLastname(), person.getGender(), person.getDateofbirth(), person.getDatecreated(), person.getCreatedby());
                return personid;
        }catch (Exception e){
            System.out.println(e);
        }
        return -1;
    }
}
