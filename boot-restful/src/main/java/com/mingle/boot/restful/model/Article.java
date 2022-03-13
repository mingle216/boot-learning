package com.mingle.boot.restful.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author mingle
 * @date 2022/3/10 16:28
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value = {"content", "title"})

public class Article {
    //@JsonIgnore
    private Long id;
    @JsonProperty("writer")
    private String author;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private Date updatedTime;
    private List<Reader> readerList;
}
