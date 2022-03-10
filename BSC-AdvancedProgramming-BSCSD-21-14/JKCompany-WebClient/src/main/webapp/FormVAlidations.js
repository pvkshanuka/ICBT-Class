/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*admin login validation*/

function adminValidation(){
    var user = document.forms['adminLogin']['username'];         //gettimg data from gthe form
	var pass = document.forms['adminLogin']['password'];
	
	if (user.value == "") {
        text="*Username Field should be Filled"
      //  alert(text);
      document.getElementById("Username").style.display = "flex"; //login display
      
        document.getElementById('Username').innerHTML=text;
        
	          //empty fields
		return false;

    }
    else if(pass.value==""){
        document.getElementById("Username").style.display = "none"; 
        text="*Password field Should be fillied"
        document.getElementById("Password").style.display = "flex"; //login display
        document.getElementById('Password').innerHTML=text;

        return false;
    }

}
