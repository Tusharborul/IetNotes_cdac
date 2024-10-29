const fs = require('fs');
fs.unlink('demo.txt', (error) => {
    if (error)
        console.log(error);
    else
        console.log("file deleted");
});