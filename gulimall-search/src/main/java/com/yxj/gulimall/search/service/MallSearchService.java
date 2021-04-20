package com.yxj.gulimall.search.service;

import com.yxj.gulimall.search.vo.SearchParam;
import com.yxj.gulimall.search.vo.SearchResult;

public interface MallSearchService {
    SearchResult search(SearchParam param);
}
