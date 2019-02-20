//Written by Myungsik Kim
int makeArrayConsecutive2(int[] statues) {
    
    int missing = 0;
    
    Arrays.sort(statues);
        
    for(int i = 0; i < statues.length - 1; i++){
        missing += statues[i+1] - statues[i] - 1;
    }
    
    return missing;
    
}
