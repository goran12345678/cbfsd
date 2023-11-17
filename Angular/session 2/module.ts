export class Client {
    first_name: string
    last_name: string
    email: string
    constructor(fname, lname, email) {
        this.first_name = fname
        this.last_name = lname
        this.email = email
    }
    getFullNName = function () { return this.first_name + " " + this.last_name }
<<<<<<< HEAD
}
=======
}
>>>>>>> 21b83a80fa99ee3628edc519e6beba82ff925509
