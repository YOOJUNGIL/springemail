function emailSend() {

    console.log("efefefefefefefefe");

    var formObj = {
        address : $('#address').val(),
        title : $('#title').val(),
        message : $('#message').val()
    };

    $.ajax({
        type : "post",
        url : "/email",
        contentType : "application/json; charset=UTF-8",
        data : JSON.stringify(formObj),
        //dataType:"json", //controller에서 json String형태 전송됨. json아니므로 생략필요
        beforeSend : function(){
            //로딩바start
            //$('.loader').show();
        },
        complete : function(){
            //로딩바end
            //setTimeout(function(){
            //    $('.loader').hide();
            //}, 1000);
        },
        success : function(data, textStatus, httpRequest){
            alert("발송되었습니다.");
        },
        error : function() {
            //에러내용표시
        }
    });
}

