package com.jpa.jpapower.article.controller;

import com.jpa.jpapower.article.entity.Article;
import com.jpa.jpapower.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author liugang
 * @create 2018/12/4 15:56
 **/
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/admin/article")
    public ModelAndView listUser(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                 @RequestParam(value = "size",defaultValue = "10")Integer size){
        ModelAndView mav = new ModelAndView();
        PageRequest request = PageRequest.of(page-1,size);
        Page<Article> articlePage = articleService.findAll(request);
        mav.addObject("articlePage",articlePage);
        mav.setViewName("/admin/article/list");
        return mav;
    }
}
