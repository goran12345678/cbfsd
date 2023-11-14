       /*         function sum(){
                    let a = 5
                    let b = 8
                    console.log("sum output", a + b)
                }
                sum() */
        /*         function sum(a, b){
                    let total = a + b
                    console.log("sum total", total)
                }
                sum(5, 8) */
        
        /*         function sum(a,b){
                    let total = a + b
                    return total
                }
                console.log(sum(5,8))
                let sum_var = sum(5,8)
                console.log("new sum", sum_var) */
        
/*                 function sum(a, b){
                    this.var1 = a //in the scope of the object
                    this.var2 = b
                    return this.var1 + this.var2
                }
                console.log(sum(5,8))
         */
/*                 function emialVerification(email){
                    let i = email.indexOf("@")
                    if(i > -1)
                    return true
                    else 
                    return false
                }
                console.log("email verified",
                 emialVerification("goran.gmail.com")) */
       
/*     function changeColor(){
        document.getElementById("submit").style.color = "red"
    } */
/*     function changeColor(color){
        document.getElementById("submit").style.color = color
    } */
/*     function sendMessage(msg){
        document.getElementById("message").innerHTML = "<b><u>New message</u>:</b> " + msg
    } */
/*     function sendMessage(n, callback){
        document.getElementById("message").innerHTML = callback(n)
    }
    function greeting(name){
         return "Hi my name is " + name
    } */
    function sum(a, b){
        let ttl
        try{
           ttl = a / b
           //throw new Error('Parameter is not a number!')
        }catch(e){
            console.log("there was an issue: ", e)
        }
        console.log("sum is", a + b)
    }