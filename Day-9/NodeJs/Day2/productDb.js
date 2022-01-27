let app=require('express')();
let mongoClient=require('mongodb').MongoClient;

let dbUrl="mongodb://localhost:27017";
let port=9090;

app.listen(port,()=>console.log(`Server started with port no: ${port}`));

app.get('/product', (request, response) => {
    mongoClient.connect(dbUrl, {useNewUrlParser : true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("product").find();
            let arrayOfRecords = [];
            let x = 0;
            doc.forEach((record) => {
                arrayOfRecords.push(record);
                x++;
            }, () => {
                if(x == 0) {
                    response.json({error: "No records found!"})
                } else {
                    response.json(arrayOfRecords);
                }
                client.close();
            });
        } // end of if
    }); // end of connect()
});


app.get('/product/:id',(request,response)=>{
    console.log('id is --->'+request.params.id);
    let id=parseInt(request.params.id);

    mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{

        if(!err){
            let myDb=client.db('mydb');
            let doc=myDb.collection('product').find({_id:id});

            let x=0;

            doc.forEach((record)=>{
                x++;
                response.json(record);

            },()=>{

                if(x==0){
                    response.json({err:`sorry id not found ${id}`});
                }
                client.close();
            });

        }
    });

});


app.post('/product',(request,response)=>{
    let user = request.body;
    let id = parseInt(user._id);
    console.log(id);
    mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{
        if(err) throw err;
        {
            var data= {_id:id,name:user.name,salary:user.salary};
            let myDB = client.db('mydb');  
               myDB.collection("product").insertOne(data,(err,res)=>
               {
                   if(err) throw err ; 
                response.send(`1 Document Stored Successfully !!! ${JSON.stringify(data)}`);
                client.close();
               });
        }
    });
});
app.put('/product/:_id/:name/:salary',(request,response)=>{
let id = parseInt(request.params._id);
console.log(id);
let name = request.params.name;
let salary = parseInt(request.params.salary);
MongoClient.connect(dbURL,{useNewUrlParser:true},(err,client)=>{
    if(err) throw err;
        let myDB = client.db('mydb');
        var findwith = {_id:id};
        var setData = {$set:{name:name,salary:salary}};
         myDB.collection("product").updateOne(findwith,setData,(err,res)=>{
            if(err) throw err;
            response.send(` document(s) Updated`);
            client.close();
         });
    });
});
app.delete('/product/:_id',(request,response)=>{
let id = parseInt(request.params._id);
console.log(id);
mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{
    if(err) throw err;
        let myDB = client.db('mydb');
        var myquery = {_id:id};
            let delete_data = myDB.collection("product").deleteOne(myquery,(err,res)=>{
                if(err)throw err;
                response.send(`document deleted!!`);
                client.close();
            }); 
});
});