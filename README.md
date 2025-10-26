# java-racingcar-precourse

- [ ] InputManager
  - [ ] 사용자 입력 받아오기
  - [ ] 입력 값 검증

- [ ] GameManager
  - [ ] InputManager 입력을 바탕으로 게임 생성
    - [ ] RacingCar 생성
    - [ ] 시도 횟수 초기화
  - [ ] 게임 진행
    - [ ] 회차 별로 각 RacingCar 동작
    - [ ] 각 RacingCar 동작 후 RacingCar들의 현재 위치 저장 및 시행 횟수 업데이트
  - [ ] 결과 반환
      - [ ] 현재 게임 정보(RacingCar 위치, 회차)를 GameResult 객체로 반환
  
- [ ] RacingCar
  - [ ] 생성 시 인자로 이름 받아서 저장
  - [ ] 랜덤값 구해서 전진/멈춤 기능

- [ ] GameResult
  - [ ] 회차 별 결과 혹은 최종 결과를 저장

- [ ] ResultView
  - [ ] GameResult를 정해진 format으로 출력

### [해결과정 - Notion](https://www.notion.so/2-29830ead56d58025a799c58d88815ff9?source=copy_link)