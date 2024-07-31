package com.example.factorypattern.service.factory;

import com.example.factorypattern.enums.ContentEnum;
import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FactoryService {

    private final Map<ContentEnum, ContentService> contentServiceMap;

    public FactoryService(Map<ContentEnum, ContentService> contentServiceMap) {
        this.contentServiceMap = contentServiceMap;
    }

    public String readFile(int type){
        ContentEnum contentEnum;
        switch (type){
            case 1:
                contentEnum=ContentEnum.DOC;
                break;
            case 2:
                contentEnum=ContentEnum.PDF;
                break;
            case 3:
                contentEnum=ContentEnum.XLS;
                break;
            case 4:
                contentEnum=ContentEnum.EXCEL;
                break;
            default:
                contentEnum=ContentEnum.OTHER;
        }
        ContentService contentService=getContentService(contentEnum);
        return contentService.read();
    }


   private ContentService getContentService(ContentEnum contentEnum){
      return contentServiceMap.get(contentEnum);
    }




}
