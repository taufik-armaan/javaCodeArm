package interviewQues;


class ReverseEachWordOfString {
	
    public static void main(String[] args) {
        
        String str = "I Like Java"; // Java Like I
        
        String [] words = str.split("\\s");
        
        String revWords= " ";
        for(String w: words){
            
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revWords = revWords+sb.toString();
            
        }
            
            System.out.println("The reverse words: "+" "+revWords);
        }
        

}