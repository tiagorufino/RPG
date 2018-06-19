<html>
	<head>
		<title>RPG</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="/RPG/js/Controll.js"></script>
		<script type="text/javascript">
			$("document").ready(function () {
				if($("#result").val()==""){
					$("#loginAlert").alert("close");
				}
			});
			$("document").keypress(function(event) {
		    	var keycode = (event.keyCode ? event.keyCode : event.which);
		    	if (keycode == '13') {
			        if($('#loginbutton').click() != ""){
			        	login();
			        };
		    	}
			});
		</script>
	</head>
<body>
	<div class="col-xs-2">
		<div class="row">
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-user"></i></span> <input id="login" type="text"
					class="form-control" name="login" placeholder="Login">
			</div>
		</div>
		<div class="row">
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-lock"></i></span> <input id="password"
					type="password" class="form-control" name="password"
					placeholder="Password">
			</div>
		</div>
		<div class="row">
			<button id=loginbutton class="btn-success" onclick=login()>LOGIN</button>
			<div class="alert alert-danger" id="loginAlert">
				<strong><h4 id=result></h4></strong>.
			</div>

		</div>
	</div>
</body>
</html>
