package com.example.factorypattern;

import com.example.factorypattern.enums.ContentEnum;
import com.example.factorypattern.service.ContentService;
import com.example.factorypattern.service.factory.FactoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class ContentController {

    private final FactoryService factoryService;
    private final Map getContentType;

    public ContentController(FactoryService factoryService, Map getContentType) {
        this.factoryService = factoryService;
        this.getContentType = getContentType;
    }

    @GetMapping("/read")
    public String read(@RequestParam("type") int type){
         return factoryService.readFile(type);
    }

}
