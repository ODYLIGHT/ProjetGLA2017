
<%
	String check = (String) session.getAttribute("skey");
	String login = "";

	if (check != null) {
		login = (String) session.getAttribute("sLogin");
		

	} else {
		response.sendRedirect("index.jsp");
	}
%>
<header >

<div  class=" barreBleue container col-md-10 col-md-offset-1  col-xs-12"></div>

<div  class=" container col-md-10 col-md-offset-1  col-xs-12">
	<img class="img-responsive" alt="logo VNU ktx" src="image/banniereRevu.JPG" width="auto"> 
	<!-- <img alt="logo VNU" src="image/logoDHQG.jpg" height="120px">  -->
	<!-- <img alt="logo VNU" src="image/ktx.jpg" width="100px" height="120px" align="right"> -->
</div>

<div  style="height:80px" class=" barreBleue container col-md-10 col-md-offset-1  col-xs-12">

<h4 align="center">Bienvenue sur KTX My Dinh Online Payement ! En poursuivant votre navigation, vous acceptez l'utilisation de cookies.</h4> 
<%=login%> &nbsp;&nbsp; &nbsp;	&nbsp;<a href="index.jsp"><font color="white">logout</font></a>

</div>
 
</header>
