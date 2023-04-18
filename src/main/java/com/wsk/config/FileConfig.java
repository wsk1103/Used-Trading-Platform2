package com.wsk.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author sk
 * @date 2023/4/18
 */
@Configuration
@Getter
public class FileConfig {

    @Value("${my.file.save}")
    private String fileSave;

}
