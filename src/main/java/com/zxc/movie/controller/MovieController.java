package com.zxc.movie.controller;

import com.zxc.movie.beans.Movie;
import com.zxc.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 星驰太帅了 on 2018/05/26.
 * Movie相关类的操作,都是基于rest风格的
 */
@RestController
@RequestMapping("/movie")
public class MovieController  {

    @Autowired
    public MovieService movieService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Movie get(@PathVariable("id") Integer id) {
        return movieService.getById(id);
    }

}
