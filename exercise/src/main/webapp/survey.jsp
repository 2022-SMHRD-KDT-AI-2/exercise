<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>설문조사</title>
        <link rel="stylesheet" href="../css/설문조사.css">
        
    </head>
    <body>
        <!-- header -->
        <div id="header">
            <a><img src="../img/손글씨2.jpg" id="logo"></a>
        </div>


        <!-- wrapper -->
        <div id="wrapper">

            <!-- content-->
            <div id="content">

                <!-- height, weight-->
                <div>
                    <h3 class="request_title">
                        <label for="height">1.신체정보를 입력하세요.</label>
                    </h3>
                    <span class="box height_id">
                        <input type="text" id="height" class="int" maxlength="30" placeholder="키를 입력하세요">
                    </span>
                    <br>
                    <span class="box weight_id">
                        <input type="text" id="weight" class="int" maxlength="20" placeholder="몸무게를 입력하세요">
                    </span>
                </div>

                <!-- target_weight -->
                <div><br>
                    <h3 class="request_title"><label for="goal">2.원하는 몸무게를 입력하세요.</label></h3>
                    <span class="box int_traget">
                        <input type="text" id="target" class="int" maxlength="20">
                    </span>
                </div>

                <!-- athletic_part -->
                <div><br>
                    <h3 class="request_title"><label for="athletic_part">3.원하는 운동부위를 선택하세요.</label></h3><br>

                    <div id="athletic_wrap">
                        <div class="athletic_part">
                            <input id="shoulder" type="radio" name="shoulder">어깨 &nbsp;
                            <input id="arm" type="radio" name="arm">팔 &nbsp;
                            <input id="chest" type="radio" name="chest">가슴 &nbsp;
                            <input id="back" type="radio" name="back">등 &nbsp;
                            <input id="bae" type="radio" name="bae">복부<br> &nbsp;
                        </br>
                            <input id="core" type="radio" name="core">코어 &nbsp;
                            <input id="hip" type="radio" name="hip">엉덩이 &nbsp;
                            <input id="leg" type="radio" name="leg">다리 &nbsp;
                            <input id="body" type="radio" name="body">전신 &nbsp;
                        </div>
                    </div>
                </div><br>

                <!-- athletic_level-->
                <div>
                    <h3 class="request_title"><label for="athletic_level">4.본인의 신체레벨을 선택하세요 </label></h3><br>

                    <div id="level_wrap">
                        <div class="athletic_level">
                            <input id="sang" type="radio" name="snag">상 &nbsp;
                            <input id="jung" type="radio" name="jung">중 &nbsp;
                            <input id="ha" type="radio" name="ha">하 &nbsp;
                        </div>
                    </div>
                </div>

                 <!-- athletic_period-->
                 <div><br>
                    <h3 class="request_title"><label for="athletic_period">5.원하는 운동기간을 선택하세요.</label></h3><br>

                    <div id="period_wrap">
                        <div class="athletic_period">
                            <input id="one" type="radio" name="one">1주 &nbsp;
                            <input id="two" type="radio" name="two">2주 &nbsp;
                            <input id="three" type="radio" name="three">3주 &nbsp;
                            <input id="four" type="radio" name="four">4주 &nbsp;
                        </div>
                    </div>
                </div>

                 <!-- SUBMIT BTN-->
                 <div class="btn_area">
                    <button type="button" id="btnSubmit">
                        <span>제출하기</span>
                    </button>
                </div>

            </div> 
            <!-- content-->

        </div> 
        <!-- wrapper -->
    <script src="main.js"></script>
    </body>
</html>