package com.zh.heima.model.common.dtos;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhouhui
 * @version 1.0
 * @description  处理页面跟页面数据的大小
 * @date 2025/12/31 14:06
 */

@Data
@Slf4j
public class PageRequestDto {

    protected Integer size;
    protected Integer page;

    public void checkParam() {
        if (this.page == null || this.page < 0) {
            setPage(1);
        }
        if (this.size == null || this.size < 0 || this.size > 100) {
            setSize(10);
        }
    }
}
