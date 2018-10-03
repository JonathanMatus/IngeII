/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function test() {
    var bcrypt = dcodeIO.bcrypt;
    var pass = "CIEMHCAVI2018";
    var sha512pass = sha512(pass);
    console.log(sha512pass);
    if("7be6c43cc95d65b388332655226fb48cf13b5cdbf4c3a6b58b44748e788c9f648c5c5c329625b4fc31f7cac0a663902bcbbda3e90cd3c57987a7382a716313bf" == sha512pass)
          console.log(true);
    bcrypt.genSalt(10, function (err, salt) {
        bcrypt.hash(sha512pass, salt, function (err, hash) {
           
        });

    });
}
;