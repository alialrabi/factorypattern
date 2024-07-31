package com.example.factorypattern.usecase;

import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

@Service("ContentExcelImpl")
public class ContentExcelImpl implements ContentService {
    @Override
    public String read() {
        return "Your content is Excel file";
    }
}
