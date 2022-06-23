func convertToTitle(columnNumber int) string {
    var res = ""
    for columnNumber > 0 {
        var mod = (columnNumber - 1) % 26
        res = string('A' + mod) + res
        columnNumber = (columnNumber - 1) / 26
    }
    
    return res
}
