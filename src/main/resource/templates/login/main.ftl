<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>文章列表</title>
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link href="js/plugins/layer/layui.css" rel="stylesheet">
     <link href="js/plugins/layer/layim/layim.css" rel="stylesheet">
	<style type="text/css">
		dd {
		    line-height: inherit;
		}
		.ps1{
			position:fixed; 
			width: 100%;
		}
		.ps2{
			margin-top: 5%;
		}
		.ps3{
			float: right!important;
		}
		
		.ps4{
			    font-style: italic;
    			font-size: 20px;
		}
		::-webkit-scrollbar {
		    width: 0px;
		    background-color: #F5F5F5;
		}
	</style>
</head>

<body class="gray-bg">
<div  class="gray-bg dashbard-1">
        <div class="ps1 layui-header">
                    <ul class="layui-nav layui-bg-green">
					  <li class="layui-nav-item ps4">您学习与娱乐的私人空间</li>
					  <li class="layui-nav-item ps3" lay-unselect="">
					    <a href="javascript:;"><img src="img/aixin.jpg" class="layui-nav-img">${userName!""}</a>
					    <dl class="layui-nav-child">
					      <dd><a href="javascript:;">修改信息</a></dd>
					      <dd><a href="javascript:;">安全管理</a></dd>
					      <dd><a href="javascript:;">退了</a></dd>
					    </dl>
					  </li>
					  <li class="layui-nav-item ps3">
					    <a href="">个人中心<span class="layui-badge-dot"></span></a>
					  </li>
					  <li class="layui-nav-item ps3"><a href="">墨绿导航</a></li>
					  <li class="layui-nav-item layui-this ps3"><a href="">文章</a></li>
					  <li class="layui-nav-item ps3"><a href="">大数据</a></li>
					  <li class="layui-nav-item ps3">
					    <a href="javascript:;">解决方案</a>
					    <dl class="layui-nav-child">
					      <dd><a href="">移动模块</a></dd>
					      <dd><a href="">后台模版</a></dd>
					      <dd><a href="">电商平台</a></dd>
					    </dl>
					  </li>
					</ul>
					</div>
					<#include "/article/articlelist.ftl">
        </div>
    </div>

    <!-- 全局js -->
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/plugins/layer/layui.js"></script>
    <!-- 自定义js -->
    <script src="js/content.js?v=1.0.0"></script>
	
    <!--统计代码，可删除-->
	<script>
	layui.use(['layer', 'element'], function(){
	  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
	  //监听导航点击
	  var layer = layui.layer;
	  element.on('nav(demo)', function(elem){
	    //console.log(elem)
	    layer.msg(elem.text());
	  });
	});
</script>
<script src="js/plugins/layer/layim/layim.js"></script>
</body>

</html>
