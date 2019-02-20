//Written by Myungsik Kim
int adjacentElementsProduct(int[] inputArray) {

    
    int compare = -1000;
    int result = -1000;
    
    for(int i=0; i<inputArray.length-1; i++){
        
        result = inputArray[i] * inputArray[i+1];

        if(compare < result){
            compare = result;
        }
    }
    return compare;   
}
