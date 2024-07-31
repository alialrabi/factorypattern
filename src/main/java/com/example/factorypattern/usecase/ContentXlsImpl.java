package com.example.factorypattern.usecase;

import com.example.factorypattern.service.ContentService;
import org.springframework.stereotype.Service;

@Service("ContentXlsImpl")
public class ContentXlsImpl implements ContentService {

    @Override
    public String read() {
        return "Your content is Xls file";
    }
}
