public class WordProcessor {

    //instance fields
    String input;

    //constructor method
    public WordProcessor(String userInput){
        input = userInput;
    }

    //positivize method
    public String positivize(){

        String[] inputArray = input.split(" ");

        //check if input array is more than one word
        if (inputArray.length == 1){
            return "Input must be more than one word";
        }

        String outputString;

        //hold first word in temp variable
        String temp = inputArray[0];
        //copy second word in first word's place
        inputArray[0] = inputArray[1];
        //insert first word in seconds word's place from temp variable
        inputArray[1] = temp;

        //capitalize new first word, make second word lower case
        outputString = inputArray[0].substring(0,1).toUpperCase() + inputArray[0].substring(1).toLowerCase();
        outputString += " " + inputArray[1].toLowerCase();

        //loop that converts array to String
        for (int i = 2; i < inputArray.length; i++){
            outputString += " " + inputArray [i];
        }

        //replace '?' with '!'
        outputString = outputString.replace('?', '!');

        return outputString;

        
    }
}
