package com.test.controller;
import java.util.ArrayList;
import java.util.List;

import com.test.model.Category;
import com.test.model.ModuleResult;
import com.test.model.Result;
import com.test.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository catRepo;
    
    @RequestMapping("/getAllCategory")
    @ResponseBody
    public List<Category> getAllCategory(){
        return catRepo.getAllCategory();
    }
    
    @RequestMapping("/getCategory")
    @ResponseBody
    public Category getCategory(@RequestParam("userId") int userId){
        return catRepo.getCategory(userId);
    }
    
    @RequestMapping("/getCategoryByUser")
    @ResponseBody
    public ModuleResult getCategoryByUser(@RequestParam("userId") int userId){
    	Category cat = catRepo.getCategory(userId);
    	List<Result> a = new ArrayList<Result>();
    	a.add(new Result(1, cat.getEvent1()));
    	a.add(new Result(2, cat.getEvent2()));
    	a.add(new Result(3, cat.getEvent3()));
    	a.add(new Result(4, cat.getEvent4()));
    	a.add(new Result(5, cat.getEvent5()));
    	ModuleResult mr = new ModuleResult();
    	mr.setModules(a);
    	return mr;
    }
    
   
}