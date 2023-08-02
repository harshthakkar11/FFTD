<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FFTD</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/flag-icon.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/simple-line-icons.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/feather.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/adminResources/images/favicon.png" />
</head>
<body>
	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth">
				<div class="row w-100">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left p-5">
							<div class="brand-logo">
								<img
									src="<%=request.getContextPath()%>/adminResources/images/image.jpg"
									alt="logo">
							</div>
							<h4>New here?</h4>
							<h6 class="font-weight-light">Signing up is easy. It only
								takes a few steps</h6>
							<f:form class="pt-3" id="register" method="post"
								action="registerUser"
								onsubmit="return validateRegistrationForm()"
								modelAttribute="reg">
								<f:hidden path="registerId" />
								<f:hidden path="loginVo.loginId" />
								<div class="form-group">
									<f:input type="text" class="form-control form-control-lg"
										id="uname" placeholder="Username" path="loginVo.username" />
								</div>
								<div id="userNameErrMsg"
									style="color: red; text-align: left; margin-left: 10px;"></div>

								<%-- <div class="form-group">
									<f:input type="email" class="form-control form-control-lg"
										id="email" placeholder="Email" path="emailId"/>
								</div> --%>

								<div class="form-group">
									<f:input type="password" class="form-control form-control-lg"
										id="pass" placeholder="Password" path="loginVo.password" />
								</div>
								<div id="passwordErrMsg"
									style="color: red; text-align: left; margin-left: 10px;"></div>
								<div class="mt-3">
									<button
										class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn">SIGN
										UP</button>
								</div>
								<div class="text-center mt-4 font-weight-light">
									Already have an account? <a href="login" class="text-primary">Login</a>
								</div>
							</f:form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- inject:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<!-- endinject -->

	<!-- Extra js  -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/custom-validation.js"></script>
</body>

</html>