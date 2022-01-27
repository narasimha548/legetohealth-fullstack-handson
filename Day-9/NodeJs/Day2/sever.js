
let app = require('express')();
let http = require('http').Server(app)
let io = require("socket.io")(http)


app.get('/', (request, response) => {
    response.sendFile(__dirname+"/client.html");
})
http.listen(9090, () => console.log('server running in 9090'));


io.on('connection', (socket) => {
    console.log('client is connected to the server: '+socket.connected);
    //socket wants to send data to client
    socket.on("clientMessage", (msg) => {
        socket.emit("messageKey", ' messages: '+msg);
    });
});
