//Written by Myungsik Kim
int centuryFromYear(int year) {
    
    int answer = 0;
    
    if(year%100 == 0){
    answer = (year / 100);
    }else{
     answer = (year / 100)+1;   
    }
    
    return answer;
    
}
