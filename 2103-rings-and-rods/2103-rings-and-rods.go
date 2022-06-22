func countPoints(rings string) int {
    color:=make(map[byte]map[byte]bool)
    for i:=0; i<len(rings);i=i+2 {
        if _, ok:= color[rings[i+1]]; !ok {
            color[rings[i+1]]=make(map[byte]bool)
        }
        color[rings[i+1]][rings[i]]=true
    }
    count:=0
    for _, v:=range color {
        if len(v)==3 {
            count++
        }
    }
    return count
}