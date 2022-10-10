# 도서관리 프로그램 JAVA PROJECT CLI <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"> <img src="https://img.shields.io/badge/MariaDB-1F305F?style=flat-square&logo=MariaDB&logoColor=white"> <img src="https://img.shields.io/badge/IntelliJ IDEA-2F8CBB?style=flat-square&logo=IntelliJ IDEA&logoColor=white"> 


💡 `#JAVA`와 `#JDBC`(MariaDB)를 이용하여 만든 **JAVA CLI 도서대여 프로그램**  
<br>

## 🖥 프로젝트 소개
- 개발기간 <img src="https://img.shields.io/badge/22/09/24 ~ 22/10/8-ffce66?style=flat&logo=java&logoColor=white">
- 학습한 내용을 토대로 객체지향적으로 클래스의 관계, MVC패턴에 관하여 보다 깊이 이해하고 익히자는 목적하에 제작되었습니다.
- **오라클DB → MySQL → MariaDB** 를 순서대로 연동 및 적용해보며, 가장 많이 사용되는 3가지의 DB를 직접 다뤄보았습니다.  


##### ➥　구동 예시
　　<img src="http://hohk.dothome.co.kr/load/data/kt151209_2/166532970428827808.gif">


<br>

## 📝 요구사항 정의  
<b>1. 도서관리</b>
- 도서를 ***등록, 수정, 삭제*** 할 수 있어야만 한다
- 도서정보 등록 및 수정 시 기존에 등록된 도서인지를 체크해야만 한다.

|항목|상세내용
|:---:|:---:
|도서등록|새로운 도서정보(`도서번호`, `책제목`, `작가명`)을 등록한다.
|도서전체조회|등록된 모든 도서를 조회한다.
|도서검색|등록된 도서의 정보를 `도서번호`, `책제목`, `작가명`으로 검색한다.
|도서수정|등록된 도서의 정보를 수정한다.
|도서삭제|더이상 사용하지 않는 도서정보를 삭제한다.
|도서대여|대여가능한 도서를 대여하여, 대여불가로 변경한다.
|도서반납|대여중인 도서를 반납하여 대여가능으로 변경한다.  

<br>

<b>2. 회원관리</b>
- 도서와 마찬가지로 ***신규회원 등록, 수정, 삭제***가 가능해야만 한다.
- 회원등록 시 필수 정보는 이름과 연락처로 지정한다.

|항목|상세내용
|:---:|:---:
|회원등록|새로운 회원정보(`회원번호`, `회원이름`, `연락처`)를 등록한다.
|회원전체조회|등록된 모든 회원정보를 조회한다.
|회원검색|등록된 회원의 정보를 `회원번호`, `회원이름`으로 검색한다.
|회원정보수정|등록된 회원의 정보를 수정한다.
|회원삭제| 탈퇴를 원하는 고객의 정보를 삭제한다.

<br>

## 📌 다이어그램(Diagrram) <img src="https://img.shields.io/badge/new-ffce66?style=flat&logo=java&logoColor=white">
<details>
  <summary>유스케이스(Use-case)</summary> 
<img src="http://hohk.dothome.co.kr/load/data/kt151209_2/166532153254956512.png">
</details>
<details>
<summary>클래스 다이어그램(Class Diagram)</summary>
<img src="http://hohk.dothome.co.kr/load/data/kt151209_2/166532254646481312.png">
</details>
<details>
<summary>ERD 다이어그램(Entity Relationship Diagram)</summary>
준비중입니다
</details>
<details>
<summary>시퀀스 다이어그램(Sequence Diagram)</summary>
<img src="http://hohk.dothome.co.kr/load/data/kt151209_2/166532184700240896.png">
</details>  

<br>


## ⚠️ 개선사항 및 향후 수정 방향
<b>1. 디버깅이 필요한 오류 사항</b>
- [ ] 도서수정 시 대여/반납 부분 체크 및 반영 확인
- [x] 도서 대여 시, 도서정보에 해당 내용 함께 출력

<b>2. 사용자의 편의향상을 위한 개선부분</b>
- [ ] 마지막 선택 전에 한번 더 확인 할 수 있는 기능 추가

<b>3. 추가 업데이트 할만한 사항</b>
- [ ] 대여중인 도서 리스트만을 출력 할 수 있는 메뉴 추가
- [x] 도서정보 DB 추가
