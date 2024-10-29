const fs = require('fs');
fs.writeFile('demo.txt', 'node js file ', (error) => {
    if (error)
        console.log(error);
    else
        console.log("data saved into file");
});