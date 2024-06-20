// Roman to Integer 
// Time Complexity : O(N)
fun romanToInt(s: String): Int {
    val romanNumerals = mapOf('I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)

    var sum = romanNumerals.getValue(s[s.length-1])
    for(i in s.length-2 downTo 0){
        if(romanNumerals.getValue(s[i])>sum || romanNumerals.getValue(s[i])==romanNumerals.getValue(s[i+1]) ){
            sum+=romanNumerals.getValue(s[i])
        }else{
            sum-=romanNumerals.getValue(s[i])
        }
    }
    return sum
}
