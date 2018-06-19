/**
 * @author Tiago Rufino
 * Version 1.0
 */

/**
 * Define the open for the first page
 * @param load (result)
 */
function open(result){
	if (result==""){
		document.getElementById("status").className = "label label-success";
		$("#status").html("GOOD");
		$("#myImagem").attr("src", "../images/darklew.png");
	} else {
		document.getElementById("status").className = "label label-danger";
		$("#status").html("FAIL");
	}

}

/**
 * Get the cookie by the name. 
 * @param cname
 * @returns the select cookie or empty case doesn't find.
 */
function getCookie(cname) {
    var name = cname + "=";
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}