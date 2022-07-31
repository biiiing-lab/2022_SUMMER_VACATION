# CSS

## 웹 문서에 디자인 입히기

- 웹 문서의 내용과 상관없이 디자인만 바꾸기 가능
- 다양한 기기에 맞게 탄력적으로 문서 변환 가능**(반응형 웹디자인)**

## 스타일, 스타일 시트

### 스타일
```css 
p { /*텍스트 단락 선택*/
	text-align: center; /* 텍스트 정렬 속성 : 값 */
	color: blue; /* 글자색 속성 : 값 */
}

p { text-align: center; color: blue;}
```
- **브라우저 기본 스타일**
    
    기본 html 작업 후 사이트 생성 인터페이스

    - **사용자 스타일**
    - **인라인 스타일**
        
        간단한 스타일 정보를 적용
        
        ```css
        <p style="color: blue">안녕하세요</p>
        ```
        
    - **내부 스타일 시트**
        
        스타일 여러 곳 적용
        
        1. 헤드 안 지정
        2. style 태그 사이 지정
        
        ```css
        <head>
        	<style>
        		h1 {
        			padding: 10px;
        			background-color: #222'
        			color: #fff;
        		}
        	</style>
        </head>
        ```

- **외부 스타일 시트**
    
    스타일 정보를 따로 저장해 놓은 외부 시트
```css /*메인 시트*/
<head>
	<link rel="stylesheet" href="css/style.css">
</head>```

## 기본 선택자

### 1️⃣ 전체 선택자

: 스타일을 문서의 모든 요소에 적용할 때 사용

➕) **마진과 패딩?** 문서 내용과 브라우저 테두리 사이의 여백

```css
<stlye>
	* {
		margin: 0;
	}
```

### 2️⃣ 타입 선택자

- 모든 요소에 스타일 적용하는 것

```css
<style>
	p {
		font-style: italic;
	} /*모든 p요소에 스타일 적용*/
```

***타입 선택자와 태그 선택자의 차이점은?***

### 3️⃣ 클래스 선택자

- class속성을 사용하여 지정
- 여러 곳에 적용 가능
- 요소 하나에 스타일 2개 이상 적용 가능
- 공백 구분

```css
<head>
<style>
.accent {
	border: 1px solid #000;
	padding: 5px;
}
.bg {
	background-color: #ddd;
}
</style>
</head>

<body>
<h1 style="accent bg">안녕하세요</h1>
</body>
```

### 4️⃣ id 선택자

- 문서에서 한 번만 적용 가능

```css
<style>
	#container {
		width: 500px;
		margin: 10px auto;
		padding: 10px;
		border: 1px solid #000;
	}
</style>

<div id="container">
.
.
```

### 5️⃣ 그룹 선택자

- 한꺼번에 정의
```css h1, p {
 text-align: center;
 ```

 ## 캐스케이딩 스타일 시트

**캐스케이딩이란?** css에서의 c는 캐스케이딩(cascading)의 줄임말. 우선순위가 있는 스타일 시트를 말함. css에서는 웹 요소에 둘 이상 스타일을 적용할 때 **우선순위**에 따라 적용할 스타일을 결정함.

1. **스타일 우선순위**

⇒ 캐스케이딩에서 가장 중요하다. 사용자(user)가 지정한 스타일, 제작자(author), 웹 브라우저(browser)가 지정한 스타일 3가지를 함께 사용함. 

1. **적용 범위**

1. **소스 코드의 작성 순서**
- 스타일 시트에서 중요도와 적용 범위가 같을 경우 : 정의한 소스 순서대로 우선순위가 정해짐

```css
<style>
p {
	color: black;
}
h1 :
	color: brown !important;
}
p {
	color: blue;
}
</style>

....

<h1 style="color: green">안녕하세요</h1>
<p style="color: red;">안녕하십니까</p>
```

→ 우선 순위에 따라 결과 값이 달라짐

1. **스타일 상속**

포함하는 태그 : 부모 요소

포함된 태그 : 자식 요소

→ 별도로 스타일을 지정하지 않으면 부모 요소의 스타일이 자식 요소로 전달되는 행위

## 글꼴 관련 스타일

**font-family** 속성 지정

```css
body { font-family: "맑은 고딕", 돋움, 굴림 }
```

→ 글꼴이 없을 경우를 대비해서 3가지를 준비해야함

→ 한 번 정의하면 문서 전체에 적용

### 기본형

```css
font-size: 값1 | 값2 | 값3 
/*나열한 옵션 중 하나가 값이 되어야함 */

font-variant: normal | small-caps
/*속성값*/

font-size: <절대 크기> | <상대 크기> | <크기> | <백분율>

font : <font-sytle><font-variant><font-weight>
```

 

**font-size**

**font-sytle** 

```css
font-sytle: normal | italic | oblique
```

→ 첫 번째 : 일반적인 형태로 표시

→ 두 번째, 세 번째 : 이탤릭체로 표시

**font-weight**

```css
font-weight: normal | bold | bolder | lighter | 100 | 200| ... | 800 | 900
```

→ 글자 굵기를 지정하는 속성

→ 숫잣값을 사용하여 글꼴 굵기를 세밀하게 지정 가능

### 웹 폰트 사용하기

**웹 폰트란?** 사용자 시스템에 없는 글꼴을 다른 글꼴로 대체하는 것이 아닌 그대로 보여주는 방법은 무엇이 있는가? css3이 웹 폰트(web font)를 표준으로 채택하여 번거로운 작업이 필요 없어짐.

**웹 폰트 사용?** 웹 문서 작업 시 글꼴 정보를 함께 저장 해야 함. 사용한 글꼴을 내려 받아야 제작자가 의도한 대로 텍스트를 보여줄 수 있으므로 함께 저장한다. 사이트에서 제공하지 않는 글꼴인 경우, 자신이 가지고 있는 **TTF**를 변환하여 사용하고 직접 업로드를 한다.

 TrueType, *.ttf인 파일확장자를 사용하는데, 최근에는 **eot**(embedded open type), **woff**(web open font format), **woff2**파일도 많이 사용한다.

 ```css
<style>
	@font-face {
		font-family: '글꼴 이름';
		src: local/*해당 글꼴 확인*/('Ostrich Sans')
		url('주소') format('woff') /*없을 시 woff 포맷으로 된 글꼴 내려받기*/
	}
.wfont {
	font-family: 'Ostrich' sans-serif; /*웹 폰트 지정*/
```

- 되도록이면 글꼴 파일 이름과 글꼴 이름을 동일하게 작성

---

## 텍스트 관련 스타일

### ✅ 글자 색 지정

기본형 : `color: <색상>`

1. **16진수 표현**; #ffffff, #ffff00 등 6자리 문자로 표현.

→ #RRGGBB, #000000(검정), #ffffff(흰색)

1. **hsl, hsla 표현**; hsl(hue, saturation, lightness)(색상, 채도, 명도)와 hsla의 a는 alpha(불투명도)를 나타냄

1. **색상 영문명 표현**; red, black, yellow 등 잘 알려진 색상 이름을 사용하는 것
2. **rgb, rgba;** red, green, blue의 줄임말이며 섞이지 않았을 때는 0, 섞였을 때는 255로 표현

```css
h1 { color: rgb(0, 0, 0) }
h1 { color: rgba(0, 0, 0, 0) }
```

### ✅ 텍스트 정렬
```css
text-align: 선택;
```

| 종류 | 설명 |
| --- | --- |
| start | 현재 텍스트 줄의 시작 위치에 맞추어 정리 |
| end | 현재 텍스트 줄의 끝 위치에 맞추어 정리 |
| left | 왼쪽 정렬 |
| right | 오른쪽 정렬 |
| justify | 양쪽 정렬 |
| match-parent | 부모 요소 정렬 |

### ✅ 줄 간격 조절

`line-height` 속성 사용

```css
p { font-size: 12px; line-height: 24px; }
p { font-size: 12px; line-height: 2.0; }
p { font-size: 12px; line-height: 200%; }
```

줄간격 24px, 같은 결과 다른 방식

### ✅ 줄 표시, 삭제

`text-decoration` 속성 사용 

```css
<p sytle="text-decoration:none">안녕</p>
<p sytle="text-decoration:underline">안녕</p>
<p sytle="text-decoration:overline">안녕</p>
<p sytle="text-decoration:line-through">안녕</p>
```

### ✅ 그림자 효과

`text-shadow` 속성 사용

```css
text-shadow: none | 가로, 세로, 번짐, 색상 /*픽셀값*/
```

### ✅ 텍스트 대소문자

`text-transform` 속성 사용 

| 종류 | 기능 |
| --- | --- |
| capitalize | 첫 번째 글자를 대문자로 변환 |
| uppercase | 모든 글자 대문자 변환 |
| lowercase | 모든 굴자 소문자 변환 |
| full-width | 가능한 모든 문자를 전각 문자(가로, 세로 비율 동일) 변환 |

전각 ↔ 반각(가로, 세로의 비율 1:2)

### ✅ 글자 간격

`letter-spacing` 속성 : 글자와 글자 사이의 간격 조절

`word-spacing` 속성 : 단어와 단어 사이의 간격 조절

→ px, em, %로 값 조절

```css
.spacing {
	letter-spacing: 0.2em;
}

<p class="spacing">CSS</p>
```

---

## 목록 스타일

`list-style-type` 속성

| 종류 | 기능 |
| --- | --- |
| disc | 채운 원 |
| circle | 빈 원 |
| square | 채운 사각형 |
| decimal-leading-zero | 10진수) 앞에 0이 붙음 |
| decimal | 10진수) 1부터 시작 |
| lower-roman | 로마 숫자 소문자 |
| upper-roman | 로마 숫자 대문자 |
| lower-alpha | lower-latin | 알파벳 소문자 |
| upper-alpha | upper-latin | 알파벳 대문자 |
| none | 불릿이나 숫자 삭제 |

**이미지 삽입**

`list-sytle-image` 속성 ⇒ `list-sytle-image: url(’주소’);`

**들여쓰기**

`list-style-position` 속성 ⇒ `list-style-position: inside | outside`

⭐ list-style로 묶어서 한 번에 표현 가능

---

## 표 스타일

**표 제목 위치**

`caption-side: top(기본값) | bottom` 

**표 테두리 그리기**

`border` 

`border-spacing` 수평거리 수직거리

```css
table {
	caption-side: bottom;
	border: 1px solid black; }
td, th {
	border 1px dotted black;
	padding: 10px;
	text-align: center; }
```

**표와 셀 테두리 합치기**

`border-collapse(seperate)`

```css
table {
	caption-side: bottom;
	border: 1px solid black;
	border-collapse: collapse; }
td, th {
	border 1px dotted black;
	padding: 10px;
	text-align: center; }
```

---

## CSS와 박스 모델

### 블록 레벨 요소

태그를 사용하여 요소를 삽입했을 때 혼자 한 줄을 차지하는 것을 말함.

### 인라인 레벨 요소

한 줄을 차지하지 않음. 나머지 공간에는 다른 요소가 올 수 있으며 대표적으로 <span>, <img>, <strong> 등이 해당함.

### 박스 모델의 기본 구성

박스 모델 요소 : 스타일 시트에서의 박스 형태인 요소

콘텐츠 영역, 박스와 콘텐츠 영역 사이의 여백 패딩(padding), 테두리(border), 모델 사이의 여백(margin) 요소로 구성

**✅ 콘텐츠 영역 크기**

⇒ `width, height` 속성 사용

생성하는 첫 번째 박스는 웹 브라우저 크기와 상관없이 유지되나, 두 번째 박스부터는 부모 요소, 웹 브라우저 크기에 따라 달라짐.

**✅ 박스 모델 크기 계산** 

⇒ border-box : 테두리까지 포함하여 너빗값 지정

⇒ content-box : 콘텐츠 영역만 너빗값을 지정하고 기본값.

**✅ 박스 그림자 효과**

⇒ `box-shadow: <수평 거리> <수직 거리> <흐림 정도> <번짐 정도> <색상> inset`

---

## 테두리 스타일 지정하기

⭐ top → right → bottom → left

### border-style 속성

| 종류 | 설명 |
| --- | --- |
| none | 테두리 없음, 기본값 |
| hidden | 테두리 감추기 |
| solid | 실선 |
| dotted | 점선 |
| dashed | 짧은 직선 |
| double | 이중선 |
| groove | 입체 |
| inset |  |
| outset |  |
| ridge | 창에서 나온 것처럼 표시 |

**✅ 테두리 두께**

`border-width: <크기> | thin, medium, thick`

**✅ 테두리 색상**

`border-color`

**✅ 둥근 테두리**

`border-radius: <크기> | <백분율>`

---

## 여백 조절 속성

**: margin**

 : top, right, bottom, left를 사용하여 특정 방향에만 지정 가능

`margin: <크기> | <백분율> | auto`

### 마진 중첩/마진 상쇄

⇒ 마진과 마진이 서로 만나면 마진값이 큰 쪽으로 겹쳐지는 문제

### padding

⇒ 콘텐츠와 테두리 사이의 여백 설정

```css
#padding { padding : 20px 30px 40px 50px; }
```

### display

블록 레벨 요소와 인라인 레벨 요소를 바꾸어 사용 가능

| 종류 | 기능 |
| --- | --- |
| block | 인라인 레벨 요소를 블록 레벨 요소로 만듦 |
| inline | 블록 레벨 요소를 인라인 레벨 요소로 만듦 |
| inline-block | 인라인, 블록 속성 포함하고 마진과 패딩 지정 가능 |
| none | 해당 요소 화면 지정X |

### float ↔ clear

왼쪽이나 오른쪽으로 배치(left, right, none) ↔ 해제

### 웹 요소의 위치

left, right, top, bottom; 기준 위치와 요소 사이에 얼마나 떨어져 있는지 지정함

```css
#pos1 {
	position: absolute; /*포지셔닝*/
	left: 50px;
	top: 50px;
}
```

| 종류 | 기능 |
| --- | --- |
| static | 문서의 흐름에 맞춰 배치 |
| relative | 위칫값 지정 제외 static과 동일 |
| absolute | relrative값 상위요소 기준 위치 지정 후 배치 |
| fixed | 브라우저 창을 기준으로 위치 지정 후 배치  |