h1 = document.getElementById("h1");

b1 = document.getElementById("b1");
b1.onclick = function () {
    h1.innerHTML = "This heading was changed using javascript";
}
b2 = document.getElementById("b2");
b2.onclick = function () {
    h1.innerHTML = "This is a heading";
}

t1 = document.getElementById("t1");
b3 = document.getElementById("b3");
b3.onclick = function () {
    t1.value = "Textbox content has changed!";
}
//--------------------
h1.style.color = "red";
t1.style.padding = "10px";
t1.style.borderRadius = "20px";

let show_age = document.getElementById('show_age');

show_age.onclick = function () {
    let dob = document.getElementById("dob").value;
    console.log("dob=" + dob);
    dob = new Date(dob);
    let curd = new Date();
    console.log("curd=" + curd);
    let age = curd.getFullYear() - dob.getFullYear();
    document.getElementById("age").value = age + ' years';
    if (age < 1) {
        age = curd.getMonth() - dob.getMonth();
        document.getElementById("age").value = age + ' months';
        console.log(age + ' months');
        window.alert(age);
    }
}