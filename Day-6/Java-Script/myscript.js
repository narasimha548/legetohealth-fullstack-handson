function validateForm(){
   // alert("Hello");
    var form=document.simpleForm;
     var u=form.uname;
     var p=form.pwd;

     if(u.value.length<1){
         alert("username can't be empty");
         return false;
     }

     if(p.value.length <1){
         alert("password can't be empty");
         return false;
     }
}