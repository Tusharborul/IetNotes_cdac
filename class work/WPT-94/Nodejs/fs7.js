const fs = require('fs');
fs.rename('data.txt', 'demo1.txt ', (error) => {
    if (error)
        console.log(error);
    else
        console.log(" file rename");
});