package com.mingle.boot.restful.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static
org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
public class ArticleControllerTest {
    private static MockMvc mockMvc;

    //在所有测试⽅法执⾏之前进⾏mock对象初始化
    @BeforeAll
    static void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new
                ArticleController()).build();
    }

    //测试⽅法
    @Test
    public void saveArticle() throws Exception {
        String article = """
                {
                     "id": 1,
                     "author": "hmm",
                     "title": "SpringBoot",
                     "content": "SpringBoot",
                     "createTime": "2022-03-12 12:12:12",
                     "readerList":[{"name":"aaa","age":18},
                     {"name":"bbb","age":20}]
                }""";
        MvcResult result = mockMvc.perform(
                        MockMvcRequestBuilders
                                .request(HttpMethod.POST, "/api/v1/articles/body")
                                .contentType("application/json")
                                .content(article)
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                //HTTP:status 200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("hmm"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.readerList[0].age").value(18))
                .andDo(print())
                .andReturn();
        result.getResponse().setCharacterEncoding("UTF-8");
        log.info(result.getResponse().getContentAsString());
    }
}