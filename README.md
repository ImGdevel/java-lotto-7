# java-lotto-precourse


## 구현 기능 목록

### 입력 및 출력
- **InputView 클래스 구현**
  - 사용자의 구입 금액, 당첨 번호, 보너스 번호를 입력받을 수 있도록 기능 추가
- **OutputView 클래스 구현**
  - 발행된 로또의 수량과 번호를 오름차순으로 정리하여 출력
  - 당첨 통계와 수익률을 포함한 전체 결과 출력

### Lotto 클래스 기능 구현
- **Lotto 클래스 구현**
  - 로또 번호 6개를 생성하고 중복되지 않게 검증
  - 로또 번호가 1~45 사이인지 확인하는 유효성 검사 추가
  - 생성된 로또 번호를 오름차순으로 정렬

### 로또 발행 로직
- **LottoController 클래스 구현**
  - 사용자가 입력한 구입 금액에 맞게 로또 티켓 발행
  - 발행된 로또 티켓 리스트를 저장하고, 이후에 당첨 여부 확인 가능
  
- **LottoService 클래스 구현**
  - 구입 금액은 1,000원 단위로 입력받으며 나누어 떨어지지 않으면 예외 발생
  - 구입 갯수 만큼 Lotto 발행
  - Lotto 발행시 1~45 범위내 중복 되지 않는 무작위 숫자 6개로 발급

### 당첨 번호 및 보너스 번호 입력
- **InputView 클래스 구현**
  - 당첨 번호(쉼표로 구분된 6개 숫자)와 보너스 번호 입력받기
  - 보너스 번호가 1~45 사이인지 확인하고 중복되지 않도록 예외 처리

### 당첨 통계 계산 기능
- **LottoService 클래스에서 통계 집계**
  - 당첨 결과 집계하여 각 등수별 당첨 개수 계산
  - 총 수익률 계산 메서드 추가, 수익률은 소수점 둘째 자리에서 반올림하여 반환

### 예외 처리 기능
- 잘못된 입력 시 `IllegalArgumentException` 발생시키고 `[ERROR]`로 시작하는 에러 메시지 출력
- 예외 발생 시 프로그램이 종료되지 않고, 해당 입력 재수신

### 테스트 코드 작성
- **JUnit 5와 AssertJ 사용**
  - 각 기능 테스트하는 단위 테스트 작성
  - 예외 상황 올바르게 처리되는지 확인하는 테스트 케이스 작성

### 기타 요구사항
- JDK 21 버전에서 실행 가능하도록 구현
- Console API의 `readLine()` 함수로 입력 처리, Randoms의 `pickUniqueNumbersInRange()` 함수 활용
- Lotto 클래스에 있는 numbers 외의 필드 추가 금지
- 커밋 메시지는 AngularJS Git Commit Message Conventions 참고하여 작성
- 함수의 들여쓰기 깊이는 최대 2로 유지, 길이는 15라인 이하로 유지
- 외부 라이브러리는 제공된 것 이외에 사용 금지
