<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Login</title>
<link rel="stylesheet"
	href="./template/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="./template/vendors/css/vendor.bundle.base.css">
<link rel="stylesheet" href="./template/css/style.css">
<link rel="shortcut icon" href="./template/images/favicon.png" />
<script src="./script/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="./script/login.js" type="text/javascript"></script>
</head>
<body>
	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="row w-100 m-0">
				<div
					class="content-wrapper full-page-wrapper d-flex align-items-center auth login-bg">
					<div class="card col-lg-4 mx-auto">
						<div class="card-body px-5 py-5">
							<h3 class="card-title text-left mb-3">Login</h3>
							<div class="form-group">
								<label>Username</label> <input type="text" id="username"
									class="form-control p_input">
							</div>
							<div class="form-group">
								<label>Password *</label> <input type="password" id="password"
									class="form-control p_input">
							</div>
							<div class="text-center">
								<button type="submit" id="login"
									class="btn btn-primary btn-block enter-btn">Login</button>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
			</div>
			<!-- row ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="../../assets/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="./template/js/off-canvas.js"></script>
	<script src="./template/js/hoverable-collapse.js"></script>
	<script src="./template/js/misc.js"></script>
	<script src="./template/js/settings.js"></script>
	<script src="./template/js/todolist.js"></script>
	<!-- endinject -->
</body>
</html>