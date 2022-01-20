let  file=require('fs');

file.readFile('users.json',(err,data)=>{
   if(err){
       console.log('Error while Reading');
   }else{

    let result=JSON.parse(data);
    for (var i=0; i<result.length; i++)
       console.log("name:  "+result[i].name  +"  age: "+result[i].age);
   }
})