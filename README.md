# billeasy.store
[사이트 바로가기](https://billeasy.store/) | [관리자 페이지](https://billeasy.store/admin)

가전·가구 렌탈, 판매, 양도/양수 기능을 통합한 웹 플랫폼 프로젝트입니다.  
디지털컨버전스 ICT융합 풀스택(Java/Spring) 개발자 양성과정 팀 프로젝트로 개발되었습니다.

---

![Project Badge](https://img.shields.io/badge/Status-Completed-brightgreen) ![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/SpringBoot-3.3.0-green)

---

### 프로젝트 주제
- 통합 플랫폼을 통해 가전/가구 렌탈, 판매, 양도/양수 기능 제공

### 프로젝트 명
- 양도양수매칭 렌탈 플랫폼

### 프로젝트 목적
1. 고객 편의성 극대화
   - 다양한 거래 방식(렌탈/판매/양수양도) 지원
2. 렌탈 서비스 활성화
   - 렌탈과 판매를 병행하여 고객 선택지를 넓히고 합리적인 가격과 다양한 렌탈 옵션을 제공하여 시장 확대
3. 지출 비용 최소화
   - 양도/양수를 통한 비용 절감 및 위약금 최소화
4. 친환경 소비 증가
   - 불필요한 구매/폐기 최소화

### 프로젝트 기대효과
1. 다양한 거래 방식 지원
  - 렌탈: 일정 기간 물건 사용  
  - 구매/판매: 일반 상품 거래  
  - 양도/양수: 사용하던 물건/서비스 이전
2. 경제적 이점
  - 필요한 만큼만 빌려 비용 절감  
  - 양도를 통해 저렴하게 이용 가능  
  - 사용하지 않는 물건을 양도·렌탈해 추가 수익 창출
3. 편리한 거래 환경
  - 한 곳에서 다양한 거래 방식 제공  
  - 안전한 거래 가능  
  - 빠른 검색/필터링 기능
4. 친환경 소비 문화
  - 불필요한 구매 최소화  
  - 제품 수명 연장 → 폐기물 감소

---

## 담당 기능
### 사용자 페이지
- 회원가입 (일반/기업/입점업체) 및 이메일 인증
- 아이디 중복체크 (AJAX 활용)
- 클라이언트 측 JavaScript 정규식 기반 입력값 유효성 검사
- 로그인/로그아웃
- 마이페이지 프로필 조회 및 수정
- 아이디/비밀번호 찾기
- 일반/기업 회원 탈퇴

### 관리자 페이지
- 회원 목록 조회/검색/페이징 처리
- 회원 상세 정보 조회
- 로그인 내역 조회/검색
- 관리자 프로필 관리

### 입점업체 페이지
- 대표/직원 권한 분기 처리
- 직원 등록/조회
- 프로필 관리

### 기타 기능
- 세션 기반 역할별 페이지 접근 제어 (Interceptor 활용)
- Ajax 비동기 처리
- 정규화된 DB 구조 기반 복잡한 로직 처리

---

### 개발과정
- 시스템 구조도 및 ERD 설계
- 기능 정의서 작성 및 UI 기획
- 테이블 설계 및 SQL 작성
- 구현 후 GitHub를 통한 협업 및 형상관리
- 테스트 및 시연 발표

---

### 개발환경
- **언어/프레임워크**: Java 17.0.2, Spring Boot 3.4.6, Spring Web MVC 6.2.7, MyBatis-Spring 3.0.4, Thymeleaf 3.4.6
- **프론트엔드**: HTML5, CSS3, Bootstrap5, JavaScript, jQuery, Ajax
- **DB**: MySQL 8.0, Oracle DB 설계 및 SQL 활용
- **WAS/서버**: Apache Tomcat 10.1.41, Windows 10 (로컬 개발 환경)
- **빌드 도구/IDE**: Maven, Eclipse(STS4 기반)
- **형상관리/협업**: Git, GitHub, Google Sheets, ERDCloud
- **라이브러리/API**: jackson.core 2.18.4, spring-jdbc-5.3.7, mysql-connector-j 9.1.0, log4jdbc 1.16

---

### 보유기술
- **문서 작성 및 협업 도구**
  - 팀 프로젝트 문서 작성 및 완료 보고서
  - GitHub를 통한 형상관리 및 협업
  - Git Flow 전략 활용 (Main, Develop, 개인 브랜치)
  - Pull Request 기반 코드 병합 및 리뷰 경험

- **프론트엔드 개발**
  - HTML: 블럭 요소와 인라인 요소를 활용한 웹 페이지 구조화
  - CSS/Bootstrap: 반응형 UI, Bootstrap 구성 요소 및 JavaScript 컴포넌트 활용
  - JavaScript/jQuery: 유효성 검사, 이벤트 처리, DOM 조작, Ajax 기반 비동기 처리
  - Ajax: 이메일 인증, 주소 API, 중복 확인 등 비동기 처리

- **백엔드 개발**
  - Java: 객체지향 프로그래밍, 오버로딩/오버라이딩
  - Spring Boot: MVC 패턴, Controller-Service-Domain-Mapper 구조, Interceptor 활용, 예외 처리
  - Thymeleaf: 서버사이드 템플릿, HTML-Java 바인딩
  - MyBatis: SQL 매핑, ResultMap, association, 동적 SQL, 복잡한 JOIN 처리

- **데이터베이스**
  - MySQL: DDL/DML, SQL 함수, JOIN, 프로시저, 사용자 정의 함수 활용

- **프로젝트 관리 및 기타**
  - Maven: 의존성 관리, 빌드 자동화
  - Eclipse: Java/Spring 개발환경 구축, Dynamic Web Project 설정, 라이브러리/플러그인 활용

---

### 기술 스택
- **Backend**: Java, Spring Boot, MyBatis  
- **Frontend**: Thymeleaf, HTML/CSS, JavaScript, jQuery, Bootstrap, Ajax  
- **Database**: MySQL  
- **빌드 도구**: Maven  
- **버전 관리**: Git, GitHub  

---

### GitHub 링크
[billeasy.store GitHub](https://github.com/soneunhyang/portfolio/tree/main/portfolio-membership)

