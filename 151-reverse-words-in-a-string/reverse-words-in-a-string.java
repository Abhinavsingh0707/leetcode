class Solution {
    public String reverseWords(String s) {
        // split the string to a string array
        String [] words = s.split(" +");

        // reverse the array
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i >= 0 ; i--){
            //store the reverse array into a stringbuilder

            sb.append(words[i]);
            sb.append(" ");
        }
        // since we want to return string not in an array so we need to convert this stringbuilder to string

        return sb.toString().trim();
    }
}