package com.alpha.task.service;

import com.alpha.task.entity.Gif;
import com.alpha.task.model.GiphyGetParameters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "giphyAPI", url = "${giphyAPI.api.baseurl}")
public interface GIPHYClientService {
    @GetMapping("/search")
    public Gif getGIF(@SpringQueryMap GiphyGetParameters parameters);
}
