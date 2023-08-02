<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LibertyUI Premium Bootstrap Admin Dashboard Template</title>
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
					<div class="row">
						<div class="col-12 grid-margin">
							<div class="card card-statistics">
								<div class="row">
									<div class="card-col col-xl-3 col-lg-3 col-md-3 col-6">
										<div class="card-body">
											<div
												class="d-flex align-items-center justify-content-center flex-column flex-sm-row">
												<i
													class="mdi mdi-account-multiple-outline text-primary mr-0 mr-sm-4 icon-lg"></i>
												<div class="wrapper text-center text-sm-left">
													<p class="card-text mb-0">New Users</p>
													<div class="fluid-container">
														<h3 class="card-title mb-0">65,650</h3>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="card-col col-xl-3 col-lg-3 col-md-3 col-6">
										<div class="card-body">
											<div
												class="d-flex align-items-center justify-content-center flex-column flex-sm-row">
												<i
													class="mdi mdi-checkbox-marked-circle-outline text-primary mr-0 mr-sm-4 icon-lg"></i>
												<div class="wrapper text-center text-sm-left">
													<p class="card-text mb-0">New Feedbacks</p>
													<div class="fluid-container">
														<h3 class="card-title mb-0">32,604</h3>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="card-col col-xl-3 col-lg-3 col-md-3 col-6">
										<div class="card-body">
											<div
												class="d-flex align-items-center justify-content-center flex-column flex-sm-row">
												<i
													class="mdi mdi-trophy-outline text-primary mr-0 mr-sm-4 icon-lg"></i>
												<div class="wrapper text-center text-sm-left">
													<p class="card-text mb-0">Employees</p>
													<div class="fluid-container">
														<h3 class="card-title mb-0">17,583</h3>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="card-col col-xl-3 col-lg-3 col-md-3 col-6">
										<div class="card-body">
											<div
												class="d-flex align-items-center justify-content-center flex-column flex-sm-row">
												<i class="mdi mdi-target text-primary mr-0 mr-sm-4 icon-lg"></i>
												<div class="wrapper text-center text-sm-left">
													<p class="card-text mb-0">Total Sales</p>
													<div class="fluid-container">
														<h3 class="card-title mb-0">61,119</h3>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4 col-sm-6 grid-margin stretch-card">
							<div class="card text-center">
								<div class="card-body">
									<img
										src="<%=request.getContextPath()%>/adminResources/images/face5.jpg"
										class="img-lg rounded-circle mb-2" alt="profile image" />
									<h4>Maria Johnson</h4>
									<p class="text-muted">Developer</p>
									<p class="mt-4 card-text">Lorem ipsum dolor sit amet,
										consectetuer adipiscing elit. Aenean commodo ligula eget
										dolor. Lorem</p>
									<button class="btn btn-primary btn-sm mt-3 mb-4">Follow</button>
									<div class="border-top pt-3">
										<div class="row">
											<div class="col-4">
												<h6>5896</h6>
												<p>Post</p>
											</div>
											<div class="col-4">
												<h6>1596</h6>
												<p>Followers</p>
											</div>
											<div class="col-4">
												<h6>7896</h6>
												<p>Likes</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body pb-0">
									<div class="wrapper border-bottom">
										<h5 class="mb-0 text-gray">Top Products</h5>
										<h1 class="mb-0">598,486</h1>
										<p class="mb-4">6.5% change from today</p>
									</div>
									<div class="pt-4 wrapper">
										<h5 class="mb-0 text-gray">Support Cases</h5>
										<h1 class="mb-0">323,360</h1>
										<p>2.5% change from yesterday</p>
									</div>
								</div>
								<canvas id="product-area-chart" height="200"></canvas>
							</div>
						</div>
						<div class="col-md-4 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div class="w-75 mx-auto">
										<div class="d-flex justify-content-between text-center mb-2">
											<div class="wrapper">
												<h4>6,256</h4>
												<small class="text-muted">Total sales</small>
											</div>
											<div class="wrapper">
												<h4>8569</h4>
												<small class="text-muted">Open Campaign</small>
											</div>
										</div>
									</div>
									<div id="morris-line-example" style="height: 250px;"></div>
									<div class="w-75 mx-auto">
										<div class="d-flex justify-content-between text-center mt-5">
											<div class="wrapper">
												<h4>5136</h4>
												<small class="text-muted">Online Sales</small>
											</div>
											<div class="wrapper">
												<h4>4596</h4>
												<small class="text-muted">Store Sales</small>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 grid-margin">
							<div class="card">
								<div class="table-responsive">
									<table class="table center-aligned-table">
										<thead>
											<tr class="bg-light">
												<th class="border-bottom-0">ID</th>
												<th class="border-bottom-0">Assignee</th>
												<th class="border-bottom-0">Task Details</th>
												<th class="border-bottom-0">Payment Method</th>
												<th class="border-bottom-0">Payment Status</th>
												<th class="border-bottom-0">Amount</th>
												<th class="border-bottom-0">Tracking Number</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>#320</td>
												<td>Mark C.Diaz</td>
												<td>Support of thteme</td>
												<td>Credit card</td>
												<td><label class="badge badge-success">Approved</label></td>
												<td>$12,245</td>
												<td>JPBBN435893458</td>
											</tr>
											<tr>
												<td>#321</td>
												<td>Jose D</td>
												<td>Verify your email address !</td>
												<td>Internet banking</td>
												<td><label class="badge badge-warning">Pending</label></td>
												<td>$12,245</td>
												<td>BDYBN435893325</td>
											</tr>
											<tr>
												<td>#322</td>
												<td>Philips T</td>
												<td>Item support message send</td>
												<td>Credit card</td>
												<td><label class="badge badge-success">Approved</label></td>
												<td>$12,245</td>
												<td>JSNTN435884258</td>
											</tr>
											<tr>
												<td>#323</td>
												<td>Luke Pixel</td>
												<td>New submission on website</td>
												<td>Cash on delivery</td>
												<td><label class="badge badge-danger">Rejected</label></td>
												<td>$12,245</td>
												<td>JPABT435893678</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title">The Current Chart</h5>
									<canvas id="current-chart" height="100"></canvas>
								</div>
								<div class="border-top py-4 px-4">
									<p class="mb-0 text-gray">Projects Status</p>
									<div class="d-flex align-items-end">
										<h2 class="mb-0 display-2 font-weight-semibold">76,533</h2>
										<p class="mb-2 ml-1">PCS</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title">Updates</h5>
									<ul class="bullet-line-list">
										<li>
											<h6>User confirmation</h6>
											<p class="mb-0">Donec rutrum congue leo eget malesuada.</p>
											<p class="text-muted">
												<i class="mdi mdi-clock"></i> 7 months ago.
											</p>
										</li>
										<li>
											<h6>Continuous evaluation</h6>
											<p class="mb-0">Vivamus suscipit tortor eget felis
												porttitor volutpat.</p>
											<p class="text-muted">
												<i class="mdi mdi-clock"></i> 7 months ago.
											</p>
										</li>
										<li>
											<h6>Promotion</h6>
											<p class="mb-0">Curabitur non nulla sit amet nisl tempus
												convallis quis ac lectus.</p>
											<p class="text-muted">
												<i class="mdi mdi-clock"></i> 7 months ago.
											</p>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-12 grid-margin">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title mb-4">Manage Tickets</h5>
									<div class="fluid-container">
										<div class="row ticket-card mt-3 pb-2 border-bottom pb-3 mb-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="<%=request.getContextPath()%>/adminResources/images/face1.jpg"
													alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-bold mr-2 mb-0 no-wrap">James
														:</p>
													<p class="font-weight-medium mr-1 mb-0">[#23047]</p>
													<p class="font-weight-semibold mb-0 ellipsis">Donec
														rutrum congue leo eget malesuada.</p>
												</div>
												<p class="text-small text-gray mb-2">Donec rutrum congue
													leo eget malesuada. Quisque velit nisi, pretium ut lacinia
													in, elementum id enim vivamus.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted text-muted">Last
															responded :</p>
														<p class="Last-responded mr-2 mb-0 text-muted text-muted">3
															hours ago</p>
													</div>
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted text-muted">Due in :</p>
														<p class="Last-responded mr-2 mb-0 text-muted text-muted">2
															Days</p>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-primary dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Manage</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"><i
															class="fa fa-reply fa-fw"></i>Quick reply</a> <a
															class="dropdown-item" href="#"><i
															class="fa fa-history fa-fw"></i>Another action</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"><i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue</a>
														<a class="dropdown-item" href="#"><i
															class="fa fa-times text-danger fa-fw"></i>Close Issue</a>
													</div>
												</div>
											</div>
										</div>
										<div class="row ticket-card mt-3 pb-2 border-bottom pb-3 mb-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="<%=request.getContextPath()%>/adminResources/images/face2.jpg"
													alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-bold mr-2 mb-0 no-wrap">Stella
														:</p>
													<p class="font-weight-medium mr-1 mb-0">[#23135]</p>
													<p class="font-weight-semibold mb-0 ellipsis">Curabitur
														aliquet quam id dui posuere blandit.</p>
												</div>
												<p class="text-small text-gray mb-2">Pellentesque in
													ipsum id orci porta dapibus. Sed porttitor lectus nibh.
													Curabitur non nulla sit amet nisl.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted">Last responded :</p>
														<p class="Last-responded mr-2 mb-0 text-muted">3 hours
															ago</p>
													</div>
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted">Due in :</p>
														<p class="Last-responded mr-2 mb-0 text-muted">2 Days</p>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-primary dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Manage</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"><i
															class="fa fa-reply fa-fw"></i>Quick reply</a> <a
															class="dropdown-item" href="#"><i
															class="fa fa-history fa-fw"></i>Another action</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"><i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue</a>
														<a class="dropdown-item" href="#"><i
															class="fa fa-times text-danger fa-fw"></i>Close Issue</a>
													</div>
												</div>
											</div>
										</div>
										<div class="row ticket-card mt-3">
											<div class="col-md-1">
												<img class="img-sm rounded-circle mb-4 mb-md-0"
													src="<%=request.getContextPath()%>/adminResources/images/face3.jpg"
													alt="profile image">
											</div>
											<div class="ticket-details col-md-9">
												<div class="d-flex">
													<p class="text-dark font-weight-bold mr-2 mb-0 no-wrap">John
														Doe :</p>
													<p class="font-weight-medium mr-1 mb-0">[#23246]</p>
													<p class="font-weight-semibold mb-0 ellipsis">Mauris
														blandit aliquet elit, eget tincidunt nibh pulvinar.</p>
												</div>
												<p class="text-small text-gray mb-2">Nulla quis lorem ut
													libero malesuada feugiat. Proin eget tortor risus. Lorem
													ipsum dolor sit amet.</p>
												<div class="row text-gray d-md-flex d-none">
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted">Last responded :</p>
														<p class="Last-responded mr-2 mb-0 text-muted">3 hours
															ago</p>
													</div>
													<div class="col-4 d-flex">
														<p class="mb-0 mr-2 text-muted">Due in :</p>
														<p class="Last-responded mr-2 mb-0 text-muted">2 Days</p>
													</div>
												</div>
											</div>
											<div class="ticket-actions col-md-2">
												<div class="btn-group dropdown">
													<button type="button"
														class="btn btn-primary dropdown-toggle btn-sm"
														data-toggle="dropdown" aria-haspopup="true"
														aria-expanded="false">Manage</button>
													<div class="dropdown-menu">
														<a class="dropdown-item" href="#"><i
															class="fa fa-reply fa-fw"></i>Quick reply</a> <a
															class="dropdown-item" href="#"><i
															class="fa fa-history fa-fw"></i>Another action</a>
														<div class="dropdown-divider"></div>
														<a class="dropdown-item" href="#"><i
															class="fa fa-check text-success fa-fw"></i>Resolve Issue</a>
														<a class="dropdown-item" href="#"><i
															class="fa fa-times text-danger fa-fw"></i>Close Issue</a>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->


				<!-- partial:partials/_footer.html -->
				<jsp:include page="footer.jsp"></jsp:include>
				<!-- partial -->
				
				
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
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>
</html>