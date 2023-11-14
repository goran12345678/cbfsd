//Node.js 
// NPM Node Pacakge Manager. Loads libraries that support Node.js
// TypeScript, Npm can install the TS libraries need for ts files
// Form of JavaScript called TypeScript that is compile into native JavaScript

//let sum:number = 0
//sum = 5
let fname:string = "Tom"
fname = "Mike"
let checked:boolean = true
checked = false
checked = true
let msg:any = "hello all"
msg = 8
msg = true
console.log(msg)

/* Function declaration */
/* function sum(a:number, b:number){
   let ttl = a + b
    console.log("total :", ttl)
}
sum(8,8) */

/* Function Expression */
let s = function(a:number, b:number){
    let ttl = a + b
    console.log("total :", ttl)
}
//s(5,8)

/* Arrow Functiion */
let s2 = (a:number, b:number) => { 
    let ttl = a + b
    console.log("total :", ttl)
}
s2(5,8)

function sum2(a:number, b:number):number {
    let ttl = a + b
    return ttl
}
let s3 = sum2(5,8)
let ttl = s3 / 4
console.log("return is ", ttl)





