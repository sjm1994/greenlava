package kr.kro.greenlava.demo.global.config;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public GroupedOpenApi jwtAPI() {
		return GroupedOpenApi.builder()
				.group("jwt")
				.pathsToMatch("/v1/jwt/**")
				//.addOpenApiCustomizer(this.buildOpenApiBearerAuth())
				.build();
	}
	
	@Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("데모 프로젝트 API Document")
                .version("v1")
                .description("데모 프로젝트의 API 명세서입니다.");
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
	
	public OpenApiCustomizer buildOpenApiBearerAuth() {
	    return openApi -> {
	        openApi.addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"));
	        
	    };
	}
	
}
