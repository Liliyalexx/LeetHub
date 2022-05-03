// class Solution {
//     public String[] reorderLogFiles(String[] logs) {
//         if(logs.length == 0) return logs;
//         List<String> letterLogs = new ArrayList<>(), digitLogs = new ArrayList<>();
//         separateLettersDigits(logs, letterLogs, digitLogs);
//         sortLetterLogs(letterLogs);
//         return generateOutput(letterLogs, digitLogs);  
//     }
    
//     void separateLettersDigits(
//         String[] input, 
//         List<String> letterLogs, 
//         List<String> digitLogs
//     ) { 
//         for(String log : input) {
//             if(Character.isDigit(log.charAt(log.length()-1))){
//                 digitLogs.add(log);
//             } else {
//                 letterLogs.add(log);
//             }
//         }
//     }
    
//     void sortLetterLogs(
//         List<String> letterLogs
//     ) {
//         Collections.sort(letterLogs, new Comparator<String>() {
//             public int compare(String o1, String o2) {
// 			    String s1 = o1.substring(o1.indexOf(" ") + 1);
// 			    String s2 = o2.substring(o2.indexOf(" ") + 1);
                
//                 return s1.equals(s2) ? o1.compareTo(o2) : s1.compareTo(s2);
//             }
//         });
//     }
    
//     String[] generateOutput(
//         List<String> letterLogs, 
//         List<String> digitLogs
//     ) {
//         String[] output = new String[letterLogs.size() + digitLogs.size()];
//         for(int i = 0; i < letterLogs.size(); i++) {
//             output[i] = letterLogs.get(i);
//         }
//         for(int i = letterLogs.size(); i < output.length; i++) {
//             output[i] = digitLogs.get(i-letterLogs.size());
//         }
//         return output;  
//     }
// }


// Updating this with non-bs variable names because once you get hired you will absolutely hate people who use cryptic names.

// my solution takes advantage of what we're guaranteed in the problem:

// guaranteed to have a word following an identifier (allows me to use indexOf ' ' freely).
// letter logs need to be ordered lexicographically, so we can use built in compare function when we know we have two.
// number logs need to be sorted naturally, so we just say they're all "equal" to eachother and trust java's built in sort feature to be stable.
// number logs need to be after letter logs, so once we find out they're different, we return one of the other and short-circuit.


class Solution {

public String[] reorderLogFiles(String[] logs) {
        
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1SpaceIndex = s1.indexOf(' ');
                int s2SpaceIndex = s2.indexOf(' ');
                char s1FirstCharacter = s1.charAt(s1SpaceIndex+1);
                char s2FirstCharacter = s2.charAt(s2SpaceIndex+1);
                
                if (s1FirstCharacter <= '9') {
                    if (s2FirstCharacter <= '9') return 0;
                    else return 1;
                }
                if (s2FirstCharacter <= '9') return -1;
                
                int preCompute = s1.substring(s1SpaceIndex+1).compareTo(s2.substring(s2SpaceIndex+1));
                if (preCompute == 0) return s1.substring(0,s1SpaceIndex).compareTo(s2.substring(0,s2SpaceIndex));
                return preCompute;
            }
        };
        
        Arrays.sort(logs, myComp);
        return logs;
    }
}