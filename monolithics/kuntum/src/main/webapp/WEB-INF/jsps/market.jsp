<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>MarketInclusif</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>

</head>

<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

	<div id="bg1" data-0="background-position:0px 0px;"
		data-end="background-position:-500px -10000px;"></div>
	<div id="bg2" data-0="background-position:0px 0px;"
		data-end="background-position:-500px -8000px;"></div>
	<div id="bg3" data-0="background-position:0px 0px;"
		data-end="background-position:-500px -6000px;"></div>

	<div id="progress" data-0="width:0%;background:hsl(200, 100%, 50%);"
		data-end="width:100%;background:hsl(920, 100%, 50%);"></div>

	<div id="intro"
		data-0="opacity:1;top:3%;transform:rotate(0deg);transform-origin:0 0;"
		data-500="opacity:0;top:-10%;transform:rotate(-90deg);">
		<img src="/niounimages/bsSplashScreen.gif" width="300" height="300"
			alt="logo">
		<h1>CERCLES</h1>

		<h2>ECOLOGINOMIQUES</h2>

		<h3>MARCHES DE L' ENTRE SOI PARTICIPATIF</h3>
		<p class="arrows">▼&nbsp;▼&nbsp;▼</p>
	</div>

	<div id="transform" data-500="opacity:0;" data-1000="opacity:1;"
		data-1600="opacity:1;" data-1700="opacity:0;">
		<h2>STYLISME</h2>

		<div data-500="left:-100%;" data-1000="left:10%;"
			data-1600="left:10%;" data-1700="left:-100%;">
			<a href="pages/AichArt/index.html"> <img
				src="/nioun/images/logoAiChar.png" width="300" height="300"
				alt="indexIconeAichar" /></a>
		</div>



		<div data-500="right:-100%;" data-1000="right:0%;"
			data-1600="right:0%;" data-1700="right:-100%;">



			<div id="carouselExampleCaptions" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleCaptions" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
					<li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">

					<div class="carousel-item active">
						<img src="/nioun/images/blueBlackBerrm.png" class="d-block w-100"
							alt="blueBlackBerrm">
						<div class="carousel-caption d-none d-md-block">
							<h5>Blue , Black Bermuda</h5>
							<p>Bermuda Bleu Noir Patch</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/blueCreenJack.png" class="d-block w-100"
							alt="blueCreenJack">
						<div class="carousel-caption d-none d-md-block">
							<h5>Blue Green Jack</h5>
							<p>Jack en Vert Grisatre</p>
						</div>
					</div>


					<div class="carousel-item">
						<img src="/nioun/images/blueGreeEnsShirt.png"
							class="d-block w-100" alt="blueGreeEnsShirt">
						<div class="carousel-caption d-none d-md-block">
							<h5>Ensemble Bleu Gris</h5>
							<p>Blue Green Ensemble Shirt</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/greenBlueBackJack.png"
							class="d-block w-100" alt="greenBlueBackJack">
						<div class="carousel-caption d-none d-md-block">
							<h5>Green Blue Back Jack</h5>
							<p>Jack Bleu Vert De Dos</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/jackArgente.png" class="d-block w-100"
							alt="jackArgenté">
						<div class="carousel-caption d-none d-md-block">
							<h5>Jack Argenté</h5>
							<p>Jack Argenté Sérigraphié</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/jackBlackRed.png" class="d-block w-100"
							alt="jackBlackRed">
						<div class="carousel-caption d-none d-md-block">
							<h5>Red & Black Hoodie</h5>
							<p>Gilet Capuchon Rouge Noir Matelassé</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/jackGris.png" class="d-block w-100"
							alt="jackGris">
						<div class="carousel-caption d-none d-md-block">
							<h5>Jack Gris Cintré</h5>
							<p>Jack Cossu Gris - Intérieur "Ecossais"</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/jackHuileBlue.png" class="d-block w-100"
							alt="jackHuileBlue">
						<div class="carousel-caption d-none d-md-block">
							<h5>Jack Bleu Marine</h5>
							<p>Jack Bleu De Nuit Satiné</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/jackHuileBlue2.png" class="d-block w-100"
							alt="jackHuileBlue2">
						<div class="carousel-caption d-none d-md-block">
							<h5>Jack Bleu Marine 2</h5>
							<p>Jack Bleu De Nuit Satiné Back</p>
						</div>
					</div>


					<div class="carousel-item">
						<img src="/nioun/images/pullPatchGondi.png" class="d-block w-100"
							alt="pullPatchGondi">
						<div class="carousel-caption d-none d-md-block">
							<h5>Pull Patch Hybride</h5>
							<p>Chic Pull Patch OverGondi</p>
						</div>
					</div>

					<div class="carousel-item">
						<img src="/nioun/images/shirtPatchMar.png" class="d-block w-100"
							alt="shirtPatchMar">
						<div class="carousel-caption d-none d-md-block">
							<h5>T-Shirt Patch</h5>
							<p>T Shirt Patché Illustraté</p>
						</div>
					</div>

				</div>
				<a class="carousel-control-prev" href="#carouselExampleCaptions"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleCaptions"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>




		</div>





	</div>

	<div id="properties" data-1700="top:100%;" data-2200="top:0%;"
		data-3000="display:block;" data-3300="top:-100%;display:none;">
		<h2>EBENISTERIE</h2>
		<div data-1700="left:-100%;" data-2200="left:10%;"
			data-3000="left:10%;" data-3300="left:-100%;">
			<a href="pages/famaMenuiserie/index.html"> <img
				src="images/logMenWeb.png" width="280" height="280"
				alt="indexIconeFaman" /></a>
		</div>

		<div data-1700="right:-100%;" data-2200="right:10%;"
			data-3000="right:10%;" data-3300="right:-100%;">

			<div id="slideshow">
				<ul>
					<li id="armCoiff"><img src="images/famanu/armCoiff.png"
						alt="armCoiff" /></li>
					<li id="blackWhiteCAC"><img
						src="images/famanu/blackWhiteCAC.png" alt="blackWhiteCAC" /></li>
					<li id="cuis03"><img src="images/famanu/cuis03.png"
						alt="cuis03" /></li>
					<li id="cuis04"><img src="images/famanu/cuis04.png"
						alt="cuis04" /></li>
					<li id="esc001"><img src="images/famanu/esc001.jpg"
						alt="esc001" /></li>
					<li id="esc0022-tn"><img src="images/famanu/esc002-tn.jpg"
						alt="esc002-tn" /></li>
					<li id="lav04"><img src="images/famanu/lav04.png" alt="lav04" />
					</li>
					<li id="plac01"><img src="images/famanu/plac01.png"
						alt="plac01" /></li>
					<li id="plac03"><img src="images/famanu/plac03.png"
						alt="plac03" /></li>
					<li id="port007W"><img src="images/famanu/port007W.png"
						alt="port007W" /></li>
					<li id="porte013Web"><img src="images/famanu/porte013Web.png"
						alt="porte013Web" /></li>
				</ul>
			</div>

			<div id="slideshow-nav">
				<ul>
					<li><a href="#armCoiff">armCoiff</a></li>
					<li><a href="#blackWhiteCAC">blackWhiteCAC </a></li>
					<li><a href="#cuis03"> cuis03 </a></li>
					<li><a href="#cuis04"> cuis04</a></li>
					<li><a href="esc001">esc001</a></li>
					<li><a href="#esc002-tn">esc002-tn</a></li>
					<li><a href="#lav04"> lav04</a></li>
					<li><a href="#plac01">plac01</a></li>
					<li><a href="#plac03">plac03</a></li>
					<li><a href="#port007W">port007W</a></li>
					<li><a href="#porte013Web">porte013Web</a></li>
				</ul>

			</div>

		</div>

	</div>

	<div id="easing_wrapper">

		<div id="easing" data-3300="display:none;left:-100%;"
			data-3500="display:block; left:40%;top:0%;"
			data-4400="left:10%;display:block;top:0%;"
			data-5100="left:200%;display:none;top:-100%">
			<h2>METALLURGIE</h2>

		</div>

		<div id="download" data-5100="display:none;left:-100%;opacity:0%;"
			data-5500="display:block; left:30%;top:0%;opacity:100%"
			data-7000="left:10%;display:block;top:-100%;"
			data-7300="left:100%;display:none;">
			<h2>TECHNOLOGIE</h2>

		</div>
	</div>
	<div id="scrollbar" data-0="top:0%;margin-top:2px;"
		data-end="top:100%;margin-top:-52px;"></div>
	
	<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>