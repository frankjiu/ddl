/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.appconfig.swagger2   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月13日上午2:06:53
 * @version V1.0
 */

package com.appconfig.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Request-URL: http://localhost:8080/swagger-ui.html
 * 
 * @author: Frankjiu
 * @date: 2020年4月13日 上午2:06:53
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.controller")).paths(
						PathSelectors
								.any())
				.build()
				.apiInfo(new ApiInfoBuilder().description("嗒嗒啦系统接口测试文档")
						.contact(new Contact("frank", "http://github.com/2309094456-frank", "xinbeijing@yeah.net")).version("v1.2")
						.title("API测试文档").license("Apache2.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0").build());

	}

}
