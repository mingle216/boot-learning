package com.mingle.boot.restful.controller;

import com.mingle.boot.restful.common.AjaxResponse;
import com.mingle.boot.restful.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.mingle.boot.restful.model.Reader;

import java.util.Date;
import java.util.List;

/**
 * @author mingle
 * @date 2022/3/10 16:31
 * @description ArticleController
 */
@RestController
@Slf4j
@RequestMapping("/api/v1/")

public class ArticleController {

    /**
     * 获取一篇Article，使用GET方法,根据id查询一篇文章
     *
     * @param id id
     * @return AjaxResponse
     */
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        List<Reader> readerList = List.of(Reader.builder().name("aaa").age(13).build(),Reader.builder().name("bbb").age(13).build());
        Article article = Article.builder().id(id).author("hmm").content("SpringBoot 从青铜到王者").title("SpringBoot").createTime(new Date()).build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }


    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (article.getId() == null) {
            log.error("没有id");
            //article.id是必传参数，因为通常根据id去修改数据
        }
        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }
    @PostMapping("/articles/body")
/*    public AjaxResponse saveArticle(@RequestParam String author, @RequestParam String title, @RequestParam String content, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @RequestParam Date createTime) {
        log.info("saveArticle:" + author);
        log.info("saveArticle:" + title);
        log.info("saveArticle:" + content);
        log.info("saveArticle:" + createTime);
        return AjaxResponse.success();
    }*/
    public AjaxResponse saveArticle(@RequestParam String article) {
        log.info("saveArticle:" + article);
        return AjaxResponse.success();
    }
    /**
     * 删除一篇Article，使用DELETE方法，参数是id
     *
     * @param id id
     * @return AjaxResponse
     */
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }
}
