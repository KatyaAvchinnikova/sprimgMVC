package ru.springCourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.springCourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.tree.TreePath;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setAge(resultSet.getInt("age"));
        person.setEmail(resultSet.getString("email"));
        //branch from master

        return person;
    }

}
