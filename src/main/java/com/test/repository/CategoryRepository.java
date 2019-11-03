package com.test.repository;

import com.test.model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CategoryRepository {

    @Autowired
    JdbcTemplate template;

//    /*Getting all Items from table*/
    public List<Category> getAllCategory(){
        List<Category> items = template.query("select id, event1, event2, event3, event4, event5 from category_user",(result,rowNum)->new Category(result.getInt("id"),
                result.getString("event1"),result.getString("event2"), result.getString("event3"), result.getString("event4"), result.getString("event5")));
        return items;
    }
//    /*Getting a specific item by item id from table*/
    public Category getCategory(int userId){
        String query = "SELECT * FROM CATEGORY_USER WHERE ID=?";
        Category category = template.queryForObject(query,new Object[]{userId},new BeanPropertyRowMapper<>(Category.class));

        return category;
    }
    
    

}
