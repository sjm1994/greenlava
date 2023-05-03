# greenlava

## 개인 공부용 프로젝트 입니다.

### 서버, 도메인
[구글 클라우드](https://cloud.google.com)에서 제공하는 [무료 서버](https://cloud.google.com/free/docs/free-cloud-features?hl=ko#compute) 이용중   
[내도메인.한국](https://내도메인.한국)에서 제공하는 무료 도메인 사용중([greenlava.kro.kr](http://greenlava.kro.kr))

### 운영환경
ubuntu 18-04 버전
nginx + springboot 내장 톰캣 사용

### CI / CD
[docker](#docker) (+ docker compose)

### framework
springboot(gradle)
thymeleaf

### 개발 관련

#### 도메인 기반 디렉토리 구조
도메인(기능) 기반으로 api(controller), dao, dto등을 분리
공통 파일은 global 디렉토리를 이용해 관리

#### docker
프로젝트 + 실행환경 단위로 관리할 수 있게 만들어주는 오픈소스 프로젝트   
동일 os 사용 시 별도의 환경설정 없이 바로 어플리케이션을 띄울 수 있음
