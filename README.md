# Community

## Documents
[Spring手册](https://spring.io/guides/)  
[SpringWeb](https://spring.io/guides/gs/serving-web-content/)  
[Template](https://elasticsearch.cn/explore/)  
[新建GitHubSSH](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[Bootstrap使用手册](https://v3.bootcss.com)  
[GitHub登陆API](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
## Tools
[Git](https://git-scm.com)  
[Visual-Paradigm](https://www.visual-paradigm.com)  
[Flyway](https://flywaydb.org)  
[Lombok](https://projectlombok.org)

## 脚本
```sql
CREATE TABLE USER
(
    ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);
```
```sql
CREATE USER IF NOT EXISTS edlison PASSWORD '123';
ALTER USER edlison admin true ;
```
```
//H2数据库脚本变更
mvn flywat:migarate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```