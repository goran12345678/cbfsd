function clientFormSubmit(e) {
    let form = document.forms[0]
    let fname = form["fname"].value
    let lname = form["lname"].value
    let email = form["email"].value
    console.log("fname :", fname)
    console.log("lname: ", lname)
    console.log("email: ", email)

    if (fname == "")
        alert('enter first name')
    else if (lname == "")
        alert('enter last name')
    else if (email == "")
        alert('enter email')

    alert("pause")
}
function scheculeSubmissionSubmit() {
    let arr = ["item 1","item 2","item 3"] //zero basea array
    //arr[0]
    let form = document.forms[0]
    let client_id = form["client_id"].value
    let agenda = form["agenda"].value
    let place = form["place"].value
    let date = form["date"].value
    let time = form["time"].value

    if (client_id == "")
        alert("enter client id")
    else if (date == "")
        alert("enter a date")
    else if (date != "") {
        let current = Date.now()
        if (date < current)
            alert("pick a date in the future")
    }
    else if (time == "")
        alert("enter a time")


    alert("pause")
<<<<<<< HEAD
}
=======
}
>>>>>>> 21b83a80fa99ee3628edc519e6beba82ff925509
