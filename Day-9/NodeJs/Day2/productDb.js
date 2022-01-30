let app=require('express')();
let mongoClient=require('mongodb').MongoClient;
let cors=require('cors');

let bodyParser = require('body-parser');
let dbUrl="mongodb://localhost:27017";
let port=9090;

app.listen(port,()=>console.log(`Server started with port no: ${port}`));
app.use([bodyParser.text(), bodyParser.json()]);
app.use(cors({origin : '*'}));

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
                    response.status(404).json({err:`Sorry Product not found with the id : ${id}`});
                }
                client.close();
            });

        }
    });

});


app.post('/product',(request,response)=>{
    
    mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{
        if(err) throw err;
        {
    let user = request.body;
    let id = parseInt(user.id);
    console.log( "request data ===> "+user);
            var data= {_id:id,name:user.name,price:user.price};
            let myDB = client.db('mydb');  
               myDB.collection("product").insertOne(data,(err,res)=>
               {
                   if(err){
                     response.send({ err : ' Unable to Store Product ,Please try after some time'});
                   }  else{
                    response.send({res : ' Product Saved successfully '});
                   }
               
                client.close();
               });
        }
    });
});

app.put('/product/:_id/:name/:price',(request,response)=>{
let id = parseInt(request.params._id);
console.log(id);
let name = request.params.name;
let price = parseInt(request.params.price);
mongoClient.connect(dbUrl,{useNewUrlParser:true},(err,client)=>{
    if(err) throw err;
        let myDB = client.db('mydb');
        var findwith = {_id:id};
        var setData = {$set:{name:name,price:price}};
         myDB.collection("product").updateOne(findwith,setData,(err,res)=>{
            if(err){
                response.send({err : `Unable to Update the product , please try again !! `});
            }
            else{
            response.send({res : `Product Updated with the Id : ${id}` });
        }
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
                if(err){
                    response.send({err : 'Unable to delete the product, please try again !!'})
                }
                else{
                    response.send({res:'document deleted sucessfully'});
                }
               
                client.close();
            }); 
});
});