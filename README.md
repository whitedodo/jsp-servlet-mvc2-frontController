# Jsp/Servlet MVC2 - FrontController 패턴 적용하기
JSP/Servlet와 FrontController 디자인패턴을 적용한 MVC2 프로젝트

### 기본 정보(Information)
##### 제작일자(Create date): 2020-09-19 ~ 2020-09-20
##### 작성언어(Write language): Java
##### IDE: Eclipse IDE with Spring Tool Suite 4-4.7.2.
##### 웹 서버(Web Server): Apache Tomcat 9
##### 데이터베이스: VO설계만 하였음. (DB적용 모형만 작성) // VO design only. (Create DB application model only)
##### 제작자(Author): 도도(Dodo) / rabbit.white at daum dot net
##### 프레임워크(Framework): 

### 1. 소개(Description)
##### 1. MVC2 프로젝트를 알기 쉽게 이해하기 위해 만든 프로젝트이다.
##### (This project was created to make the MVC2 project easy to understand.)
##### Controller 작업에 대한 것이다. (It's about "Controller" work.)
##### 2. web.xml을 FrontController에 대해서 설정한다.
##### (Set web.xml for FrontController.)
##### 3. servlet으로 FrontController를 만들 때 init, service함수를 만든다.
##### (When making FrontController with servlet, make init and service functions.)
##### 4. 인터페이스 "Controller"를 설계하는데, 영향되는 부분은 예를 들면, AddressInsertController, AddressListController가 될 수 있다.
##### (Designing an interface "Controller", the affected part can be, for example classes, "AddressInsertController", "AddressListController".)
##### 5. Controller 내에 함수원형은 void execute(HttpServeltRequest, HttpServeltResponse)이다.
##### (The prototype of the function in the controller is void execute(HttpServeltRequest, HttpServeltResponse).)
##### 6. HttpUtil이라는 클래스를 만드는데 사용 목적은 DispatcherRequest를 통해서 웹페이지를 출력해주기 위해서이다.
##### (The purpose of creating a class called HttpUtil is to display a web page through DispatcherRequest.)
##### 7. "FrontController.java" 코드를 작성한다.
##### (Develop "FrontController.java" code.)
##### View 작업에 대한 것이다. (It's about "View" work.)
##### 8. jsp 파일을 생성하고 편집한다.
##### Model 작업에 대한 것이다. (It's about "Model" work.) - 선택사항(options)
##### 9. VO(Value Object) 객체 설계, Service 인터페이스 및 클래스 설계, DAO 구현 순서대로 진행한다. 
##### (VO(Value Object) object design, Service interface and class design, DAO implementation in order.)

### 2. 결론(Conclusion)
##### MVC 프로젝트를 구성하는데 필요한 기본적인 기능에 대해서 정리하였다.
##### (The basic functions necessary to compose the MVC project are summarized.)

### 3. 시연(Demonstration)

### 4. 참고자료(Reference)
##### 1. Spring | Tools, https://spring.io/tools, Accessed by 2020-09-20, Last Modified .
##### 2. OpenJDK, https://openjdk.java.net/, Accessed by 2020-09-20, Last Modified .
##### 3. Apache Tomcat - Welcome!, http://tomcat.apache.org/, Accessed by 2020-09-20, Last Modified .
