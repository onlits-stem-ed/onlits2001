class Employee {
    // constructor() {
    //     this.eid = 0;
    //     this.name = null;
    // }

    constructor(id, nm) {
        this.eid = id;
        this.name = nm;
    }

    display() {
        document.writeln("eid: " + this.eid);
        document.writeln("name: " + this.name);
        console.log("eid: " + this.eid);
        console.log("name: " + this.name);
    }
}

e = new Employee(1,"Mrityunjay Kumar");
//e.display();

var c = {
    cid:"1",
    name:"Mritunjay Kumar",
    contact:"7894569856",
    display = function () {
        console.log(c.name)
    }
};
var c = {cid:"1", name:"Mritunjay Kumar", contact:"7894569856"};

document.writeln(c.name);
c.display();


