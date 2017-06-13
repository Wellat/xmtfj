<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String ctx = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="xmtfj">
    <title>厦门市商品房交易信息</title>

    <link href="<%=ctx%>static/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=ctx%>static/css/bootstrap.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src="<%=ctx%>static/js/echarts.min.js"></script>

</head>

<body>
<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header navbar-brand">厦门市商品房交易信息展示</div>
        <div class="navbar-collapse collapse" id="nav-wrap" style="height: 1px;"></div>
    </div>
</div>

<div class="container">
    <!--table-->
    <div class="row" style="padding-top: 66px">
        <div class="col-md-12 col-sm-12">
            <table class="table table-bordered">
                <caption align="center" style="font-size: 18px;"><strong>全市商品房基本信息</strong></caption>
                <tbody>
                <tr>
                    <th class="active" width="25%">在售楼盘总数</th>
                    <td width="25%"><fmt:formatNumber value="${houseInfo.onSellNum}" pattern="#,#00"/></td>
                    <th class="active">数据截止至</th>
                    <td width="25%"><fmt:formatDate value="${houseInfo.date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                </tr>
                <tr>
                    <th class="active">可售住宅套数</th>
                    <td><fmt:formatNumber value="${houseInfo.canSellNum}" pattern="#,#00.#"/></td>
                    <th class="active">批准住宅套数</th>
                    <td><fmt:formatNumber value="${houseInfo.allNum}" pattern="#,#00.#"/></td>
                </tr>
                <tr>
                    <th class="active">可售住宅面积(m^2)</th>
                    <td><fmt:formatNumber value="${houseInfo.canSellArea}" pattern="#,#00.#"/></td>
                    <th class="active">批准住宅面积(m^2)</th>
                    <td><fmt:formatNumber value="${houseInfo.allArea}" pattern="#,#00.#"/></td>
                </tr>
                <tr>
                    <th class="active">认购住宅套数</th>
                    <td><fmt:formatNumber value="${houseInfo.isSellNum}" pattern="#,#00.#"/></td>
                    <th class="active">认购住宅面积(m^2)</th>
                    <td><fmt:formatNumber value="${houseInfo.isSellArea}" pattern="#,#00.#"/></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <hr>
    <!--map && pie-->
    <div class="row">
        <div class="col-lg-6 col-md-6 col-xs-12 col-sm-12" style="padding-top: 20px;">
            <div id="chart1_1"
                 style="width:100%;height:450px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>
        </div>
        <div class="col-lg-6 col-md-6 col-xs-12 col-sm-12" style="padding-top: 20px">
            <div id="chart1_2"
                 style="width:100%;height:450px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12" style="padding: 10px 0px">
            <div class="col-md-1 col-sm-2">
                <span class="btn btn-sm btn-success" style="float:left">选择周期</span>
            </div>
            <div class="col-md-10 col-sm-10">
                <select class="form-control" style="float:left;width: 220px;" onchange="loadChartOut(value)">
                    <option value="10">最近10天</option>
                    <option value="30">最近一个月</option>
                    <option value="90">最近三个月</option>
                </select>
            </div>
        </div>
    </div>
    <hr>
    <!-- time zone x2 -->
    <div class="row">
        <div class="col-lg-6 col-md-6 col-xs-12 col-sm-12" style="padding-top: 20px">
            <div id="chart3_2"
                 style="width:100%;height:450px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>

            <div class="col-md-12 col-sm-12 col-xs-12" style="padding: 10px 0px">
                <span class="btn btn-sm btn-success" style="float:left">选择地区</span>
                <div class="col-md-10 col-sm-10">
                    <select class="form-control" style="float:left;width: 220px;" onchange="loadData(value)">
                        <option>厦门市</option>
                        <option>思明区</option>
                        <option>湖里区</option>
                        <option>集美区</option>
                        <option>同安区</option>
                        <option>翔安区</option>
                        <option>海沧区</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="col-lg-6 col-md-6 col-xs-12 col-sm-12" style="padding-top: 20px;">
            <div id="chart3_1"
                 style="width:100%;height:450px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>

        </div>
    </div>

    <hr>
</div>
<div style="height: 100px"></div>

<script src="<%=ctx%>static/js/jquery-1.9.1.min.js"></script>
<script src="<%=ctx%>static/js/xmMapJson.js"></script>
<script src="<%=ctx%>static/js/map&pie.js"></script>
<script src="<%=ctx%>static/js/spf_zoom.js"></script>
<script src="<%=ctx%>static/js/esf_zoom.js"></script>

<script src="<%=ctx%>static/js/bootstrap.min.js"></script>

</body>
</html>