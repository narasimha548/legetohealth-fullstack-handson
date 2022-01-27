let http=require('http');

let port=9091;

 let Server=http.createServer((request,response)=>{
    
    response.writeHead(200,{'content-type':'text/html'});
    response.write('<h2> welcome http module </h2>');
    response.end();
 });

 Server.listen(port,()=>{console.log(`port ${port}`)});