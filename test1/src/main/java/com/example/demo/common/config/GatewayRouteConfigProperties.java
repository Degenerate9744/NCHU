package com.example.demo.common.config;

/**
 * @ClassName：GatewayRouteConfigProperties
 * @Author：Acmsdy
 * @Date：2023-11-30 19:48
 * @Describe：
 */

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "gateway.routes.config")
@Component
@Data
public class GatewayRouteConfigProperties {

    private String dataId;

    private String group;

    private String namespace;
}


