package com.example.factorypattern.configurations;

import com.example.factorypattern.enums.ContentEnum;
import com.example.factorypattern.service.ContentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    @Bean
    public Map<ContentEnum, ContentService> getContentType(
            @Qualifier("ContentDocImpl") ContentService contentDocImpl,
            @Qualifier("ContentExcelImpl") ContentService contentExcelImpl,
            @Qualifier("ContentPdfImpl") ContentService contentPdfImpl,
            @Qualifier("ContentXlsImpl") ContentService contentXlsImpl,
            @Qualifier("ContentOtherImpl") ContentService contentOtherImpl
    ) {
        Map<ContentEnum, ContentService> map = new HashMap<>();
        map.put(ContentEnum.DOC, contentDocImpl);
        map.put(ContentEnum.EXCEL, contentExcelImpl);
        map.put(ContentEnum.PDF, contentPdfImpl);
        map.put(ContentEnum.XLS, contentXlsImpl);
        map.put(ContentEnum.OTHER, contentOtherImpl);

        return map;
    }

}
