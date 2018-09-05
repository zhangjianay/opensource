<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>主页</title>
    <link rel="shortcut icon" href="favicon.ico"> 
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
        	 <div class="col-sm-3">
                <div class="widget style1 navy-bg">
                    <div class="row">
                        <div class="col-xs-4">
                            <i class="fa fa-user fa-3x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> 欢迎你： </span>
                            <h2 class="font-bold">${userName!""}</h2>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-3">
                <div class="widget style1">
                    <div class="row">
                        <div class="col-xs-4 text-center">
                            <i class="fa fa-trophy fa-5x"></i>
                        </div>
                        <div class="col-xs-8 text-right">
                            <span> 我的积分 </span>
                            <h2 class="font-bold" id="score">${value!""}</h2>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-3">
                <button class="btn btn-outline btn-primary dim" onclick="sign()" type="button">签到
                </button>
            </div>
        </div>
</body>
<script src="js/jquery.min.js"></script>
<script>
function sign(){
	$.ajax({
            url:"/sign",
            type:"post",
            success:function(data){
            console.log(111);
            	$("#score").html(data);
            },
            error:function(e){
                alert("系统异常！");
            }
        });  
}
</script>
</html>
