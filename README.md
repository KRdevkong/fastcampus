# fastcampus 과제 1
![휴대폰 구매 drawio](https://github.com/KRdevkong/fastcampus/assets/98868520/87eaffc5-94df-4697-b2d8-7220cea13344)


# 메인 클래스 흐름
<img width="586" alt="매인 클래스" src="https://github.com/KRdevkong/fastcampus/assets/98868520/e038a778-3e08-48dd-843c-71ef4ef3f344">

- 유저 인스턴스 생성
- 유저가 휴대폰 구매
- 유저가 핸드폰 사용
- 유저 핸드폰 변경 가능


# 설계

## 전화기 인터페이스
<img width="228" alt="전화기 인터페이스" src="https://github.com/KRdevkong/fastcampus/assets/98868520/7d7ad29d-325f-4ab4-a71e-fb84ae602e68">

- 전화기 인터페이스로 전화의 기본 기능 구현

## 스마트폰 부모클래스
<img width="544" alt="스마트폰 클래스" src="https://github.com/KRdevkong/fastcampus/assets/98868520/4276d172-8047-4628-9db4-9574a83d5ce3">

- 전화기 인터페이스를 스마트폰 클래스가 구체화
- 스마트폰 기능 추가

## 삼성폰 및 아이폰 클래스
<img width="607" alt="아이폰 클래스" src="https://github.com/KRdevkong/fastcampus/assets/98868520/eeaa5b75-fef4-4e5d-9424-349f3964b9c2">

<img width="589" alt="삼성폰 클래스" src="https://github.com/KRdevkong/fastcampus/assets/98868520/a4b7a66c-0f72-44a4-ac25-8fdd89cf6573">

- 스마트폰 클래스를 상속받음
- 삼성폰, 아이폰 각자 고유 기능 구현

## 유저 클래스
![유저클래스1](https://github.com/KRdevkong/fastcampus/assets/98868520/99cb5e96-b35f-499d-a7b3-ec2e17852c2d)
![유저클래스2](https://github.com/KRdevkong/fastcampus/assets/98868520/c83a234e-c2f2-42c4-aa2d-6bec97602bca)

- 유저 이름 저장
- 유저 휴대폰 인스턴스 저장
- 유저 휴대폰 구매 기능 구현
- 유저는 최근에 구매한 휴대폰 사용가능
- 휴대폰 사용시 유저가 휴대폰 기능 사용
- 유저 클래스에 휴대폰 기능 구현 누락 방지를 대비해
  스마트폰 클래스를 상속받아 누락된 기능도 임시 작동 가능하게 구현
