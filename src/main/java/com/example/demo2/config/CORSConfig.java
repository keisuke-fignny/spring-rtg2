package com.example.demo2.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //.allowedOrigins("*") // すべてのオリジンからのリクエストを許可する場合
                .allowedOriginPatterns("*") // すべてのオリジンからのリクエストを許可する場合
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッドを指定
                .allowedHeaders("*") // すべてのリクエストヘッダーを許可する場合
                .allowCredentials(true) // クライアントからのCookieを受け付ける場合
                .maxAge(3600); // オプション: プリフライトリクエストの結果をキャッシュする時間（秒）
    }
}
