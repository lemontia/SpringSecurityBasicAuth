# [SpringSecurity] 인증 실패 시 핸들링 하는 법.

스프링시큐리티로 Authorization인증을 할 때 ID와 Password 인증이 실패할 때 쓰입니다.

Config Server 구성하는데 서버정보를 가져올 때 보안을 위해 인증과정을 거치게 했습니다. 
문제는 이런서버는 로그인 페이지가 있으면 안된다고 판단했기 때문에 요청이 올때(GET으로 요청함) Auth에 username과 password를 보내 인증과정을 통과해야 한다고 판단했습니다. 

---

**관련된 파일은 다음과 같습니다.**
- 의존관계 설정 => build.gradle
- security username, password 설정 => application.yml
- AuthenticationEntryPoint 를 구현한 클래스 => CustomAuthenticationEntryPoint.java
- WebSecurityConfigurerAdapter 를 구현한 클래스 => SecurityConfig.java
- 테스트할 컨트롤러 => DefaultController.java
- 에러처리 컨트롤러 => ErrorHandlerController.java

