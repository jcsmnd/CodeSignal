//Written by Myungsik Kim
String[] allLongestStrings(String[] inputArray) {
    
    int length = inputArray.length;
    
    String[] tempArray = new String[length];
    int count = 0;
    int max = inputArray[0].length();
    
    for(int i=0; i<length-1; i++){
        if(max < inputArray[i+1].length()){
            max = inputArray[i+1].length();
        }
    }
     
    for(int i=0; i<length; i++){
        if(max == inputArray[i].length()){
            tempArray[i] = inputArray[i];
        }
    }
    
    
    for (int i=0; i<tempArray.length; i++){
        if (tempArray[i] != null){
            count++;
        }
    }
    
    String[] outputArray = new String[count];
    
    for (int i=0, j=0; i<tempArray.length; i++){
        if (tempArray[i] != null ){
            outputArray[j++] = tempArray[i];
        }
    }
    
    return outputArray;
}
