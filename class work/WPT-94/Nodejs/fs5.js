const fs = require('fs');
fs.open('data.txt', 'w ', (error, file) => { //file-->newly creatd file
    if (error)
        console.log(error);
    else
        console.log(" file created");
    console.log(file);//3 file value will be a non negative integer.
    /* this integer is file descriptor and use to handle/access a file*/
});