package com.example.factorypattern.usecase;

import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

@Service("ContentPdfImpl")
public class ContentPdfImpl implements ContentService {
    @Override
    public String read() {
        return "Your content is Pdf file";
    }
}
