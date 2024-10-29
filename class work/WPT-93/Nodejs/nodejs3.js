console.log("write operation started");
const fs = require('fs');
fs.appendFile('myfile.txt', 'new data', (error) => { //if success it will execute successfull otherwise error msg will be display. override the original content.
    if (error)
        console.log(error);
    else
        console.log("data saved into file");
});
console.log("append operation ended");