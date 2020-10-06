package edu.xja.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class KaptchaConfig {
    private static Properties props = new Properties();

    @Bean
    public DefaultKaptcha defaultKaptcha() throws Exception {
        // 创建DefaultKaptcha对象
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();

        // 读取配置文件
        try {
            props.load(KaptchaConfig.class.getClassLoader()
                    .getResourceAsStream("kaptcha.properties"));
        }catch (Exception e) {
            e.printStackTrace();
        }

        // 将Properties文件设到DefaultKaptcha对象中
        defaultKaptcha.setConfig(new Config(props));
        return defaultKaptcha;
    }

}