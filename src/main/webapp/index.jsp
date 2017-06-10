<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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

    <link href="static/css/font-awesome.min.css" rel="stylesheet">
    <link href="static/css/bootstrap.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src="static/js/echarts.min.js"></script>


</head>

<body>
<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header navbar-brand">厦门市商品房交易信息展示</div>
        <div class="navbar-collapse collapse" id="nav-wrap" style="height: 1px;"></div><!--/.nav-collapse -->
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-lg-6 col-md-6 col-xs-12 col-sm-12" style="padding-top: 66px">
            <div id="xmMap"
                 style="width:100%;height:600px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>
        </div>
    </div>
    <div class="row" style="padding:20px 0px">
        <div class="col-lg-12 col-md-12">
            <div id="second"
                 style="width:100%;height:600px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-1">

            <button type="button" class="btn btn-sm btn-success" onclick="refresh(true)">刷 新</button>
        </div>
        <!--<div class="col-md-1">-->
        <!--<span class="text-primary">切换主题</span>-->
        <!--</div>-->
        <div class="col-md-3">
            <select class="form-control" style="float:left" onchange="loadData(value)">
                <option>厦门市</option>
                <option>思明区</option>
                <option>湖里区</option>
                <option>集美区</option>
                <option>同安区</option>
                <option>翔安区</option>
                <option>海沧区</option>
            </select>
        </div>
        <span id="wrong-message" style="color:red"></span>
    </div>

    <div class="row" style="padding:20px 0px">
        <div class="col-lg-12 col-md-12">
            <div id="third"
                 style="width:100%;height:600px;border:1px solid #ccc;padding:10px;float:left;overflow:hidden;"></div>
        </div>
    </div>
</div>
</div>
<div style="height: 300px"></div>

<script src="static/js/jquery-1.9.1.min.js"></script>
<script src="static/js/xmMapJson.js"></script>
<script src="static/js/xmMap.js"></script>
<script src="static/js/second.js"></script>
<script src="static/js/third_test.js"></script>


<script src="static/js/bootstrap.min.js"></script>

</body>
</html>