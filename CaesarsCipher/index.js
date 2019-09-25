function rot13(str) { 
  
    let alphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O","P",
    "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", ".", "?", " "]

    let arrayOfValues = str.split("")
    
    let decodedValuesIndex = []

    let decodedStringArray = [] 

    for (var i = 0; i < arrayOfValues.length; i++){

        let indexOfValue = alphabet.indexOf(arrayOfValues[i])

        if (indexOfValue >= 26){

            decodedValuesIndex.push(arrayOfValues[i]);

        } else if (indexOfValue >= 13){

            let minusThirteenFromIndexValue = indexOfValue - 13;
            decodedValuesIndex.push(minusThirteenFromIndexValue);

        } else {

            let addThirteenToIndexValue = indexOfValue + 13;
            decodedValuesIndex.push(addThirteenToIndexValue);

        }
    }

    console.log(decodedValuesIndex);

    for (var i = 0; i < decodedValuesIndex.length; i++){

        if (decodedValuesIndex[i] == "!" || decodedValuesIndex[i] == "?" ||
        decodedValuesIndex[i] == "." || decodedValuesIndex[i] === " "){

            decodedStringArray.push(decodedValuesIndex[i])

        } else {

            decodedStringArray.push(alphabet[decodedValuesIndex[i]])
        }
    }

    let decodedWord = decodedStringArray.join("")
    console.log(decodedWord)

    return decodedWord;
  }
  
  // Change the inputs below to test
  rot13("LBH QVQ VG");