package com.example.factorypattern.usecase;

import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

@Service("ContentDocImpl")
public class ContentDocImpl implements ContentService {
    @Override
    public String read() {
        return "Your content is Doc file";
    }
}
