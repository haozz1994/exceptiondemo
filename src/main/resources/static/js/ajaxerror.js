$.ajax({
    url:"/err/getAjaxerror",
    type:"POST",
    async:false,
    success:function(data){
        debugger;
        if(data.code == "200"){
            alert("success!");
        }else {
            alert("发生异常： "+ data.message);
        }
    },
    error:function(){
        debugger;
        alert("error");
    }
})