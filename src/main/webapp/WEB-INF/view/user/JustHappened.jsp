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
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/fontawesome-stars.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/select2.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/select2-bootstrap.min.css">
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


		<!-- partial:partials/_navbar.html -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- partial -->


		<div class="container-fluid page-body-wrapper">
			<div id="right-sidebar" class="settings-panel">
				<i class="settings-close mdi mdi-close"></i>
				<ul class="nav nav-tabs" id="setting-panel" role="tablist">
					<li class="nav-item"><a class="nav-link active" id="todo-tab"
						data-toggle="tab" href="#todo-section" role="tab"
						aria-controls="todo-section" aria-expanded="true">TO DO LIST</a></li>
					<li class="nav-item"><a class="nav-link" id="chats-tab"
						data-toggle="tab" href="#chats-section" role="tab"
						aria-controls="chats-section">CHATS</a></li>
				</ul>
				<div class="tab-content" id="setting-content">
					<div class="tab-pane fade show active scroll-wrapper"
						id="todo-section" role="tabpanel" aria-labelledby="todo-section">
						<div class="add-items d-flex px-3 mb-0">
							<form class="form w-100">
								<div class="form-group d-flex">
									<input type="text" class="form-control todo-list-input"
										placeholder="Add To-do">
									<button type="submit"
										class="add btn btn-primary todo-list-add-btn" id="add-task">Add</button>
								</div>
							</form>
						</div>
						<div class="list-wrapper px-3">
							<ul class="d-flex flex-column-reverse todo-list">
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Team review meeting
											at 3.00 PM
										</label>
									</div> <i class="remove mdi mdi-close-circle-outline"></i>
								</li>
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Prepare for
											presentation
										</label>
									</div> <i class="remove mdi mdi-close-circle-outline"></i>
								</li>
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Resolve all the low
											priority tickets due today
										</label>
									</div> <i class="remove mdi mdi-close-circle-outline"></i>
								</li>
								<li class="completed">
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox" checked> Schedule
											meeting for next week
										</label>
									</div> <i class="remove mdi mdi-close-circle-outline"></i>
								</li>
								<li class="completed">
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox" checked> Project
											review
										</label>
									</div> <i class="remove mdi mdi-close-circle-outline"></i>
								</li>
							</ul>
						</div>
						<div class="events py-4 border-bottom px-3">
							<div class="wrapper d-flex mb-2">
								<i class="mdi mdi-circle-outline text-primary mr-2"></i> <span>Feb
									11 2018</span>
							</div>
							<p class="mb-0 font-weight-thin text-gray">Creating component
								page</p>
							<p class="text-gray mb-0">build a js based app</p>
						</div>
						<div class="events pt-4 px-3">
							<div class="wrapper d-flex mb-2">
								<i class="mdi mdi-circle-outline text-primary mr-2"></i> <span>Feb
									7 2018</span>
							</div>
							<p class="mb-0 font-weight-thin text-gray">Meeting with Alisa</p>
							<p class="text-gray mb-0 ">Call Sarah Graves</p>
						</div>
					</div>
					<!-- To do section tab ends -->
					<div class="tab-pane fade" id="chats-section" role="tabpanel"
						aria-labelledby="chats-section">
						<div
							class="d-flex align-items-center justify-content-between border-bottom">
							<p
								class="settings-heading border-top-0 mb-3 pl-3 pt-0 border-bottom-0 pb-0">Friends</p>
							<small
								class="settings-heading border-top-0 mb-3 pt-0 border-bottom-0 pb-0 pr-3 font-weight-normal">See
								All</small>
						</div>
						<ul class="chat-list">
							<li class="list active">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face1.jpg"
										alt="image"><span class="online"></span>
								</div>
								<div class="info">
									<p>Thomas Douglas</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">19 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face2.jpg"
										alt="image"><span class="offline"></span>
								</div>
								<div class="info">
									<div class="wrapper d-flex">
										<p>Catherine</p>
									</div>
									<p>Away</p>
								</div>
								<div class="badge badge-success badge-pill my-auto mx-2">4</div>
								<small class="text-muted my-auto">23 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face3.jpg"
										alt="image"><span class="online"></span>
								</div>
								<div class="info">
									<p>Daniel Russell</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">14 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face4.jpg"
										alt="image"><span class="offline"></span>
								</div>
								<div class="info">
									<p>James Richardson</p>
									<p>Away</p>
								</div> <small class="text-muted my-auto">2 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face5.jpg"
										alt="image"><span class="online"></span>
								</div>
								<div class="info">
									<p>Madeline Kennedy</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">5 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face6.jpg"
										alt="image"><span class="online"></span>
								</div>
								<div class="info">
									<p>Sarah Graves</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">47 min</small>
							</li>
						</ul>
					</div>
					<!-- chat tab ends -->
				</div>
			</div>
			<!-- partial -->


			<!-- partial:partials/_sidebar.html -->
			<jsp:include page="menu.jsp"></jsp:include>
			<!-- partial -->


			<div class="main-panel">
				<div class="content-wrapper">
					<!-- content-wrapper ends -->


					<div class="modal fade" id="exampleModal-4" tabindex="-1"
						aria-labelledby="ModalLabel" style="display: none;"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="ModalLabel">Post an event</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">×</span>
									</button>
								</div>
								<f:form action="saveJustHappenedPost" method="post"
									modelAttribute="justHappenedVo">
									<div class="modal-body">
										<div class="form-group">
											<input type="file" name="img[]" class="file-upload-default">
											<div class="input-group col-xs-12">
												<f:input type="text" id="fileName"
													class="form-control file-upload-info" disabled=""
													placeholder="Upload Image" path="justHappenedFileName" />
												<div class="input-group-append">
													<button id="upload" class="file-upload-browse btn btn-info"
														type="button" style="margin-right: 5px;">Upload</button>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Event Name</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="20" name="comment"
													id="defaultconfig-2" type="text" path="eventName" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Year</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="20" name="comment"
													id="defaultconfig-2" type="text" path="year" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Comment</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="20" name="comment"
													id="defaultconfig-2" type="text" path="comment" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Expiration Time</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="20" name="expDays"
													id="defaultconfig-2" type="text" placeholder="Days"
													path="expDays" />
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success">Post</button>
										<button type="button" class="btn btn-light"
											data-dismiss="modal">Close</button>
									</div>
								</f:form>
							</div>
						</div>
					</div>
					<button type="button" class="btn btn-info" data-toggle="modal"
						style="margin-bottom: 10px;" data-target="#exampleModal-4"
						data-whatever="@mdo">Post</button>


					<div class="row grid-margin">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title"></h4>
									<div id="lightgallery" class="row lightGallery">
										<c:forEach items="${list}" var="i">
											<a
												href="<%=request.getContextPath()%>/adminResources/images/${i.justHappenedFileName}"
												class="image-tile"><img
												src="<%=request.getContextPath()%>/adminResources/images/${i.justHappenedFileName}"
												alt="image small"></a>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!-- partial:partials/_footer.html -->
					<jsp:include page="footer.jsp"></jsp:include>
					<!-- partial -->


				</div>
			</div>

		</div>
		<!-- main-panel ends -->
	</div>
	<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->

	<!-- plugins:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/Chart.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/progressbar.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bootstrap-datepicker.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.barrating.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.sparkline.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/raphael.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/morris.min.js"></script>
	<!-- End plugin js for this page-->
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
	<script
		src="<%=request.getContextPath()%>/adminResources/js/icheck.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/select2.min.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dashboard.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/select2.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/file-upload.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/iCheck.js"></script>
	<!-- End custom js for this page-->
</body>
</html>