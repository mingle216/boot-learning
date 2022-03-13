package com.mingle.boot.restful.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author mingle
 * @date 2022/3/10 19:03
 * @description
 */
@Data
@Builder
public class Reader {
    private String name;
    private Integer age;
}
