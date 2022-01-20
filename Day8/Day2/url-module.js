let http=require('http');

let url=require('url');
let port=9090;
let Server=http.createServer((request,response)=>{


    if(request.url!='/favicon.ico'){
     let urlObj=url.parse(request.url,true);
     console.log('username :: '+urlObj.query.username +"  age:: "+urlObj.query.age);
    // console.log('host: '+urlObj.hostname);
     response.writeHead(200,{'content-type':'text/html'});
    response.write('<h2> welcome to URL module </h2>');
  response.end();
   }
});

Server.listen(port,()=>{console.log(`server started at port ${port}`)});