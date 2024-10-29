const http = require('http');
const myModule = require('./node5.js');
const PORT = 4607;
const server = http.createServer((request, response) => {

    var x = 4;
    var y = 8;
    // var z = myModule.sum(x, y);
    response.writeHead(200, { 'Content-Type': 'text/html' });
    response.write(`sum of ${x} and ${y} is ${myModule.sum(x, y)} <br>`);
    response.write(`sub of ${x} and ${y} is ${myModule.sub(x, y)} <br>`);
    response.write(`mul of ${x} and ${y} is ${myModule.mul(x, y)} <br>`);
    response.write(`div of ${x} and ${y} is ${myModule.div(x, y)} <br>`);
    response.end();//this function will terminate the processing of server
});
server.listen(PORT, () => {
    console.log(`SERVER IS LISTENING ON ${PORT}`);
});
