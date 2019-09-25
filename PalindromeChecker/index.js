function palindrome(str) {

    var lstr = str.toLowerCase(str);
    var filteredStr = lstr.replace(/\W|\*|\_|/gi, "");
    var reversedStr = filteredStr.split("").reverse().join("");

    if (reversedStr === filteredStr){
        return true;
    } else return false;
  }
  
  
  
 console.log( palindrome("E-_#y*e"));