# HTML

## HTML이란?

⇒ hypertext markup laguage이며, hyperText란 문서를 서로 연결해주는 링크를 말한다.

---

## HTML 기본 구조, 이론 구체화

- <!DOCTYPE> HTML5 문서를 나타냄
- <html lang=”ko”> 한국어
- head 영역
    1. <meta> 데이터의 데이터
    2. <meta charset=”utf-8”>
    3. <meta name=”keywords” contant=”-”>

```html
<!doctype>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>연습</title>
	</head> <!--웹 문서 해석-->
	<body>
		<h1>웹 개발<h1>
		<hr>
		<p>안녕하세요</p>
		<p>hello World!</p>
	</body> <!--실제 웹 브라우저 화면에 나타나는 모습-->
</html>
```

---

## 시맨틱 태그 : 줄임말

⇒ 이름만 봐도 알 수 있는 것. <p>(paragraph), <a>(anchor) 등이 포함된다.

```html
<main class="contents">
	<section id="first">
		<h1>첫번째 요소</h1>
	</section>
	<section id="second">
		<h1>두번째 요소</h1>
	</section>
</main>
```

### 시맨틱 태그가 필요한 이유

1. 소스 코드만 보고 제목, 메뉴 등 구성을 인지하기 쉬움
2. 문서 구조 나뉨 → 여러 기기로 웹 문서 표현 쉬움
3. 검색할 때 필요한 내용 정확히 찾기 쉬움

---
## 텍스트 입력

### 1️⃣ 제목

```html
<h1>입력하기</h1>
<h2>입력하기</h2>
<h3>입력하기</h3>
<h4>입력하기</h4>
<h5>입력하기</h5>
<h6>입력하기</h6> 
```

- 숫자가 커질수록 제목의 크기는 작아짐

### 2️⃣ 텍스트 단락

```html
<p>안녕하세요 이제부터 html을 공부해보겠습니다.</p>
<p>html뿐만이 <br> 아닌 css, javascrip 또한 공부할 예정입니다.</p> 
```

- <br>의 경우, 줄바꿈 기능. 텍스트 단락을 만들 때 후의 css와의 충돌을 방지하기 위하여 <p></p> 기능을 사용하도록 한다.

### 3️⃣ 인용문

```html
<p>html의 특징을 알아보겠습니다.</p>
<blockquote>
	html은 다양한 입력 문법이 존재합니다.
</blocoquote>
```

- 텍스트 단락보다 안으로 들어옴

### 4️⃣ 텍스트 굵게 표시

```html
<strong>안녕하세요</strong>
<b>안녕하십니까</b>
```

- 경고, 주의사항 → **strong**
- 단순 표시 → **b**

### 5️⃣ 기울인 텍스트

```html
<i>안녕하세요</i>
<em>안녕하십니까</em>
```

- 흐름 상 특정 부분 강조 → **em**
- 생각, 용어, 관용구 → **i**

### 그 외 다양한 태그

```html
<abbr></abbr> <!--줄임말 표시, title 속성 함께 사용-->
<cite></cite> <!--참고 내용 표시-->
<code></code> <!--소스 코드-->
<samll></small> <!--부가 정보-->
<sub></sub> <!--아래 첨자-->
<sup></sup> <!--위 첨자-->
<s></s> <!--취소선-->
```

---

## 입력하기

### ☑️ 목록 만들기

### 1️⃣ 순서 있는 목록

```html
<ol>
	<li>항목1</li>
	<li>항목2</li>
</ol> <!--순차적 항목-->
```

- 속성 종류
    
    **사용 예시 :** `<ol type=”a” start=”1”>`
    
    | type | 설명 |
    | --- | --- |
    | 1 | 기본 숫자값 |
    | a | 영문 소문자 |
    | A | 영문 대문자 |
    | i |  로마 숫자 소문자 |
    | I |  로마 숫자 대문자 |

---

### 2️⃣ 순서 없는 목록

```html
<ul>
	<li>항목1</li>
	<li>항목2</li>
</ul>
```

- 일반 글머리 기호

---

### 3️⃣ 설명 목록

```html
<dl>
	<dt>이름</dt>
	<dd>값</dd> <!--dd는 여러개 삽입 가능-->
</dl>
```

### ☑️ 표만들기

표(table)는 행(row)과 열(column), 셀(cell)로 이루어졌다.

### 기본 구조

```html
<table>
	<caption>표 제목</caption>
	<th>요소1</th>
	<th>요소2</th> <!--thead 태그-->
	<tr> <!--tbody 태그-->
		<td>1행 1열</td>
		<td>1행 2열</td>
	</tr>
	<tr>
		<td>2행 1열</td>
		<td>2행 1열</td>
	</tr>
</table>
```

### 행이나 열 합치기

```html
<td rowspan="합칠 셀의 개수">셀 내용</td>
<td colspan="합칠 셀의 개수">셀 내용</td>
```

- rowspan → 행을 합칠 때 사용
- colspan → 열을 합칠 때 사용

➕) 열에 스타일 적용 시 `<colgroup>`, `<col>`을 사용하여 style을 지정한다. 또한 제목 열을 <td>에서 <th>로 태그 수정을 하는 방식도 사용한다.

### 이미지, 오디오, 비디오 삽입

```html
<!--이미지 삽입-->
<img scr="이미지 파일 경로" alt="대체용 텍스트">
<img scr="이미지 파일 경로" alt="대체용 텍스트" width="% or px">

<!--멀티미디어 삽입-->
<object width="너비" height="높이" data="파일"></object>
<embed scr="파일경로" width="너비" height="높이"> 
<audio scr="오디오 파일 경로"></audio>
<vidio scr="비디오 파일 경로"></vidio>
```

- **height** 속성은 원래 이미지 크기의 높이 비율을 자동으로 계산해서 표시함
- **embed**는 다른 태그를 지원하지 않는 웹 브라우저를 고려할 때 사용할 수 있음.

### 하이퍼 링크

```html
<a href="링크할 주소">텍스트, 이미지</a>
```

- `target=”_blank”`를 사용할 경우, 새 창으로 이동

---

## 폼 삽입

*: 주문서, 사용자 입력*

```html
<form [속성="속성값"]>폼 요소</form>
```

자동 완성 기능 : `autocomplete="off"or"on"`

- **그룹으로 묶기**
    
    ```html
    <fieldset [속성="속성값"]></fieldset>
    
    <fieldset>
    	<legend>그룹 이름</legend>
    </fieldset>
    ```
    
    레이블 : 폼 요소에 레이블 붙일 때 사용함
    
    ```html
    <lable>레이블명<input type=""></lable>
    ```
    

### 사용자 입력

input 태그 type 종류

- search, url, email, tel의 경우 용도에 알맞게 입력 *(for-id)*
- **text, password**
    
    주요 속성
    
    | 종류 | 기능 |
    | --- | --- |
    | size | 필드 길이 지정 |
    | value | 텍스트 필드 요소가 표시될 때 보여주는 내용. password |
    | maxlength | 최대 문자 수 지정  |
- **number, range**
    
    
    | 속성 | 기능 |
    | --- | --- |
    | min | 최솟값, 기본 0 |
    | max | 최댓값, 기본 100 |
    | step | 숫자 간격 지정, 기본 1 |
    | value | 필드 초깃값  |
    
    ```html
    <input type="number" min="0" max="3" value="1">
    ```
    
- **submin, reset**
    
    ```html
    <input type="submit" value="주문하기">
    <input type="reset" value="취소하기">
    ```
    

### input 태그

1. **자동 입력 커서**

```html
<input type="" id="" autofocus required>
```

1. **힌트 표시**

```html
<input type="" id="" placeholder="">
```

placeholder=””에 내용 표시

