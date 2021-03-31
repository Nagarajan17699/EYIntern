<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>
</head>

<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-5 pt-5" style="margin-top: 125px;margin-left: 5%;">
				<h2>Welcome ${uname}</h2>

				<div class="row" style="margin-top: 15%;">
					
					<div class="col-sm-3">
						<form action="logout.do" method="post">
							<input type="hidden" name="formid" value="logout">
							<input class="btn btn-danger" type="submit" value="logout...">
						</form>
					</div>
					<div class="col-sm-3">
						<form action="shopping.do" method="post">
							<input type="hidden" name="formid" value="shop">
							<input type="hidden" name="shopid" value="shop0">
							<input class="btn btn-warning" type="submit" value="Shopping">
						</form>
					</div>
						
					
					<div class="col-sm-4"></div>
				</div>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>



	</form>
</body>

</html>