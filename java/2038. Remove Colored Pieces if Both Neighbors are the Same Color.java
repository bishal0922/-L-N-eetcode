class Solution {
    public boolean winnerOfGame(String colors) {
        //different approach than taking turns, its about how many steps they can take
        
        //steps by alice and bob
        int alice = 0;
        int bob = 0;
        
        //iterating through the string looking for triplets of 'AAA' or 'BBB'
        for (int i = 1; i < colors.length() - 1; i++){
            if (colors.charAt(i-1)=='A'&&colors.charAt(i)=='A'&&colors.charAt(i+1)=='A'){
                //if 'AAA' found in the string
                alice++;
            } else if (colors.charAt(i-1)=='B'&&colors.charAt(i)=='B'&&colors.charAt(i+1)=='B'){
                //if 'BBB' found in the string
                bob++;
            }
        }
        
        //whoever has the most turns will eventually win
        return alice>bob;
    }
}
