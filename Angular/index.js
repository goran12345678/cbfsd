//Node.js 
// NPM Node Pacakge Manager. Loads libraries that support Node.js
// TypeScript, Npm can install the TS libraries need for ts files
// Form of JavaScript called TypeScript that is compile into native JavaScript
//let sum:number = 0
//sum = 5
var fname = "Tom";
fname = "Mike";
var checked = true;
checked = false;
checked = true;
var msg = "hello all";
msg = 8;
msg = true;
console.log(msg);
/* Function declaration */
/* function sum(a:number, b:number){
   let ttl = a + b
    console.log("total :", ttl)
}
sum(8,8) */
/* Function Expression */
var s = function (a, b) {
    var ttl = a + b;
    console.log("total :", ttl);
};
//s(5,8)
/* Arrow Functiion */
var s2 = function (a, b) {
    var ttl = a + b;
    console.log("total :", ttl);
};
s2(5, 8);
function sum2(a, b) {
    var ttl = a + b;
    return ttl;
}
var s3 = sum2(5, 8);
var ttl = s3 / 4;
console.log("return is ", ttl);
