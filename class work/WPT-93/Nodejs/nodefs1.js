const fs = require('fs');
fs.writeFile('myfile.txt', 'Tushar is now switching his job.:(', (error) => {
    if (error) {
        console.log(error);
    } else {
        console.log("Data sAVED into the file..");
    }
});