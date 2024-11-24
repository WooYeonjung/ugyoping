"use strict";

function loadContent(url,e) {
	e.preventDefault();
	
	axios.get(url)
		.then(response => {
			console.log("게시판 요청");
			document.getElementById("resultArea1").innerHTML = response.data;
			// LocalStorage에 데이터 저장 
			localStorage.setItem('boardList', response.data);
			// URL을 /board로 업데이트 
			window.history.pushState({}, '', '/board');

		}).catch(err => {
			alert(`게시만 목록 불러오기 실패 ${err.message}`);
		});
}
// 페이지 로드 시 LocalStorage에서 데이터를 로드 
window.onload = function() {
	const savedBoardList = localStorage.getItem('boardList');
	if (savedBoardList) {
		document.getElementById('resultArea1').innerHTML = savedBoardList;
	}
};

// 뒤로 가기 시 LocalStorage 초기화 
window.addEventListener('popstate', function(event) { 
	localStorage.removeItem('boardList'); 
	document.getElementById('resultArea1').innerHTML = ''; 
});

function boardWriteForm() {
	document.getElementById("resultArea1").innerHTML = "";
	let url = "/board/boardWriteForm";
	axios.get(url)
		.then(response => {
			console.log("글쓰기 폼");
			document.getElementById("resultArea1").innerHTML = response.data;
		}).catch(err => {
			console.log(`게시만 글쓰기 화면 불러오기 실패 ${err.message}`);
		});
}