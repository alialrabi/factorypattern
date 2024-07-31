package com.example.factorypattern.usecase;

import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

@Service("ContentOtherImpl")
public class ContentOtherImpl implements ContentService {
    @Override
    public String read() {
        return "Your content is unknown file";
    }
}
