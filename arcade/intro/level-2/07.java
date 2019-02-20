//Written by Myungsik Kim
boolean almostIncreasingSequence(int[] sequence) {
    
    int[] result = new int[sequence.length];
    
    for(int i=0; i<sequence.length-1; i++){  
        
        if(sequence[i] < sequence[i+1]){
            continue;
        }else if(sequence[i] >= sequence[i+1]){   
            for(int j=i; j<sequence.length-2; j++){ 
                System.out.println(i);                
                if((i==0) && (sequence[j+1] < sequence[j+2])){
                    continue;
                }else if( sequence[j+1] >= sequence[j+2]){
                    return false;    
                }else if((i!=0) && 
                         (sequence[i-1] < sequence[j+1]) && 
                         (sequence[j+1] < sequence[j+2])){
                    continue;
                }else if((i!=sequence.length) && 
                         (sequence[i] > sequence[i+1]) && 
                         (sequence[i] < sequence[i+2])){
                    continue;
                }else return false;
            }
            return true;
        }
    }   
    return true;
}
