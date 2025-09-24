# billeasy.store
[사이트 바로가기](https://billeasy.store/) | [관리자 페이지](https://billeasy.store/admin)


가전·가구 렌탈, 판매, 양도/양수 기능을 통합한 웹 플랫폼 프로젝트입니다.  
디지털컨버전스 ICT융합 풀스택(Java/Spring) 개발자 양성과정 팀 프로젝트로 개발되었습니다.

---

![Project Badge](https://img.shields.io/badge/Status-Completed-brightgreen) ![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/SpringBoot-3.3.0-green)

---

### 프로젝트 주제


- 통합 플랫폼을 통해 가전/가구 렌탈, 판매, 양도/양수 기능 제공

---

### 프로젝트 명


- 양도양수매칭 렌탈 플랫폼

---

### 프로젝트 목적 


1. 고객 편의성 극대화
   - 다양한 거래 방식(렌탈/판매/양수양도)을 지원하여 고객 선택지와 편의성 확대

2. 렌탈 서비스 활성화
   - 렌탈과 판매를 병행하여 고객 선택지를 넓히고 합리적인 가격과 다양한 렌탈 옵션을 제공하여 시장 확대

3. 지출 비용 최소화 
   - 양도양수를 통해서 렌탈 계약 기간에 대한 선택지를 넓히고 계약 해지를 최소화해서 위약금 발생 최소화

4. 친환경 소비 증가
   - 친환경적 소비문화를 촉진하고 불필요한 구매/폐기 최소화

---

### 프로젝트 기대효과 


1. 다양한 거래 방식 지원
   - 렌탈 : 일정 기간 동안 물건을 빌려 사용
   - 구매/판매: 일반적인 상품 거래
   - 양도/양수: 사용하던 물건이나 서비스를 다른 사람에게 넘기거나 받을 수 있음															

2. 경제적 이점
   - 필요한 만큼만 빌려서 비용 절감 가능
   - 양도를 통해 새 제품보다 저렴하게 이용 가능
   - 사용하지 않는 물건을 양도하거나 렌탈하여 추가 수익 창출															

3. 편리한 거래 환경
   - 한곳에서 다양한 거래 방식 제공
   - 안전한 거래 가능
   - 빠른 검색 및 필터링 기능으로 원하는 거래 방식 쉽게 선택 가능															

4. 친환경적 소비 문화
   - 불필요한 구매를 줄이고, 필요한 사람에게 양도하여 자원 절약
   - 제품의 수명을 늘려 폐기물 감소	

---

## 담당 기능

사용자 페이지
  - 회원가입 (일반 / 기업 / 입점업체) 및 이메일 인증
  - 아이디 중복체크 (AJAX 활용)
  - 클라이언트 측 JavaScript 정규식 기반 입력값 유효성 검사
  - 로그인 / 로그아웃
  - 마이페이지 프로필 조회 및 수정
  - 아이디 / 비밀번호 찾기
  - 일반/기업 회원 탈퇴

관리자 페이지
  - 회원 목록 조회/검색/페이징 처리  
  - 회원 상세 정보 조회  
  - 로그인 내역 조회/검색  
  - 관리자 프로필 관리  

입점업체 페이지
  - 대표/직원 권한 분기 처리  
  - 직원 등록/조회  
  - 프로필 관리  

기타 기능
  - 세션 기반 역할별 페이지 접근 제어 (Interceptor 활용)   
  - Ajax 비동기 처리  
  - 정규화된 DB 구조 기반 복잡한 로직 분기 처리

---

### 개발과정

- 시스템 구조도 및 ERD 설계
- 기능 정의서 작성 및 UI 기획
- 테이블 설계 및 SQL 작성
- 구현 후 GitHub를 통한 협업 및 형상관리
- 테스트 및 시연 발표

---

### 개발환경 

- Language : Java 17.0.2, JavaScript(JQuery : jquery-3.4.1, jquery-2.2.3), HTML5, CSS, Thymeleaf
- DB : MySQL 8.0
- DB관리툴 : HeidiSQL, DBeaver
- WAS : apache-tomcat-10.1.41
- 서버 운영환경 : Windows 10 (로컬 개발 환경 기준)  
- 형상관리 : Git, GitHub  
- 협업툴 : Google Sheets(업무분담 및 문서작업), ERDCloud (DB 설계 공유)  
- 개발도구 : STS4 4.29.1(이클립스 기반 IDE)
- 프레임워크 : springboot 3.4.6, spring-webmvc 6.2.7, maven 4.0.0, mybatis-spring 3.0.4
- 라이브러리/API : jackson.core 2.18.4, mybatis-3.0.4, spring-jdbc-5.3.7, mysql-connector-j 9.1.0, log4jdbc 1.16, thymeleaf-3.4.6, bootstrap5

---

### 보유기술

문서 작성 및 협업 도구
  - 팀 프로젝트 진행 과정에서 개발 문서 및 완료 보고서 작성
  - GitHub를 활용한 형상 관리 및 협업
  - Main, Develop, 개인 브랜치를 활용한 Git Flow 전략 적용
  - Pull Request 기반의 코드 병합 및 리뷰 경험 보유

프론트엔드 개발
  - HTML  
    - 블럭 요소(table, form, section, div)와 인라인 요소(a, span, button, input, label)를 활용한 웹 페이지 구조화
  - CSS/Bootstrap  
    - 부트스트랩 템플릿을 적용한 반응형 UI 구성
    - Bootstrap의 구성 요소 및 JavaScript 컴포넌트 활용
  - JavaScript / jQuery  
    - 유효성 검사(정규식, 조건문)를 통한 입력 제어
    - 이벤트 처리 및 DOM 조작, 배열·객체 활용
    - jQuery의 선택자와 Ajax를 활용한 클라이언트 동작 구현
  - Ajax  
    - 비동기 방식으로 주소 API, 이메일 인증, 중복 확인 등 회원가입 전체 과정을 비동기 방식으로 개선하여 구현

백엔드 개발
  - Java  
    - 객체지향 프로그래밍(OOP) 기반의 메서드, 클래스 구성
    - 오버로딩 및 오버라이딩 활용
  - Spring Boot  
    - MVC 패턴 기반의 웹 애플리케이션 구현
    - Controller-Service-Domain-Mapper 구조로 계층화된 로직 구현
    - Service 인터페이스에 추상 메서드와 구현 클래스로 구성하여 작성
    - Interceptor를 활용한 로그인 인증 및 접근 제어
    - 예외 처리 및 Ajax 통신 처리 기능 구현
  - Thymeleaf  
    - th:href, th:value, th:each, th:if, th:action 등 템플릿 문법 활용
    - HTML과 Java 객체 간의 데이터 바인딩 구현
  - MyBatis  
    - SQL 매핑(xml) 및 ResultMap, association을 이용한 객체 매핑
    - 동적 SQL 구현 및 복잡한 JOIN 처리 가능

데이터베이스
  - MySQL  
    - DDL: 데이터베이스 및 테이블 생성, 사용자 계정 생성 및 권한 부여
    - DML: INSERT, SELECT, UPDATE, DELETE 구문 작성
    - SQL 내장 함수 및 JOIN 활용
    - 프로시저 및 사용자 정의 함수 사용

프로젝트 관리 및 기타
  - Maven  
    - pom.xml을 통한 의존성 관리 및 빌드 자동화
  - Eclipse  
    - Java/Spring 개발환경 구축 및 Dynamic Web Project 설정 및 생성
    - 라이브러리 및 플러그인 활용

---

### 기술 스택

- Backend : Java, Spring Boot, MyBatis  
- Frontend : Thymeleaf, HTML/CSS, JavaScript, JQuery  
- Database : MySQL  
- 빌드 도구 : Maven  
- 버전 관리 : Git, GitHub  



---

GitHub 링크
[billeasy.store GitHub](https://github.com/soneunhyang/portfolio/tree/main/portfolio-membership)
