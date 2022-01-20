let fs=require('fs');
let app=require('express')();
let port=9090;

//include body-parser to read the data coming from request body
let parser=require('body-parser');

app.use([parser.text(),parser.json()]);

app.get('/employee/:id',(request,response)=>{
   console.log("Get method ::: "+request.params.id);
   let resResult={name:'alex',age:'30',salary:'20512'};
   response.send(resResult);
});


app.post('/employee',(request,response)=>{
  
    let result=request.body;
   // let jsonObj=JSON.parse(result);
    
    for(var i=0;i<result.length;i++){
        console.log("name:  "+result[i].name + "  age :"+result[i].age +"  sal :"+result[i].salary);
    }
     
   
    response.send(result);
 });

 app.put('/employee/:id',(request,response)=>{
    console.log("PUT method ::: "+request.params.id);
    let emp={id:request.params.id,name:"test put method"}
    response.send(emp);
 })


app.delete('/employee/:name',(request,response)=>{
     fs.readFile('Users.json' ,function(err,data){
       if(err){
        console.log('Error while reading data');
       }
       
         let result=JSON.parse(data);
         for(var i=0;i<result.length;i++){
            console.log( "id : "+result[i].id +"    name:  "+result[i].name + "  age :"+result[i].age +"  sal :"+result[i].sal);
        }
         

     });
     response.send("Delete method");
});

 app.listen(port,()=>{console.log(`server started at port ${port}`)});
 
 