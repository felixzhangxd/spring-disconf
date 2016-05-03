package com.redstar.spring.disconf.conf;


import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.stereotype.Component;

@Component
@DisconfFile(filename = "user.properties", copy2TargetDirPath = "disconf")
public class Configuration {
    private String name;

    @DisconfFileItem(name = "name", associateField = "name")
    public String getName() {
        return name;
    }
}
