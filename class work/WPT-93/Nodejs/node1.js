const http = require('http');
const PORT = 4100;
const server = http.createServer((request, response) => {

    response.write("hello world");
    response.end();//this function will terminate the processing of server
});
server.listen(PORT, () => {
    console.log('SERVER IS LISTENING ON ${PORT}');





});