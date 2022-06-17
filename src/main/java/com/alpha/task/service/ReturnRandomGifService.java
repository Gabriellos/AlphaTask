package com.alpha.task.service;

import com.alpha.task.entity.Gif;
import com.alpha.task.entity.DataObject;
import com.alpha.task.model.GIPHYRequestParamsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ReturnRandomGifService {
    @Autowired
    GIPHYClientService GIPHYClientService;

    public String getRandomGifURL(String searchPhrase) {
        Gif request = GIPHYClientService.getGIF(GIPHYRequestParamsFactory.getParameters(searchPhrase));
        List<DataObject> embed_urls = request.getData();
        Random r = new Random();
        String url = (embed_urls.get(r.nextInt(embed_urls.size()))).getEmbed_url();
        return url;
    }
}
