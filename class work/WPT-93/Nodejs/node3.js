const http = require('http');
const server = http.createServer((request, response) => {

    response.write("hello world");
    response.end();//this function will terminate the processing of server
});
server.listen(4500);