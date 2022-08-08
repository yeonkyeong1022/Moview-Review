# mrebview
# 영화 리뷰 Project

## 요구사항 분석

- 목록 화면에서 영화의 제목과 이미지 하나, 영화 리뷰의 평점/리뷰 개수 출력한다.
- 조회 화면에서 영화와 영화의 이미지들, 리뷰의 평균 점수/리뷰 개수를 같이 출력한다.
- 조회 화면에서 섬네일을 클릭하면 원본 파일을 보이도록 작성한다.
- 리뷰에 대한 정보에는 회원의 이메일이나 닉네임(nickname)과 같은 정보를 같이 출력한다.



- 영화(Movie)의 등록과 수정에는 파일 업로드 기능을 활용해 영화 포스터 등을 등록한다.
- 회원(Member)은 기존 회원들이 존재한다고 가정하고 데이터베이스에 존재하는 회원들을 이용한다.
- 회원(Member)은 특정한 영화 조회 페이지에서 평점과 자신의 감상을 리뷰(Review)로 기록한다.
- 조회화면에서 회원(Member)은 자신이 기록한 리뷰(Review)의 내용을 수정/삭제할 수 있다.



- 사용자는 버튼을 클릭하여 영화 리뷰를 입력하는 모달창을 볼 수 있다.
- 모달창에서는 리뷰 점수, 회원 아이디, 리뷰 점수, 내용을 입력할 수 있다.
- 영화 리뷰가 등록되면 현재 URL을 다시 호출하여 갱신한다.

## API 규격서

- **Moveiw**

| 방식 | URL | 리다이렉트 | 설명 |
| --- | --- | --- | --- |
| GET | /movie/register |  | 영화 등록 페이지  |
| POST | /movie/register | /movie/list | 새 영화 등록 |
| GET | /movie/list |  | 영화 목록페이지 |
| GET | /movie/read |  | 영화 조회 페이지 |
| GET | /movie/modify |  | 영화 수정 페이지 |
- **Upload**

| 방식 | URL | 반환 데이터 | 설명 |
| --- | --- | --- | --- |
| POST | /uploadAjax | ResponseEntity를 이용해 업로드 결과 반환 | 파일 업로드 |
| GET | /display | 파일의 byte[] 변환 결과 | 이미지  |
| POST | /removeFile | 파일의 삭제 결과(boolean) | 파일 삭제 |
- **Review**

| 방식 | URL | 반환 데이터 | 설명 |
| --- | --- | --- | --- |
| GET | /reviews/영화번호/all | ReviewDTO 리스트 | 해당 영화 모든 리뷰 반환 |
| POST | /reviews/영화번호 | 생성된 리뷰 번호 | 새 리뷰 등록 |
| PUT | /reviews/영화번호/영화리뷰번호 | 리뷰 수정 성공 여부 | 리뷰 수정 |
| DELETE | /reviews/영화번호/영화리뷰번호 | 리뷰 삭제 | 리뷰 삭제 |

## 엔티티 관계도
![Untitled](https://user-images.githubusercontent.com/89283563/183489499-646e1f50-53f4-42de-a75e-e8e43983a277.png)


## Git model

- master
    - 최종 릴리즈 브랜치
- develop
    - 개발 테스트 브랜치
    - 테스트 완료 시 master 브랜치에 pull Request
- feature
    - 기능 구현 브랜치

### Git flow(Git Kraken 활용)
<img width="344" alt="Untitled (1)" src="https://user-images.githubusercontent.com/89283563/183489602-3e02c60f-51a0-444a-9f4d-2aa2d17750f5.png">


---

## 프로젝트 구현 화면

![Untitled (2)](https://user-images.githubusercontent.com/89283563/183489631-ae3e88f5-2b02-4e7d-b94e-4afe80e8dc33.png)
![Untitled (3)](https://user-images.githubusercontent.com/89283563/183489644-524300e4-3821-4e60-9446-638a29933889.png)
![Untitled (4)](https://user-images.githubusercontent.com/89283563/183489656-17e147bb-41c8-4b47-9d8d-d4a092ab1777.png)

