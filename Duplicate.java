public class Duplicate{
    static boolean isDuplicate(String s) {
    return check(s, 0, s.length());
}

// checks the part of s that starts at "start" and has "len" characters
static boolean check(String s, int start, int len) {
    if (len == 0) return true;          
    if (len % 2 == 1) return false;     
    int half = len / 2;
    for (int i = 0; i < half; i++) {    
        if (s.charAt(start + i) != s.charAt(start + half + i))
            return false;
    }

    
    return check(s, start + 1, half - 1);
}

}
