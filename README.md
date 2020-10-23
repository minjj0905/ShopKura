<h1 align="center"> #Kura🌸</h1>

[![HitCount](http://hits.dwyl.com/minjj0905/minjj0905/ShopKura.svg)](http://hits.dwyl.com/minjj0905/minjj0905/ShopKura)
<img src="https://img.shields.io/github/issues/minjj0905/ShopKura">
<img src="https://img.shields.io/github/forks/minjj0905/ShopKura">
<img src="https://img.shields.io/github/stars/minjj0905/ShopKura">

#### #Kura = Shop Kura = Shop + Sakura
> 국민대학교 2020-2 모바일프로그래밍 과제입니다.
> 
> 소프트웨어학부 20191556 김민정
<br>

## :cherry_blossom: 과제 내용

> **1. 평가 : 첫번째 화면 5점, 두번째 화면 5점, 세번째 화면 5점
>      (만점 15점, 각 화면의 구성+동작으로 평가)**
>
> **2. 총점 : 15점
>   \* 가산점: Firebase 연동**  *** 감점 : 동작중 비정상적인 앱 종료** 
>
> **첫번째 화면 (Relative Layout 혹은 Fragment 사용)****
> **- 상품 선택 페이지
> \- 상품은 2개이상 화면에 출력. 각 상품의 제품명, 가격 정보 표시 
> \- 상품 선택하면 아래에 버튼으로 구매 혹은 장바구니 선택
> \- 장바구니 버튼을 클릭시에는 두번째 화면으로 이동
> \- 구매 버튼을 클릭시에는 세번째 화면으로 이동
>
> **두번째 화면 (Linear Layout 혹은 Fragment 사용)
> **- 장바구니 페이지
> \- 장바구니에 추가한 상품명, 가격 정보 출력
> \- 구매 버튼과 홈버튼을 출럭
> \- 홈버튼을 클릭하면 첫번째 페이지로 이동
> \- 상품별로 선택(Radio 버튼, 체크 박스 활용) 여부 체크후에
>  구매 버튼을 클릭하면 세번째 페이지로 이동
>
> **세번째 화면 (Table Layout, Grid Layout 중 하나 사용)
> **- 구매 페이지
> \- 선택한 제품명, 가격 정보를 출력
> \- 선택한 제품이 여러개면 결재할 총합 선택
> \- 주소정보, 연락처 입력
> \- 구매 완료시에 첫번째 화면으로 이동
>
> \* 각페이지 구성시에 View을 상속한 여러가지 위젯을 사용하여 화면을 구성
>  (기능에 맞는 위젯 선택하여 구성)
>   ListView, GridView, AdapterView, ToolBar, Text View, CheckBox, Switch, 
>   ToggleButton, RadioButton, ImageView, ImageButton 등

<br>

## :cherry_blossom: 구현 내용

### 1. 상품선택 페이지

##### 처음 앱을 실행했을 때
<img src="images/01_1.png" width="300">
<br>

##### 우측 상단 장바구니 버튼 클릭시 장바구니로 이동
<img src="images/02_1.png" width="300">
<br>

##### 상품을 선택하지 않고 장바구니 담기, 바로 구매하기 버튼 클릭 시 메세지 출력
<img src="images/01_2.png" width="300">
<br>

##### 상품 여러개 선택 가능
<img src="images/01_3.png" width="300">
<br>


<br>

### 2. 장바구니 페이지

##### 아무것도 선택하지 않고 상단 버튼을 이용해 장바구니에 진입 시 빈 장바구니 출력
<img src="images/02_1.png" width="300">
<br>

##### 상품 선택 후 장바구니 버튼을 클릭하면 장바구니에 담기게 됨
<img src="images/02_2.png" width="300">
<br>

##### 상품 선택 해제 할 시 선택 수량, 총 금액 변동
<div>
    <img src="images/02_3.png" width="300">
    &nbsp;
    <img src="images/02_4.png" width="300">
</div>
<br>

##### 상품을 선택하지 않고 구매하기 버튼 클릭시 메세지 출력
<img src="images/02_5.png" width="300">
<br>

##### 우측상단 홈버튼 클릭 시 다시 상품선택 페이지로 돌아감
<img src="images/02_6.png" width="300">
<br>

### 3. 구매 페이지

##### 상품 선택 후 구매페이지 진입 시
<img src="images/03_1.png" width="300">
<br>

##### 주문자 정보를 입력하지 않고 결제하기 버튼 클릭 시
<img src="images/03_2.png" width="300">
<br>

##### 주문자 정보 작성 후 결제하기 버튼 클릭 가능
<img src="images/03_3.png" width="300">
<br>

### 4. 구매완료 페이지

##### 주문자 정보가 있을 때 결제하기 클릭 시 구매완료 페이지 출력
<img src="images/04_1.png" width="300">
<br>

##### 홈으로 이동 버튼이나 뒤로가기 클릭 시 새 상품선택 페이지로 이동
<img src="images/05_1.png" width="300">
<br>

## :cherry_blossom: 과제 소감

> 처음에 앱 개발을 시작했을 때에는 매우 막막했다. 학교 수업을 들으며 어찌저찌 따라가고는 있었으나, 앱 개발이 처음이고 배운 내용만으로 내가 만들고 싶은 앱을 구현하기에는 무리가 있어 많은 공부가 필요했다.
>
> 처음으로 앱의 UI를 디자인하면서, 생각보다 꽤 어려운 작업이 되겠구나 싶었다. 아직은 근사하지는 않지만 그래도 이런 그래픽적인 요소가 들어가는 작업에 소홀히 할 수 없는 성격이라, 가뜩이나 시간도 모자란데 예쁘게 꾸미겠다고 오래 붙잡고 있었다. UI를 설계하면서 어떤 Widget, View들이 필요할 지 생각하고 대략적인 Layout을 구상했다.
>
> 실제로 앱을 개발하는데 시간을 많이 사용하지 못해서 firebase를 연동하는 등의 부가적인 기능을 개발하지 못했다. 이 점에서 많이 아쉽다. 조금만 더 시간을 투자했다면 더 풍부한 기능을 개발할 수 있었을 텐데 하는 아쉬움이 있고, 공부해보지 못했다는 점이 아깝다. 추후에 가능하다면 스스로 세부적인 기능을 추가로 구현하고 싶다.