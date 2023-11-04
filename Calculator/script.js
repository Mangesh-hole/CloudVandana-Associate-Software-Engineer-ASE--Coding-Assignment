function clearScreen() {
    document.getElementById("result").value = " ";
}

function display(value) {
    document.getElementById("result").value += value;
}
function calculate() {
    var m = document.getElementById("result").value;
    var n = eval(m);
    document.getElementById("result").value = n;
}