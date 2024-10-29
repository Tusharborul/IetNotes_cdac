const fs = require('fs');
fs.appendFile('myfile.txt', 'node js file append demo', (error) => { //if success it will execute successfull otherwise error msg will be display. override the original content.
    if (error)
        console.log(error);
    else
        console.log("data saved into file");
});
