func uniqueMorseRepresentations(words []string) int {
    morse:=[]string{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
    count:=make(map[string]bool)
    for _, word:=range words {
        ans:=""
        for _, w:=range word {
            ans+=morse[w-'a']
        }
        count[ans]=true
    }
    return len(count)
}