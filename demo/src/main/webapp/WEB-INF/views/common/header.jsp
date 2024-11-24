<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header>
    <h1>사이트 제목</h1>
    <nav>
        <ul>
            <li><a href="/user/loginform">login</a></li>
            <li><a href="#" onclick="loadContent('/board',event)">board</a></li>
            <li><a href="#" onclick="loadContent('/another', '/api/anotherData', { hasData: true })">another</a></li>
        </ul>
    </nav>
</header>
