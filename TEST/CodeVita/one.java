class Solution {
    //TC = O(N^2 + M) || SC = O(N)
    //N is length of words array
    //M is sum of length of all words in the array
    public int maxProduct(String[] words) {
        //Can we represent a word in 26 bits? Yes but how?
        //Just set those bits in 26 bits where the letter is present in 
        //the word
        int n = words.length;
        //Create an array of given words array length
        //To store the bitmask for each word
        int[] mask = new int[n];
        //How to create the mask?
        //If we use left shift with char value and take bitwise
        //OR with that respective mask it will set bit at that particular
        //characters location
        
        //TC of creating mask will be O(M)
        //M is total length of all words in the array
        for(int i = 0; i < n; i++){
            for(char c : words[i].toCharArray()){
                mask[i] = mask[i] | (1 << (c - 'a'));
            }
        }
        
        int largest = 0;
        //Traverse through all possible pairs of words
        //TC = O(N^2)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Check if bitwise AND of two masks is coming to be zero then 
                //It means they both dont have any character same in them
                //So update the answer in this case else keep going
                if((mask[i] & mask[j]) == 0)
                    largest = Math.max(largest, words[i].length()*words[j].length());
            }
        }
        return largest;
    }
}