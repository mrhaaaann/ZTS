<%--
	화면명 : 상품 관리 > 속성 관리 > 속성 목록
	작성자 : peter
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<jsp:include page="/WEB-INF/views/gsf/layout/pageHeader.jsp" flush="true"/>
<script type="text/javascript" src="/resources/js/app/pms.app.attribute.list.js"></script>

<article class="con_box" ng-app="attrApp" ng-controller="pms_attributeListApp_controller as ctrl">
	<div class="wrap_popup">
		<h1 class="sub_title1"><spring:message code="c.pmsAttribute.title1" /></h1>

		<div class="box_type1">
			<table class="tb_type1">
				<colgroup>
					<col class="col_142" />
					<col class="col_auto" />
				</colgroup>
				<tbody>
					<tr>
						<th><spring:message code="c.pmsAttribute.type" /></th>
						<td>
							<checkbox-list ng-model="search.attributeType" code-group="ATTRIBUTE_TYPE_CD" all-check ></checkbox-list>
						</td>
					</tr>
					<tr>
						<th><spring:message code="pmsAttribute.name" /></th>
						<td>
							<input type="text" ng-model="search.name" style="width: 22.5%;"/>
						</td>
					</tr>
				</tbody>
			</table>
		</div>

		<div class="btn_alignR">
			<button type="button" class="btn_type1" ng-click="ctrl.reset()" >
				<b><spring:message code="c.search.btn.reset" /></b>
			</button>
			<button type="button" class="btn_type1 btn_type1_purple" ng-click="myGrid.loadGridData()" >
				<b><spring:message code="c.search.btn.search" /></b>
			</button>
		</div>

		<div class="btn_alignR marginT3" >
			<button type="button" class="btn_type1" ng-click="ctrl.insertAttrPopup()">
				<b><spring:message code="c.pmsAttribute.btn.register" /></b>
			</button>
			<button type="button" class="btn_type1" ng-click="ctrl.saveGridData()">
				<b><spring:message code="common.btn.save" /></b>
			</button>
		</div>

		<div class="box_type1 marginT1">
			<h3 class="sub_title2">
				<spring:message code="c.pmsAttribute.title2" />
				<span><spring:message code="c.search.totalCount" arguments="{{ grid_attr.totalItems }}" /></span>
			</h3>
			
			<div class="tb_util tb_util_rePosition">
				<!-- <button type="button" class="btn_tb_util tb_util1" ng-click="myGrid.initGrid()">되돌리기</button> -->
				<button type="button" class="btn_tb_util tb_util2" ng-click="myGrid.exportExcel('attribute')">엑셀받기</button>
				<!-- <button type="button" class="btn_tb_util tb_util5" ng-click="ctrl.addRow()">행추가</button> -->
			</div>

			<div class="gridbox" >
				<div class="grid" ui-grid="grid_attr"
					ui-grid-move-columns
					ui-grid-row-edit
					ui-grid-resize-columns 
					ui-grid-pagination
					ui-grid-auto-resize
					ui-grid-cell-nav
					ui-grid-selection 
					ui-grid-exporter
					ui-grid-edit
					ui-grid-validate></div>
			</div>
		</div>
		
	</div>
</article>

<jsp:include page="/WEB-INF/views/gsf/layout/pageFooter.jsp" flush="true"/>