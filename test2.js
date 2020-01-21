// const myPromise = new Promise((resolve, reject) => {
//     if (Math.random() * 100 <= 90) {
//         resolve('Hello, Promises!');
//     }
//     reject(new Error('In 10% of the cases, I fail Miserably.'));
// });
// const onResolved=(resolvedValue)=>console.log(resolvedValue);
// const onRejected=(error)=>console.log(error);

// myPromise.then(onResolved,onRejected);


// promise=new Promise(function(resolve,reject){
//     setTimeout(resolve,5000);
// })
// promise.then(function(){
//     console.log('This is done');
// })

// var asynchronousFunction=function(){
//     return new Promise(function(resolve,reject){
//         console.log('Keep every promise you make and only make promise you can kep');
//         setTimeout(resolve,5000)
//     })
// }
// asynchronousFunction()
//     .then(asynchronousFunction)
//     .then(asynchronousFunction)

var fs = require('fs');
let sampletext = "This is the sample text that will go in the file.";
new Promise((resolve, reject) => {
    fs.mkdir('hello', function (err) {
        if (err) {
            console.error("Error in creating directory!");
        } else {
            console.log('The Directory Hello is created!!');
        }
    })
 resolve();
})
    .then(() => {
        fs.writeFile('.//hello//write.txt', sampletext, function (err) {
            if (err) {
                console.error("Error in writing the file!");
            } else {
                console.log('The data is written in the file!');
            }
        })
    })
    .catch(() => {
        console.log('The Data is Not Written');
    })
    .then(() => {
        fs.readFile('.//hello//write.txt', 'utf8', function (err, data) {
            if (err) {
                console.log("Error in reading file!");
            } else {
                console.log(data);
                fs.unlink('.//hello//write.txt', function (err) {
                    if (err) {
                        console.error("Error deleting file!");
                    }
                    else {
                        fs.rmdir('hello', function () { });
                        console.log('The Directory is deleted Successfully');
                    }
                });
            }
        })
    })