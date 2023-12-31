# Inobao
9조 백엔드 레파지토리입니다

## 0. 시연영상
https://youtu.be/tqOW6SwqN7s

## 1. 제작 기간 & 팀원 소개
- 2023년 7월 14일 ~ 2023년 7월 20일
- 9조 팀 프로젝트
    + 김재익 : 게시글 좋아요, 댓글 좋아요, JWT 토큰 + Security 세팅, 예외처리
    + 박진웅 : 회원가입, 로그인
    + 장승연 : 게시글, 댓글

## ERD
![image](https://github.com/inocam-Week4-TEAM9/TEAM9BE/assets/63146118/dada555a-0564-49f9-8355-33dd70e0bcfe)

## API 명세서
https://inocamweek4-5.notion.site/8a0db38961ce483eb1d8aa6ad27e875c?v=963609094c344f49a7aacc89212bfe64&pvs=4


## 2. 사용 기술
- Spring boot
- MySQL
- AWS EC2
- AWS RDS
- AWS S3 Bucket


## 3. 핵심기능

- **로그인, 회원가입**
    - JWT를 이용하여 로그인과 회원가입을 구현하였습니다.
    - 아이디와 닉네임의 중복확인이 가능합니다.

- **게시글, 댓글**
    - JWT를 사용하여 작성자만 수정, 삭제가 가능하도록 하였습니다.
    - 게시글 삭제 시, 댓글도 같이 삭제가 됩니다.

- **좋아요**
    - 게시글, 댓글 각 최대 한번만 가능하게 하였습니다.
    - 본인이 누른 좋아요를 쿼리메소드 exists를 사용하여 게시글, 댓글에 true 값을 줘 표시했습니다.
