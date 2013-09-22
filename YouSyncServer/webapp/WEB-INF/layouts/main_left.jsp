<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
	
	<!-- BEGIN SIDEBAR -->

		<div class="page-sidebar nav-collapse collapse">

			<!-- BEGIN SIDEBAR MENU -->        

			<ul class="page-sidebar-menu">

				<li>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

					<div class="sidebar-toggler hidden-phone"></div>

					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->

				</li>

				
			<li id="account" class="start ">

					<a href="${ctx}/account/user/">

					<i class="icon-user"></i> 

					<span class="title">用户管理</span>

					</a>

			</li>
			
			<li id="content" >

					<a href="${ctx}/soft/">

					<i class="icon-th"></i> 

					<span class="title">内容管理</span>

					</a>

			</li>
			
			<li id="channel" >

					<a href="${ctx}/channel/">

					<i class="icon-list-ul"></i> 

					<span class="title">渠道管理</span>

					</a>

			</li>
				

			<li  id="stat" class="last ">

					<a href="">

					<i class="icon-bar-chart"></i> 

					<span class="title">统计报表</span>

					<span class="arrow "></span>

					</a>

					<ul class="sub-menu">

						<li id="lastrecord">

							<a href="${ctx}/stat/newlist">

							最新记录</a>

						</li>

						<li id="userstat">

							<a href="">

							渠道用户报表</a>

						</li>

						<li id="softstat">

							<a href="">

							软件安装量报表</a>

						</li>

						

					</ul>

				</li>

				

			</ul>

			<!-- END SIDEBAR MENU -->

		</div>

		<!-- END SIDEBAR -->