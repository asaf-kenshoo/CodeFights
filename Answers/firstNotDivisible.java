int firstNotDivisible(int[] divisors, int start) {
    int l = divisors.length;
    boolean b = true;
    while(b){
        for(int i=0; i<l; i++){
            if(start%divisors[i] != 0){
                b= false;
                break;
            }
            else{
                start++;
            }
        }
    }
    return start;
}
