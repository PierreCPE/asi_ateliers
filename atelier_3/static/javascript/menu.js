// Vérifie si le cookie "myNumber" est initialisé à une valeur
function checkCookie() {
    var myNumber = getCookie("myNumber");
    if (myNumber !== "") {
        // L'utilisateur est connecté et le cookie "myNumber" est initialisé
        window.location.href = "menu.html";
    } else {
        // L'utilisateur n'est pas connecté ou le cookie "myNumber" n'est pas initialisé
        window.location.href = "login.html";
    }
}

// Fonction pour récupérer la valeur d'un cookie
function getCookie(name) {
    var nameEQ = name + "=";
    var cookies = document.cookie.split(';');
    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        while (cookie.charAt(0) === ' ') {
            cookie = cookie.substring(1, cookie.length);
        }
        if (cookie.indexOf(nameEQ) === 0) {
            return cookie.substring(nameEQ.length, cookie.length);
        }
    }
    return "";
}

// Appeler la fonction de vérification du cookie lorsque la page est chargée
window.onload = checkCookie;


document.getElementById('buyButton').onclick = function() { window.location.assign("http://localhost:80/cardBuy"); };
document.getElementById('sellButton').onclick = function() { window.location.assign("http://localhost:80/cardSell"); };
document.getElementById('playButton').onclick = function() { window.location.assign("http://localhost:80/menu"); };