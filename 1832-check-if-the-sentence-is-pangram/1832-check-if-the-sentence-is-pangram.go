func checkIfPangram(sentence string) bool {
    check:=make([]bool, 26)
    for _, s:=range sentence {
        check[s-'a']=true
    }
    for i:=0;i<26;i++ {
        if !check[i] {
            return false
        }
    }
    return true
}