let app=require('express')();
let mysql=require('mysql');
let bodyParser = require('body-parser');
let cors = require('cors');
app.use(cors({origin : '*'}));

let port=9090;

app.use([bodyParser.text(), bodyParser.json()]);
app.listen(port,()=>console.log(`Server started with port no: ${port}`));


let con=mysql.createConnection({
    host:'localhost',
    user: "root",
    password: "root",
    database:"legato_exp"
});


//Insert the Data into mysal DB
app.post('/save',(request,response)=>{

    con.connect(function(err){
        if(err){
            console.log('Data base not connected');
        }else{
           
            //console.log(request.body);
            let result=request.body;
            let id=result.id;
            let name=result.name;
            let salary=result.salary;

            var sqlQueryForInsert="INSERT INTO employee (name, salary) VALUES ('"+name+"', '"+salary+"')";
            
            con.query(sqlQueryForInsert,function(err,data){
                if(err){
                    response.json(err);
                }else{
                    con.commit();
                   // response.setHeader("Access-Control-Allow-Origin", "*")
                    response.json({data:`1 record inserted`});
                    //con.console();
                }
            }); 
           }
        });
});


//Get all employess
app.get('/employees',(request,response)=>{

    con.connect(function(err){
        if(err){
            console.log('Data base not connected');
        }else{
            var queryForFindAll='select * from employee';
             con.query(queryForFindAll,(err,rows)=>{
               if(!err)
                response.json(rows);
             });
        }
    })
});



//Get Employee based on Id
app.get('/employee/:id',(request,response)=>{

    con.connect(function(err){
        if(err){
            console.log('Data base not connected');
        }else{
            var querForGetEmpById='select * from employee where id=?';
            console.log('id '+request.params.id);
             con.query(querForGetEmpById,[request.params.id],(err,rows)=>{
               if(!err)
                response.json(rows);
             });
        }
    })
});

//Delete employee based on Id
app.delete('/employee/:id',(request,response)=>{

    con.connect(function(err){
        if(err){
            console.log('Data base not connected');
        }else{
            var deleteEmpById='delete from employee where id=?';
            console.log('id '+request.params.id);
             con.query(deleteEmpById,[request.params.id],(err,rows)=>{
               if(!err)
                response.json('Deleted sucessfully');
             });
        }
    })
});

//Update Employee based on Id
app.put('/employee/:id/:name/:salary',(request,response)=>{

    con.connect(function(err){
        if(err){
            console.log('Data base not connected');
        }else{
            var updateEmpById='update employee set name=?,salary=? where id=?';
            console.log('id '+request.params.id);
             con.query(updateEmpById,
             [request.params.name,request.params.salary,request.params.id],(err,rows)=>{
               if(!err)
               
                response.json(rows);
             });
        }
    })
});

