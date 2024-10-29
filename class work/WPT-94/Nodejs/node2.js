const http = require('http');
const PORT = 4500;
const server = http.createServer((request, response) => {

    var x = 40;
    var y = 8;
    response.writeHead(200, { 'Content-Type': 'text/html' });
    response.write(`sum of ${x} and ${y} is ${x + y} <br> `);
    response.write(`Sub of ${x} and ${y} is ${x - y} <br>`);
    response.write(`Mul of ${x} and ${y} is ${x * y} <br>`);
    response.write(`Div of ${x} and ${y} is ${x / y} <br>`);
    response.write(`Mod of ${x} and ${y} is ${x % y} <br>`);
    response.end();//this function will terminate the processing of server
});
server.listen(PORT, () => {
    console.log(`SERVER IS LISTENING ON ${PORT}`);
});
