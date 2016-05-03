package com.redstar.spring.disconf.callback;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.redstar.spring.disconf.conf.Configuration;
import org.springframework.stereotype.Component;

/**
 * Configuration.java文件中
 * @DisconfFile(filename = "user.properties", copy2TargetDirPath = "disconf"): user.properties变便时
 * reload()
 */
@Component
@DisconfUpdateService(classes = {Configuration.class})
public class ConfigurationCallback implements IDisconfUpdate {
    @Override
    public void reload() throws Exception {
        System.out.println("ConfigurationCallback.reload()");
    }
}
