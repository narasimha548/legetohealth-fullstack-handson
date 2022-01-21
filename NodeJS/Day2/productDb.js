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