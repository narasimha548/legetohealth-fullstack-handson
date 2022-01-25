console.log("This index.js is entry point!!");
console.log("change the file name in package.json");
console.log("Nodemon insatlled and included in  package.json");
const cors = require('cors');
const corsOptions ={
    origin:'http://localhost:3000', 
    credentials:true,            //access-control-allow-credentials:true
    optionSuccessStatus:200
}
app.use(cors(corsOptions));